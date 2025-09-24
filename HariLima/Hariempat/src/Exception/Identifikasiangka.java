/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exception;

/**
 *
 * @author MS
 */
    class MyNullPointerException extends NullPointerException {
    public MyNullPointerException(String message) {
        super(message); 
    }
}

    public class Identifikasiangka {
    private int angka;

    public Identifikasiangka(String data) {
        if (data == null) {
            throw new MyNullPointerException("Data tidak boleh bernilai null (dari constructor)!");
        }
        this.angka = Integer.parseInt(data);
    }

    public void tampilkan() {
        System.out.println("Angka valid: " + angka);
    }

    public static void main(String[] args) {
        try {
  
            Identifikasiangka obj1 = new Identifikasiangka("80");
            obj1.tampilkan();

            Identifikasiangka obj2 = new Identifikasiangka("abc");
            obj2.tampilkan();

        } catch (MyNullPointerException e) {
            System.out.println("Custom Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Input bukan angka yang valid!");
        }
    }
}



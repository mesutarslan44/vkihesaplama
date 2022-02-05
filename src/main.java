import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double kg, boy, c;
        double vki;


        Scanner girdi = new Scanner(System.in);

        System.out.println("Vücut Kitle İndeksi Hesaplama");
        System.out.println("-------------------------");

        System.out.println("Lütfen boyunuzu (metre cinsinden Örneğin; 1,83 (Virgül Kullan Burası Önemli !!!) giriniz  ");
        boy= girdi.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kg= girdi.nextDouble();


        vki= kg / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : " + vki);

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,kilo, vKE;

        Scanner inp = new Scanner(System.in);
        System.out.print("Boyunuzu (metre cinsinden) giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        vKE = kilo/(boy*boy);

        System.out.println("Vucüt kitle endeksiniz : " + vKE);
    }
}
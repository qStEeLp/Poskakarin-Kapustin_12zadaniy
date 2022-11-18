import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] massiv;
        Scanner in = new Scanner(System.in);
        massiv = new int[6];
        massiv[0] = 1;
        massiv[1] = 2;
        massiv[2] = 3;
        massiv[3] = -1;
        massiv[4] = 5;

        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
        System.out.println("Naoborot:");
        int o = massiv.length - 1;
        while (o >= 0) {
            System.out.println(massiv[o]);
            o = o - 1;
        }
        System.out.println("3 zadacha:");
        for (int p = 0; p < massiv.length; p++) {
            if (massiv[p] % 2 == 0) {
                System.out.println(massiv[p]);
            }
        }
        System.out.println("zada4a 4:");
        for (int z = 0; z < massiv.length; z++) {
            if (massiv[z] % 2 != 0) {
                System.out.println(massiv[z]);
            }
        }
        System.out.println("zadacha 5:");
        for (int x = 0; x < massiv.length; x++) {

            System.out.println(massiv[x]);
            if (massiv[x] == -1) break;
        }
        System.out.println("zada4a 6:");
        System.out.println("Kakoe zna4enie vbI hotite dobavit' v konec massiva?");
        int hy = in.nextInt();
        massiv[5] = hy;
        for (int ma = 0; ma < massiv.length; ma++) {
            System.out.println(massiv[ma]);
        }
        System.out.println("zada4a 7:");
        System.out.println("Kakoe zna4enie vbI hotite dobavit' v na4alo massiva?");
        int hyy = in.nextInt();
        massiv[0] = hyy;
        for (int may = 0; may < massiv.length; may++) {
            System.out.println(massiv[may]);
        }
        System.out.println("zada4a 8:");
        System.out.println("Kakoe zna4enie vbI hotite dobavit' v 94euky 4?");
        int hyyi = in.nextInt();
        massiv[3] = hyyi;
        for (int mayi = 0; mayi < massiv.length; mayi++) {
            System.out.println(massiv[mayi]);
        }
        System.out.println("zada4a 9:");
        int del = 0;
        massiv[5] = del;
        for (int mayil = 0; mayil < massiv.length; mayil++) {
            System.out.println(massiv[mayil]);
        }
        System.out.println("zada4a 10:");
        massiv[0] = del;
        for (int mayilr = 0; mayilr < massiv.length; mayilr++) {
            System.out.println(massiv[mayilr]);
        }
        System.out.println("zada4a 11:");
        System.out.println("Kakyu 94euky vbI hotite onulirovat'? (ot 0 do 5)");
        int pols = in.nextInt();
        massiv[pols] = del;
        for (int mayilru = 0; mayilru < massiv.length; mayilru++) {
            System.out.println(massiv[mayilru]);
        }
        System.out.println("zada4a 12:");
        System.out.println("Coming soon...");
    }
}
// Ne stav'te 2 П}|{


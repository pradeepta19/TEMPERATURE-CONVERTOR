import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        int temp;
        int newTemp=0;
        String unit;

        System.out.println("ENTER THE TEMPERATURE YOU WISH TO CONVERT:");
        temp=scanner.nextInt();
        System.out.println("SELECT THE UNIT OF THE TEMPERATURE (C/F):");
        unit = scanner.next().toUpperCase();

        newTemp=(unit.equals("F"))?((temp-32)*5/9):((temp*9/5)+32);

        System.out.println("THE TEMPERATURE IS : " + newTemp + (unit.equals("F")?"C":"F") );

        scanner.close();





    }

}
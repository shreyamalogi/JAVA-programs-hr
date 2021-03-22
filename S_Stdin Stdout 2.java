//https://www.hackerrank.com/challenges/java-stdin-stdout/problem
//author: shreyamalogi

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s="";
        while(scan.hasNext())
        {
            s=scan.nextLine();
        }
      
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

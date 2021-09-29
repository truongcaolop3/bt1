/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x;
        
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        
        if (x%2==0)
        {
            System.out.println(" số chẵn!");
        }else System.out.println(" số lẽ!");
    }
    
}

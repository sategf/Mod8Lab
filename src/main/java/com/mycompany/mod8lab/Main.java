/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mod8lab;

/**
 *
 * @author itlabs
 */
public class Main {
    public static void methodC() throws ExceptionC{
        System.out.println("Welcome to exception C");
        throw new ExceptionC("ExceptionB is thrown");
        
    }
    public static void methodB() throws ExceptionB{
        System.out.println("Welcome to exception B");
        throw new ExceptionB("ExceptionB is thrown");
        
    }
    public static void main(String[] args) {
        
        
         System.out.println("Before try");
        try{
            System.out.println("About to try ExceptionB");
            methodB();
        }
        catch (ExceptionC ec){
            System.out.println("Caught with exception C");
        }    
        catch (ExceptionA ea){
            System.out.println("Caught with exception A");
        }    
        finally {
            System.out.println("Finally...");
        }
    }
}

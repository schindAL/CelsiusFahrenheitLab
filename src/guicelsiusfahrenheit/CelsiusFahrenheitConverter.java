/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicelsiusfahrenheit;

/**
 *
 * @author Alec
 */
public class CelsiusFahrenheitConverter {
    
    public CelsiusFahrenheitConverter (){
   
    }
    public final double calculateToCelsius(double temperature){
        double newTemp = (temperature - 32)*5/9;
        return newTemp;  
    }
    public final double calculateToFahrenheit(double temperature){
        double newTemp = (temperature*9/5)+32;      
        return newTemp;  
    }
}

import java.util.*;


public class n6ejercicio2 {

    public static void main(String[] args) {

        Persona dataPersona = new Persona("Sarah", "Connor", 29);

        GenericMethods callGeneric = new GenericMethods();

        callGeneric.printElements("Hola", dataPersona, 2024);
        callGeneric.printElements(dataPersona, "Es verdad", true);
        callGeneric.printElements(1.36,dataPersona,"T-1000");

    }
}
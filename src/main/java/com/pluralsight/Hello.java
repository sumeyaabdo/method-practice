package com.pluralsight;

public class Hello {
    public static void main(String[] args) {

        sayHello();
        sayGoodbye();
        sayGoodMorning();
    }

    //other methods go below this comment

    // make a method called sayHello that prints hello world
    public static void sayHello() {
        System.out.println("Hello World!");
    }

    // male a method called sayGoodbye that prints Goodbye!
    public static void sayGoodbye() {
        System.out.println("Goodbye World!");
    }

    //create a method called sayGoodMorning that prints Good Morning!
    public static void sayGoodMorning() {
        System.out.println("Good morning!");
    }

}

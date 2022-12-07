import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        String fullName = "Ivan Ivanovich Ivanov";
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое имя:");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }

    public static void task5() {
        System.out.println("\nЗадача 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру:");
        int temperature = scanner.nextInt();
        System.out.println("Температура воздуха сегодня: " + temperature + " градусов.");
    }

    public static void task6() {
        System.out.println("\nЗадача 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        System.out.println("Введите месяц:");
        int month = scanner.nextInt();
        System.out.println("Введите день:");
        int day = scanner.nextInt();
        System.out.println(day + ":" + month + ":" + year);
    }

    public static void task7() {
        System.out.println("\nЗадача 7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите имя помошника:");
        String nameOfHelper = scanner.nextLine();
        System.out.println("Введите количество сообщений:");
        String quantityMesseges = scanner.nextLine();
        System.out.println("Привет, " + name + "! Это твой помощник " + nameOfHelper + ".\nУ тебя " + quantityMesseges + " новых писем." );
    }
}
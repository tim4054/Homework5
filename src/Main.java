public class Main {
    public static void main(String[] args) {

        System.out.println("task1");
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        System.out.println("_______________________________________________");

        System.out.println("task2");
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        System.out.println("_______________________________________________");

        System.out.println("task3");
        int year =1584;
        int x = year % 4;
        int y = year % 400;
        int z = year % 100;
        boolean leapYear = x == 0 && (y == 0 || z != 0);
        if (year >= 1584) {
            if (leapYear) {
                System.out.printf("%s - високосный год\n", year);
            } else {
                System.out.printf("%s - невисокосный год\n", year);
            }
        } else {
            System.out.println("Високосные года начинаются с 1584 года");
        }
        System.out.println("_______________________________________________");

        System.out.println("task4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("_______________________________________________");

        System.out.println("task5");
        int monthNumber = 1;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц принадлежит сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит сезону весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит сезону лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит сезону осень ");
                break;
            default:
                System.out.println("Номер месяца больше 12");
        }
        if (monthNumber < 1) {
            System.out.println("Номер месяца меньше 1");
        }
    }
}
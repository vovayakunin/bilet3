public class Main {
    public static void main(String[] args) {

        System.out.println("Задача: получить половину строки");
        String source = "Привет, друзья!";
        String head = "";
        String tail = "";
        System.out.println("Исходная строка: " + source);

        // Проверим, не короткая ли строка, и дополним пробелами, если нужно
        while (source.length() < 2) {
            source = source + " ";
        }

        //Проверим, вдруг длина строки нечетная. Тогда дополним пробелом.
        if (source.length() % 2 == 1) {
            source = source + " ";
        }

        head = source.substring(0, source.length() / 2);
        tail = source.substring(source.length() / 2, source.length());

        System.out.println("Первая половина: " + head);
        System.out.println("Вторая половина: " + tail);

    }
}
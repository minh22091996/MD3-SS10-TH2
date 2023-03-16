package rikkei;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedLis number = new MyLinkedLis(10);
        number.addFirst(13);
        number.addFirst(12);
        number.addFirst(11);

        number.printList();
        number.add(4,9);
        number.add(4,9);
    }
}

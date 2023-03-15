public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorCallback = System.out::println;

        Worker worker = new Worker(listener, errorCallback);
        worker.start();
    }
}
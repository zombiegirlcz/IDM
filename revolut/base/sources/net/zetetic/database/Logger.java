package net.zetetic.database;

/* JADX INFO: loaded from: classes14.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static LogTarget f214671a = new LogcatTarget();

    public static void a(String str, String str2, Exception exc2) {
        b().b(6, str, str2, exc2);
    }

    public static LogTarget b() {
        if (f214671a == null) {
            f214671a = new NoopTarget();
        }
        return f214671a;
    }
}

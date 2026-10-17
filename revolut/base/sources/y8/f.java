package y8;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final td.d f311599a = new td.d(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final td.d f311600b = new td.d(2);

    public static void a(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(Object obj2) {
        c(obj2, "Argument must not be null");
    }

    public static void c(Object obj2, String str) {
        if (obj2 == null) {
            throw new NullPointerException(str);
        }
    }
}

package j9;

/* JADX INFO: loaded from: classes16.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a61.a f172248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f172249b;

    static {
        boolean zEquals;
        try {
            zEquals = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            zEquals = false;
        }
        f172248a = zEquals ? k.f172270a : null;
        f172249b = new ThreadLocal();
    }
}

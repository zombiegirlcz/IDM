package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class a1 extends ecm.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f142555a;

    static {
        boolean z = false;
        try {
            Class.forName("android.app.Application", false, a1.class.getClassLoader());
            z = true;
        } catch (Exception unused) {
        }
        f142555a = z;
    }
}

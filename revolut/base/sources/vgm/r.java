package vgm;

/* JADX INFO: loaded from: classes14.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f289250a;

    static {
        boolean zEquals = true;
        try {
            String property = System.getProperty("rx3.purge-enabled");
            if (property != null) {
                zEquals = "true".equals(property);
            }
        } catch (Throwable th10) {
            ce9.m.F(th10);
        }
        f289250a = zEquals;
    }
}

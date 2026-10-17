package c72;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21838a;

    static {
        int[] iArr = new int[c.values().length];
        f21838a = iArr;
        try {
            iArr[c.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f21838a[c.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f21838a[c.USED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f21838a[c.EXPIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f21838a[c.CANCELLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}

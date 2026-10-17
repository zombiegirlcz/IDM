package ei;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f126328a;

    static {
        int[] iArr = new int[c.values().length];
        f126328a = iArr;
        try {
            iArr[c.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f126328a[c.BYTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f126328a[c.NUMERIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

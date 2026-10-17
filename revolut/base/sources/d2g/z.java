package d2g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f110831a;

    static {
        int[] iArr = new int[lyf.c.values().length];
        try {
            iArr[lyf.c.COMPLETE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lyf.c.PARTIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lyf.c.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f110831a = iArr;
    }
}

package fcf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f133741a;

    static {
        int[] iArr = new int[lbf.c.values().length];
        try {
            iArr[lbf.c.ANNUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lbf.c.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lbf.c.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f133741a = iArr;
    }
}

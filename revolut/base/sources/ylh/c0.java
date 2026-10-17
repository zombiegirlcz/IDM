package ylh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314713a;

    static {
        int[] iArr = new int[w.values().length];
        try {
            iArr[w.ALL_TIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w.MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[w.TAX_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f314713a = iArr;
    }
}

package g1i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f139642b;

    static {
        int[] iArr = new int[wd6.e.values().length];
        try {
            iArr[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f139641a = iArr;
        int[] iArr2 = new int[wd6.d.values().length];
        try {
            iArr2[wd6.d.FX.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wd6.d.COMMODITIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f139642b = iArr2;
    }
}

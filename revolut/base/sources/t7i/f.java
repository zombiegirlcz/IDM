package t7i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f268720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f268721b;

    static {
        int[] iArr = new int[j8l.a.values().length];
        try {
            iArr[j8l.a.INVEST_CASH_HOLDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f268720a = iArr;
        int[] iArr2 = new int[j8l.d.values().length];
        try {
            iArr2[j8l.d.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[j8l.d.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f268721b = iArr2;
    }
}

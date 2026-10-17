package g4h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140528a;

    static {
        int[] iArr = new int[j3h.c.values().length];
        try {
            iArr[j3h.c.CRYPTO_ETN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j3h.c.RETAIL_FUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j3h.c.PRIVATE_BANK_FUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f140528a = iArr;
    }
}

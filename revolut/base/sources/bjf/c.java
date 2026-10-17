package bjf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15657a;

    static {
        int[] iArr = new int[lhf.a.values().length];
        try {
            iArr[lhf.a.RETAIL_TRANSACTIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lhf.a.CRYPTO_EXCHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f15657a = iArr;
    }
}

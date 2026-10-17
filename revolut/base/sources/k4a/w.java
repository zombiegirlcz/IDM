package k4a;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f180892a;

    static {
        int[] iArr = new int[g3a.e.values().length];
        try {
            iArr[g3a.e.PAYMENTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g3a.e.CRYPTO_SEND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g3a.e.BALANCE_TRANSFER_CREDIT_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f180892a = iArr;
    }
}

package g3a;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140245a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.CRYPTO_SEND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.PAYMENTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.BALANCE_TRANSFER_CREDIT_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f140245a = iArr;
    }
}

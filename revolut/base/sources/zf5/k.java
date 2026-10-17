package zf5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f321878a;

    static {
        int[] iArr = new int[lf5.b.values().length];
        try {
            iArr[lf5.b.ORDER_REVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lf5.b.TRANSACTION_DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lf5.b.DEEPLINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[lf5.b.CRYPTO_SETTINGS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f321878a = iArr;
    }
}

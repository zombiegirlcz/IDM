package dec;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f113376a;

    static {
        int[] iArr = new int[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.values().length];
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.POCKETS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.SAVINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.CRYPTO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.COMMODITIES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.ACCOUNTS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f113376a = iArr;
    }
}

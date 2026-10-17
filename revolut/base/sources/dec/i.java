package dec;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f113368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f113369b;

    static {
        int[] iArr = new int[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.i.values().length];
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.i.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.i.SAVINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.i.SAVINGS_EXTERNAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.i.SAVINGS_INTEREST_BEARING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.i.CREDIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.i.MERCHANT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f113368a = iArr;
        int[] iArr2 = new int[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.values().length];
        try {
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.FIAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.COMMODITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f113369b = iArr2;
    }
}

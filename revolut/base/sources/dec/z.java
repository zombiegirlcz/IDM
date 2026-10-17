package dec;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f113384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f113385b;

    static {
        int[] iArr = new int[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.values().length];
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.BUSINESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.PERSONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.PERSONAL_JOINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f113384a = iArr;
        int[] iArr2 = new int[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.values().length];
        try {
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.ACCOUNTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.POCKETS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.SAVINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.CREDIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.CRYPTO.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.COMMODITIES.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        f113385b = iArr2;
    }
}

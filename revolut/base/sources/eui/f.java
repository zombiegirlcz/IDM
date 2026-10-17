package eui;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f129616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f129617b;

    static {
        int[] iArr = new int[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.values().length];
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.FIAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.COMMODITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f129616a = iArr;
        int[] iArr2 = new int[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.values().length];
        try {
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.CREDIT.ordinal()] = 1;
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
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.CRYPTO.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.COMMODITIES.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.ACCOUNTS.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        f129617b = iArr2;
    }
}

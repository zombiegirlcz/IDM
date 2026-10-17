package gac;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f142135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f142136b;

    static {
        int[] iArr = new int[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.values().length];
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.BUSINESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f142135a = iArr;
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
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.CREDIT.ordinal()] = 3;
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
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.SAVINGS.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        f142136b = iArr2;
    }
}

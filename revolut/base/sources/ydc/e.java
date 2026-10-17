package ydc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f312673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f312674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f312675c;

    static {
        int[] iArr = new int[m6c.b.values().length];
        try {
            iArr[m6c.b.PAY_NOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m6c.b.PAY_LATER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f312673a = iArr;
        int[] iArr2 = new int[n6c.a.values().length];
        try {
            iArr2[n6c.a.REVOLUT_LTD.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[n6c.a.REVOLUT_BANK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[n6c.a.EEA_BUAB.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[n6c.a.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f312674b = iArr2;
        int[] iArr3 = new int[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.values().length];
        try {
            iArr3[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.COMMODITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.FIAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f312675c = iArr3;
    }
}

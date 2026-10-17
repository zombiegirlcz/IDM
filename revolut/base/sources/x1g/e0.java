package x1g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f302412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f302413b;

    static {
        int[] iArr = new int[x3g.b.values().length];
        try {
            iArr[x3g.b.FULL_REFUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x3g.b.PARTIAL_REFUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x3g.b.NO_REFUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f302412a = iArr;
        int[] iArr2 = new int[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.values().length];
        try {
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.FIAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.COMMODITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f302413b = iArr2;
    }
}

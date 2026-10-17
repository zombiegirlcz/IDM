package wbg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f296158a;

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
        f296158a = iArr;
    }
}

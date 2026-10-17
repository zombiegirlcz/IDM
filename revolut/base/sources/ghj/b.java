package ghj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f143943a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.FIAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.COMMODITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f143943a = iArr;
    }
}

package nya;

import com.revolut.feature.referrals.common.data.api.domain.model.common.Upsell;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f220747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f220748b;

    static {
        int[] iArr = new int[pwa.n.values().length];
        try {
            iArr[pwa.n.CRYPTO_INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pwa.n.STANDARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pwa.n.RETAIL_TO_BUSINESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pwa.n.JUNIOR_TO_JUNIOR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[pwa.n.PAPER_TRADING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[pwa.n.PRO_INTERNAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[pwa.n.SALARY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f220747a = iArr;
        int[] iArr2 = new int[Upsell.Type.values().length];
        try {
            iArr2[Upsell.Type.PRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[Upsell.Type.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[Upsell.Type.INVEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[Upsell.Type.CREDIT_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[Upsell.Type.SAVINGS.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[Upsell.Type.DEFAULT.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        f220748b = iArr2;
    }
}

package jmb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f176517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f176518b;

    static {
        int[] iArr = new int[ncd.g.values().length];
        try {
            iArr[ncd.g.SAVINGS_DEPOSITS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ncd.g.SAVINGS_FIXED_TERM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ncd.g.SAVINGS_MMF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f176517a = iArr;
        int[] iArr2 = new int[com.revolut.feature.shared.savings.models.product.e.values().length];
        try {
            iArr2[com.revolut.feature.shared.savings.models.product.e.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[com.revolut.feature.shared.savings.models.product.e.EVERY_DAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[com.revolut.feature.shared.savings.models.product.e.EVERY_WORKING_DAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[com.revolut.feature.shared.savings.models.product.e.ONCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[com.revolut.feature.shared.savings.models.product.e.EVERY_MONTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        f176518b = iArr2;
    }
}

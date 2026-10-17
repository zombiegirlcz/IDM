package dzj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121353a;

    static {
        int[] iArr = new int[com.revolut.retail.feature.limits.api.navigation.a.values().length];
        try {
            iArr[com.revolut.retail.feature.limits.api.navigation.a.FX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.retail.feature.limits.api.navigation.a.WALLET_DAILY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.retail.feature.limits.api.navigation.a.WALLET_WEEKLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[com.revolut.retail.feature.limits.api.navigation.a.YEARLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[com.revolut.retail.feature.limits.api.navigation.a.ATM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f121353a = iArr;
    }
}

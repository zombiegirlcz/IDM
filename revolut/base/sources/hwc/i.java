package hwc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f156129a;

    static {
        int[] iArr = new int[com.revolut.feature.wallets.api.module.a.values().length];
        try {
            iArr[com.revolut.feature.wallets.api.module.a.TRANSFER_DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.TRANSFER_WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.MONETISATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.STOCK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.FLOW.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f156129a = iArr;
    }
}

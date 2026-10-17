package ewc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f130158a;

    static {
        int[] iArr = new int[com.revolut.feature.wallets.api.module.a.values().length];
        try {
            iArr[com.revolut.feature.wallets.api.module.a.BRL_TO_USD_EXCHANGE_YEARLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.INBOUND_TRANSFER_YEARLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f130158a = iArr;
    }
}

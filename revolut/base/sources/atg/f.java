package atg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9046a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.ALL_WALLETS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.WALLET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f9046a = iArr;
    }
}

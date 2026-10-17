package iug;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168601a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.TRADING_ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.PRIVATE_MARKETS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f168601a = iArr;
    }
}

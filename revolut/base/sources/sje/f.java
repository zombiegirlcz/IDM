package sje;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f263715a;

    static {
        int[] iArr = new int[qf1.f.values().length];
        try {
            iArr[qf1.f.CRYPTO_TRADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qf1.f.CRYPTO_EARN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qf1.f.CRYPTO_STRATEGIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[qf1.f.CRYPTO_REVOLUT_X.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f263715a = iArr;
    }
}

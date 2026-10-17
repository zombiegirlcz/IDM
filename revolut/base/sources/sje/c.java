package sje;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f263713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f263714b;

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
            iArr[qf1.f.CRYPTO_LEARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[qf1.f.CRYPTO_STRATEGIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[qf1.f.CRYPTO_REVOLUT_X.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f263713a = iArr;
        int[] iArr2 = new int[vtd.a.values().length];
        try {
            iArr2[vtd.a.AER.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[vtd.a.APY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f263714b = iArr2;
    }
}

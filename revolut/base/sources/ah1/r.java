package ah1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4870a;

    static {
        int[] iArr = new int[jg1.g.values().length];
        try {
            iArr[jg1.g.GOOGLE_PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jg1.g.APPLE_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jg1.g.SAMSUNG_WALLET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f4870a = iArr;
    }
}

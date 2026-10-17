package ryj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f258428a;

    static {
        int[] iArr = new int[u09.v.values().length];
        try {
            iArr[u09.v.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u09.v.APP_TIPS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u09.v.FRAUD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[u09.v.TRADING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[u09.v.PRO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[u09.v.YOUTH_TRADING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f258428a = iArr;
    }
}

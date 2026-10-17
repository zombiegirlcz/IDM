package uwa;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f283584a;

    static {
        int[] iArr = new int[pwa.n.values().length];
        try {
            iArr[pwa.n.STANDARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pwa.n.CRYPTO_INTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pwa.n.RETAIL_TO_BUSINESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pwa.n.SALARY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[pwa.n.JUNIOR_TO_JUNIOR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[pwa.n.PAPER_TRADING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[pwa.n.PRO_INTERNAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f283584a = iArr;
    }
}

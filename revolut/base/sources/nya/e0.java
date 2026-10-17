package nya;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f220729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f220730b;

    static {
        int[] iArr = new int[pwa.n.values().length];
        try {
            iArr[pwa.n.CRYPTO_INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pwa.n.PRO_INTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pwa.n.STANDARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pwa.n.RETAIL_TO_BUSINESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[pwa.n.SALARY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[pwa.n.JUNIOR_TO_JUNIOR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[pwa.n.PAPER_TRADING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f220729a = iArr;
        int[] iArr2 = new int[pwa.i.values().length];
        try {
            iArr2[pwa.i.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[pwa.i.PAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        f220730b = iArr2;
    }
}

package ael;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f3685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f3686c;

    static {
        int[] iArr = new int[ybl.n.values().length];
        try {
            iArr[ybl.n.PDF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ybl.n.EXCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f3684a = iArr;
        int[] iArr2 = new int[ybl.m.values().length];
        try {
            iArr2[ybl.m.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ybl.m.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ybl.m.COMMODITIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f3685b = iArr2;
        int[] iArr3 = new int[wbl.n.values().length];
        try {
            iArr3[wbl.n.READY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[wbl.n.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[wbl.n.IN_PREPARATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f3686c = iArr3;
    }
}

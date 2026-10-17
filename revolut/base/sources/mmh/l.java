package mmh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f207234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f207235b;

    static {
        int[] iArr = new int[vmh.f.values().length];
        try {
            iArr[vmh.f.STRUCTURED_NOTES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vmh.f.STOCKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vmh.f.ETFS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vmh.f.BONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[vmh.f.CFD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[vmh.f.MUTUAL_FUNDS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[vmh.f.COMMODITY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[vmh.f.PRIVATE_MARKETS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[vmh.f.STRATEGIES.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f207234a = iArr;
        int[] iArr2 = new int[nmh.a.values().length];
        try {
            iArr2[nmh.a.STRUCTURED_NOTES.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        f207235b = iArr2;
    }
}

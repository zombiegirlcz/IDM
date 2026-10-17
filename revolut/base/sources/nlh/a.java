package nlh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f217137a;

    static {
        int[] iArr = new int[sih.b.values().length];
        try {
            iArr[sih.b.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sih.b.COMMODITIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[sih.b.BONDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[sih.b.MARGIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[sih.b.ETFs.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[sih.b.PRIVATE_MARKETS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[sih.b.MUTUAL_FUNDS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f217137a = iArr;
    }
}

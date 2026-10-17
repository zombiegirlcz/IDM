package d4f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f111303a;

    static {
        int[] iArr = new int[ybl.p.values().length];
        try {
            iArr[ybl.p.TRADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ybl.p.ROBO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ybl.p.SAVINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ybl.p.BONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ybl.p.COMMODITIES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f111303a = iArr;
    }
}

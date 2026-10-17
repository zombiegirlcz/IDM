package zrd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f324711b;

    static {
        int[] iArr = new int[yld.c.values().length];
        try {
            iArr[yld.c.PIE_CHART.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yld.c.LINE_CHART.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yld.c.BAR_CHART.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f324710a = iArr;
        int[] iArr2 = new int[yld.g.values().length];
        try {
            iArr2[yld.g.ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yld.g.LIABILITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f324711b = iArr2;
    }
}

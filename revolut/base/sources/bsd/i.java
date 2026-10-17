package bsd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f18173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f18174c;

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
        f18172a = iArr;
        int[] iArr2 = new int[yld.g.values().length];
        try {
            iArr2[yld.g.ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yld.g.LIABILITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f18173b = iArr2;
        int[] iArr3 = new int[amd.a.values().length];
        try {
            iArr3[amd.a.MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[amd.a.SIX_MONTHS.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[amd.a.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[amd.a.MAX.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[amd.a.WEEK.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f18174c = iArr3;
    }
}

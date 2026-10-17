package x0b;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f301543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f301544b;

    static {
        int[] iArr = new int[c1b.k.values().length];
        try {
            iArr[c1b.k.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c1b.k.FIVE_DAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c1b.k.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c1b.k.THREE_MONTHS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c1b.k.SIX_MONTHS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[c1b.k.YEAR_TO_DATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[c1b.c.values().length];
        try {
            iArr2[c1b.c.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[c1b.c.REVX.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[c1b.c.STOCKS.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f301543a = iArr2;
        int[] iArr3 = new int[c1b.d.values().length];
        try {
            iArr3[c1b.d.ONLY_STYLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[c1b.d.SUPPORTED_IN_EMBEDDED_CHART.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[c1b.d.SUPPORTED_IN_FULLSCREEN_CHART.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        f301544b = iArr3;
    }
}

package d6j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f111607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f111608b;

    static {
        int[] iArr = new int[y5j.b.values().length];
        try {
            iArr[y5j.b.LINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y5j.b.CANDLESTICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f111607a = iArr;
        int[] iArr2 = new int[qta.f.values().length];
        try {
            iArr2[qta.f.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[qta.f.WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[qta.f.MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[qta.f.THREE_MONTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[qta.f.SIX_MONTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[qta.f.YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[qta.f.FIVE_YEARS.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[qta.f.ALL.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        f111608b = iArr2;
    }
}

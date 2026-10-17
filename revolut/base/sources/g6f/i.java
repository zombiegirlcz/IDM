package g6f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140928a;

    static {
        int[] iArr = new int[pdh.c.values().length];
        try {
            iArr[pdh.c.ONE_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pdh.c.SIX_MONTHS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pdh.c.YEAR_TO_DATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pdh.c.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[pdh.c.FIVE_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[pdh.c.TEN_YEARS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f140928a = iArr;
    }
}

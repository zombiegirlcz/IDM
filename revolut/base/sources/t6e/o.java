package t6e;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f268323a;

    static {
        int[] iArr = new int[jli.c.values().length];
        try {
            iArr[jli.c.PERIOD_SELECTION_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jli.c.PERIOD_SELECTION_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jli.c.PERIOD_SELECTION_BI_WEEKLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[jli.c.PERIOD_SELECTION_MONTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[jli.c.PERIOD_SELECTION_YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f268323a = iArr;
    }
}

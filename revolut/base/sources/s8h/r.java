package s8h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261031a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[f.FIVE_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f261031a = iArr;
    }
}

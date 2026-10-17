package u9j;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f278494a;

    static {
        int[] iArr = new int[qta.f.values().length];
        try {
            iArr[qta.f.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qta.f.WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qta.f.MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[qta.f.SIX_MONTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[qta.f.YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[qta.f.FIVE_YEARS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[qta.f.ALL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f278494a = iArr;
    }
}

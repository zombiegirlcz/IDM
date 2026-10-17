package f28;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f131458a;

    static {
        int[] iArr = new int[h0.values().length];
        try {
            iArr[h0.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h0.WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h0.MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h0.HALF_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h0.YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[h0.ALL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f131458a = iArr;
    }
}

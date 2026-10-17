package mae;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f204028a;

    static {
        int[] iArr = new int[fva.e.values().length];
        try {
            iArr[fva.e.ADHOC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fva.e.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fva.e.BI_WEEKLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[fva.e.MONTHLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[fva.e.QUARTERLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[fva.e.HALF_YEARLY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[fva.e.YEARLY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f204028a = iArr;
    }
}

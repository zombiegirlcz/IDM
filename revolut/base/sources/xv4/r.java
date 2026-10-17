package xv4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f309202a;

    static {
        int[] iArr = new int[em4.g.values().length];
        try {
            iArr[em4.g.DayZero.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[em4.g.Overdue.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[em4.g.NotPaid.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[em4.g.MinPaid.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[em4.g.PaidLessThanMin.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[em4.g.PaidInFull.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[em4.g.Terminated.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f309202a = iArr;
    }
}

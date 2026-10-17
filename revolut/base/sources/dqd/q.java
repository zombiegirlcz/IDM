package dqd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f116954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f116955b;

    static {
        int[] iArr = new int[aqd.o.values().length];
        try {
            iArr[aqd.o.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[aqd.o.FORCE_RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[aqd.o.FORCE_ONE_OFF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f116954a = iArr;
        int[] iArr2 = new int[aqd.q.values().length];
        try {
            iArr2[aqd.q.UPDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[aqd.q.MANUAL_EXECUTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[aqd.q.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f116955b = iArr2;
    }
}

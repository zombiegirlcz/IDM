package zh9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f322348a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.SCHEDULED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.OUTSTANDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o.OVERDUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[o.REPAID.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f322348a = iArr;
    }
}

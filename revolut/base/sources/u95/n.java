package u95;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f278394a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.RESTRICTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.LIMIT_EXCEEDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o.WARNING_THRESHOLD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o.NORMAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f278394a = iArr;
    }
}

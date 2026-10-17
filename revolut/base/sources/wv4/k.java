package wv4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f300298a;

    static {
        int[] iArr = new int[xw4.a.values().length];
        try {
            iArr[xw4.a.OVERDUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xw4.a.LIMIT_EXCEEDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xw4.a.HEALTHY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[xw4.a.TERMINATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f300298a = iArr;
    }
}

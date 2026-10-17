package zh9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f322344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f322345b;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.Healthy.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.Outstanding.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.Overdue.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f322344a = iArr;
        int[] iArr2 = new int[e.values().length];
        try {
            iArr2[e.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[e.Cancelled.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[e.Terminated.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f322345b = iArr2;
    }
}

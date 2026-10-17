package z25;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f318962a;

    static {
        int[] iArr = new int[zh9.e.values().length];
        try {
            iArr[zh9.e.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zh9.e.Cancelled.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zh9.e.Terminated.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f318962a = iArr;
    }
}

package y1f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f310376a;

    static {
        int[] iArr = new int[u2f.a.values().length];
        try {
            iArr[u2f.a.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u2f.a.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f310376a = iArr;
    }
}

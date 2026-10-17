package dy1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121042a;

    static {
        int[] iArr = new int[wx1.b.values().length];
        f121042a = iArr;
        try {
            iArr[wx1.b.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f121042a[wx1.b.DELETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}

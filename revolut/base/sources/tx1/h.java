package tx1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f275311a;

    static {
        int[] iArr = new int[wx1.c.values().length];
        f275311a = iArr;
        try {
            iArr[wx1.c.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f275311a[wx1.c.DELETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f275311a[wx1.c.NOT_REGISTERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

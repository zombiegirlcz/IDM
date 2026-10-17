package cu8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108835a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.FAILED_ADDRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.NOT_VERIFIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f108835a = iArr;
    }
}

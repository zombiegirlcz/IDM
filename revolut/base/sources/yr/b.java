package yr;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f316043a;

    static {
        int[] iArr = new int[xr.a.values().length];
        try {
            iArr[xr.a.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xr.a.UPDATE_TOKEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xr.a.NETWORK_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[xr.a.FILE_ABSENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f316043a = iArr;
    }
}

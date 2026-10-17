package ce9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23432a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.LOAD_NEXT_PAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.REFRESH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.FORCE_REFRESH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n.RETRY_LAST_PAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f23432a = iArr;
    }
}

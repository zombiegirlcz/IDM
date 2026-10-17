package bzk;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20055a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.DECLINED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.INFO_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.RETRY_LIMIT_REACHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f20055a = iArr;
    }
}

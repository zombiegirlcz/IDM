package rc4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f253191a;

    static {
        int[] iArr = new int[ju3.e.values().length];
        try {
            iArr[ju3.e.RETRY_INCOME_CHECK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ju3.e.IGNORE_INCOME_CHECK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ju3.e.CLOSE_APPLICATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ju3.e.CLOSE_SCREEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f253191a = iArr;
    }
}

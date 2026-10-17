package xd;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f304194a;

    static {
        int[] iArr = new int[c.values().length];
        f304194a = iArr;
        try {
            iArr[c.DEFAULT_APP_CHECK_TOKEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f304194a[c.UNKNOWN_APP_CHECK_TOKEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}

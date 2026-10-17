package ifk;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f161038a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.DEEPLINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.CONTINUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.CANCEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f161038a = iArr;
    }
}

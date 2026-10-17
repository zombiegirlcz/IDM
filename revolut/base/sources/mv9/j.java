package mv9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f209186a;

    static {
        int[] iArr = new int[ev9.a.values().length];
        try {
            iArr[ev9.a.LOCAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ev9.a.REMOTE_SINGLE_FETCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ev9.a.REMOTE_POLLING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f209186a = iArr;
    }
}

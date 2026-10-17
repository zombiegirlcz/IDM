package fcf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f133729a;

    static {
        int[] iArr = new int[gcf.a.values().length];
        try {
            iArr[gcf.a.INITIAL_SUBSCRIBE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gcf.a.CANCEL_UNSUBSCRIBE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f133729a = iArr;
    }
}

package hfj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f151920a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.SKIP_IF_NO_SUBSCRIPTIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.ALWAYS_INCLUDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f151920a = iArr;
    }
}

package dr3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f117084a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.PLAY_ONCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.LOOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f117084a = iArr;
    }
}

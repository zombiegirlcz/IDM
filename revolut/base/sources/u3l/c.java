package u3l;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f276950a;

    static {
        int[] iArr = new int[t3l.a.values().length];
        try {
            iArr[t3l.a.BY_SWIPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t3l.a.BY_TIMEOUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t3l.a.BY_DISMISS_METHOD_CALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[t3l.a.BY_NEXT_SNACKBAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f276950a = iArr;
    }
}

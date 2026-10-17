package bs9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18101a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.REVERSED_CONTENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.BIASED_EMPTY_STATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.TOP_ANCHORED_EMPTY_STATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f18101a = iArr;
    }
}

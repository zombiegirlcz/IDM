package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f166408a;

    static {
        int[] iArr = new int[r.values().length];
        try {
            iArr[r.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r.REGULAR_NO_BACKGROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r.ACCENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f166408a = iArr;
    }
}

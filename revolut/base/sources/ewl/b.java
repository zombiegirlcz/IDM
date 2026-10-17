package ewl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f130323a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.FULL_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.NEXT_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.TOOLBAR_NEXT_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f130323a = iArr;
    }
}

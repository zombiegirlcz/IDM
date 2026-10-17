package tx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f275085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f275086b;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.SHRINK_BY_ACTION_VIEWS_HEIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f275085a = iArr;
        int[] iArr2 = new int[n.values().length];
        try {
            iArr2[n.CONTEXTUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[n.WHITE_OR_BLACK_INVERTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[n.REFLECTIVE_SURFACE.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        f275086b = iArr2;
    }
}

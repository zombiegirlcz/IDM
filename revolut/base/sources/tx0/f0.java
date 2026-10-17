package tx0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f275116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f275117b;

    static {
        int[] iArr = new int[e0.values().length];
        try {
            iArr[e0.TITLE_AND_SUBTITLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e0.SUBTITLE_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f275116a = iArr;
        int[] iArr2 = new int[d0.values().length];
        try {
            iArr2[d0.WINDOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[d0.TRANSPARENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[d0.OVERLAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f275117b = iArr2;
    }
}

package e0f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f121588b;

    static {
        int[] iArr = new int[bgf.c.values().length];
        try {
            iArr[bgf.c.WARNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bgf.c.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f121587a = iArr;
        int[] iArr2 = new int[y0.values().length];
        try {
            iArr2[y0.Warning.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[y0.Waiting.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f121588b = iArr2;
    }
}

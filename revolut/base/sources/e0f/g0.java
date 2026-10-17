package e0f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f121604b;

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
        f121603a = iArr;
        int[] iArr2 = new int[c0.values().length];
        try {
            iArr2[c0.Warning.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[c0.Waiting.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f121604b = iArr2;
    }
}

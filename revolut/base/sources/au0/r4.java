package au0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f9341b;

    static {
        int[] iArr = new int[aw0.e4.values().length];
        try {
            iArr[aw0.e4.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[aw0.e4.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f9340a = iArr;
        int[] iArr2 = new int[lw0.o.values().length];
        try {
            iArr2[lw0.o.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[lw0.o.AI_BORDER_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[lw0.o.AI_BORDER_AND_NEON_GLOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f9341b = iArr2;
    }
}

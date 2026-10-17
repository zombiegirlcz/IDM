package au0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f9451b;

    static {
        int[] iArr = new int[tx0.k0.values().length];
        try {
            iArr[tx0.k0.LARGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tx0.k0.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tx0.k0.SMALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tx0.k0.EXTRA_SMALL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[tx0.k0.TINY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f9450a = iArr;
        int[] iArr2 = new int[b0.values().length];
        try {
            iArr2[b0.BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[b0.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f9451b = iArr2;
    }
}

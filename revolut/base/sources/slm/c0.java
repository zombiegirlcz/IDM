package slm;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f264244a;

    static {
        int[] iArr = new int[j0.values().length];
        try {
            iArr[j0.LIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j0.MAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j0.POLY_OBJ.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j0.OBJ.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f264244a = iArr;
    }
}

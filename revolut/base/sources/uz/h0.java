package uz;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f284523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f284524b;

    static {
        int[] iArr = new int[g0.values().length];
        try {
            iArr[g0.PIN_TO_BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0.PIN_TO_MASK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f284523a = iArr;
        int[] iArr2 = new int[rz.l.values().length];
        try {
            iArr2[rz.l.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[rz.l.Footer.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f284524b = iArr2;
    }
}

package cs0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f108428b;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.LEFT_TO_RIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.RIGHT_TO_LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.TOP_TO_BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.BOTTOM_TO_TOP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f108427a = iArr;
        int[] iArr2 = new int[e.values().length];
        try {
            iArr2[e.RADIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[e.LINEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f108428b = iArr2;
    }
}

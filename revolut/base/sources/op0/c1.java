package op0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f227204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f227205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f227206c;

    static {
        int[] iArr = new int[y0.values().length];
        try {
            iArr[y0.SINGLE_LINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y0.TWO_LINES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f227204a = iArr;
        int[] iArr2 = new int[q.values().length];
        try {
            iArr2[q.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[q.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[q.DYNAMIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[q.LARGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f227205b = iArr2;
        int[] iArr3 = new int[aw0.e2.values().length];
        try {
            iArr3[aw0.e2.MONOCHROMATIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[aw0.e2.PERFORMANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f227206c = iArr3;
    }
}

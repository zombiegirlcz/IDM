package vrl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f291659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f291660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f291661c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[m4l.e.values().length];
        try {
            iArr[m4l.e.INCLUDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m4l.e.EXCLUDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f291659a = iArr;
        int[] iArr2 = new int[m4l.a.values().length];
        try {
            iArr2[m4l.a.POSITIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f291660b = iArr2;
        int[] iArr3 = new int[m4l.g.values().length];
        try {
            iArr3[m4l.g.EXCLUDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f291661c = iArr3;
        int[] iArr4 = new int[m4l.c.values().length];
        try {
            iArr4[m4l.c.EXCLUDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        d = iArr4;
    }
}

package y7d;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f311469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f311470b;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.TOP_TO_BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.TOP_TO_BOTTOM_WITH_DELAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o.BOTTOM_TO_TOP_WITH_DELAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f311469a = iArr;
        int[] iArr2 = new int[q.values().length];
        try {
            iArr2[q.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[q.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f311470b = iArr2;
    }
}

package y6g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f311279a;

    static {
        int[] iArr = new int[r7g.i.values().length];
        try {
            iArr[r7g.i.ANY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r7g.i.NON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r7g.i.UP_TO_ONE_STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r7g.i.UP_TO_TWO_STOPS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[r7g.i.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f311279a = iArr;
    }
}

package k4l;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f180963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f180964b;

    static {
        int[] iArr = new int[r0.values().length];
        try {
            iArr[r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r0.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r0.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r0.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f180963a = iArr;
        int[] iArr2 = new int[bfl.g.values().length];
        try {
            iArr2[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f180964b = iArr2;
    }
}

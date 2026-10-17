package o3b;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f221755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f221756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f221757c;

    static {
        int[] iArr = new int[k4l.n0.values().length];
        try {
            iArr[k4l.n0.TAKE_PROFIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k4l.n0.STOP_LOSS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f221755a = iArr;
        int[] iArr2 = new int[bfl.g.values().length];
        try {
            iArr2[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f221756b = iArr2;
        int[] iArr3 = new int[o0.values().length];
        try {
            iArr3[o0.UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[o0.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f221757c = iArr3;
    }
}

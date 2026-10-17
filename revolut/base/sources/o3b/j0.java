package o3b;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f221738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f221739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f221740c;

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
        f221738a = iArr;
        int[] iArr2 = new int[bfl.g.values().length];
        try {
            iArr2[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f221739b = iArr2;
        int[] iArr3 = new int[k4l.m0.values().length];
        try {
            iArr3[k4l.m0.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[k4l.m0.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[k4l.m0.FAILURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f221740c = iArr3;
    }
}

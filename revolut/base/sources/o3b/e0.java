package o3b;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f221725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f221726b;

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
        f221725a = iArr;
        int[] iArr2 = new int[u.values().length];
        try {
            iArr2[u.AMOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[u.DISTANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[u.PRICE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f221726b = iArr2;
    }
}

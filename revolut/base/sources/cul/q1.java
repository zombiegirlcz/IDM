package cul;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f109160a;

    static {
        int[] iArr = new int[k4l.r0.values().length];
        try {
            iArr[k4l.r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k4l.r0.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k4l.r0.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k4l.r0.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f109160a = iArr;
    }
}

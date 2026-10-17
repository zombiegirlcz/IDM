package psk;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f239511a;

    static {
        int[] iArr = new int[jel.g.values().length];
        try {
            iArr[jel.g.FIXED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jel.g.FLOATING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jel.g.STEP_UP_STEP_DOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f239511a = iArr;
    }
}

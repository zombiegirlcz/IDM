package pvk;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f240292a;

    static {
        int[] iArr = new int[mel.j0.values().length];
        try {
            iArr[mel.j0.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mel.j0.STRONG_BUY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mel.j0.SELL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[mel.j0.STRONG_SELL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[mel.j0.HOLD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f240292a = iArr;
    }
}

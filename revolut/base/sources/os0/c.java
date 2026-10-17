package os0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f229216a;

    static {
        int[] iArr = new int[dw0.b.values().length];
        try {
            iArr[dw0.b.LIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dw0.b.BUSY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[dw0.b.INACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f229216a = iArr;
    }
}

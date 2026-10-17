package htk;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f155451a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.BELOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.SLIGHTLY_ABOVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.ABOVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f155451a = iArr;
    }
}

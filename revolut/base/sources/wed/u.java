package wed;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f296756a;

    static {
        int[] iArr = new int[mgd.d.values().length];
        try {
            iArr[mgd.d.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mgd.d.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f296756a = iArr;
    }
}

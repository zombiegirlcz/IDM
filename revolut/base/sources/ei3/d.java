package ei3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f126363a;

    static {
        int[] iArr = new int[yt8.i.values().length];
        try {
            iArr[yt8.i.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yt8.i.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yt8.i.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yt8.i.PASSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f126363a = iArr;
    }
}

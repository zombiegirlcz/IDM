package jwf;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f178984a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.RETRY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.PERMISSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.CHOOSE_CITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f178984a = iArr;
    }
}

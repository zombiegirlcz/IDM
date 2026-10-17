package g8i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f141362a;

    static {
        int[] iArr = new int[ibd.j.values().length];
        try {
            iArr[ibd.j.Daily.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ibd.j.Weekly.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ibd.j.Monthly.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f141362a = iArr;
    }
}

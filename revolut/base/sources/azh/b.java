package azh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11459a;

    static {
        int[] iArr = new int[kyh.a.values().length];
        try {
            iArr[kyh.a.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kyh.a.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f11459a = iArr;
    }
}

package lua;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f200210a;

    static {
        int[] iArr = new int[hua.c.values().length];
        try {
            iArr[hua.c.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hua.c.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hua.c.WEEKLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f200210a = iArr;
    }
}

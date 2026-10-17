package f2i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f131799a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.MONTHLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f131799a = iArr;
    }
}

package l2l;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f191826a;

    static {
        int[] iArr = new int[tdh.a.values().length];
        try {
            iArr[tdh.a.PORTFOLIO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tdh.a.WATCHLIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f191826a = iArr;
    }
}

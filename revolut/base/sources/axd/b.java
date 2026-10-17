package axd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f10928a;

    static {
        int[] iArr = new int[bxd.a.values().length];
        try {
            iArr[bxd.a.STAKE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bxd.a.UNSTAKE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f10928a = iArr;
    }
}

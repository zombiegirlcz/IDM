package csj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f108496b;

    static {
        int[] iArr = new int[uzi.c.values().length];
        try {
            iArr[uzi.c.MONTHLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[uzi.c.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f108495a = iArr;
        int[] iArr2 = new int[h.values().length];
        try {
            iArr2[h.UPDATE_REMOTELY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[h.UPDATE_LOCALLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f108496b = iArr2;
    }
}

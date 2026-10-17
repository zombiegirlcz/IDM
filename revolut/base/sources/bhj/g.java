package bhj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15307a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.READY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.INSTALLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f15307a = iArr;
    }
}

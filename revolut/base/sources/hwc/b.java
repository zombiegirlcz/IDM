package hwc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f156123a;

    static {
        int[] iArr = new int[cuc.f.values().length];
        try {
            iArr[cuc.f.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cuc.f.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cuc.f.DEACTIVATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f156123a = iArr;
    }
}

package wed;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f296737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f296738b;

    static {
        int[] iArr = new int[i0.values().length];
        try {
            iArr[i0.ADD_ALERT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i0.NORMAL_TRIGGERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i0.FULL_TRIGGERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f296737a = iArr;
        int[] iArr2 = new int[mgd.d.values().length];
        try {
            iArr2[mgd.d.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[mgd.d.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f296738b = iArr2;
    }
}

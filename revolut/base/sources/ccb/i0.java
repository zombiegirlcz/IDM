package ccb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22998a;

    static {
        int[] iArr = new int[pcd.b.values().length];
        try {
            iArr[pcd.b.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pcd.b.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pcd.b.YOUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pcd.b.PERSONAL_UNDER_18.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[pcd.b.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f22998a = iArr;
    }
}

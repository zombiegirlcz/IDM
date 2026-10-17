package pcd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f234880a;

    static {
        int[] iArr = new int[h0.values().length];
        try {
            iArr[h0.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h0.CLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h0.PENDING_ACTIVATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h0.ACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f234880a = iArr;
    }
}

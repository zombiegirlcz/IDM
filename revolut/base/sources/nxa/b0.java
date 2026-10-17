package nxa;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f220487a;

    static {
        int[] iArr = new int[i0.values().length];
        try {
            iArr[i0.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i0.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i0.EXPIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i0.REDEEMED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f220487a = iArr;
    }
}

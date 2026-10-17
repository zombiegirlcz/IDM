package nxa;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f220493a;

    static {
        int[] iArr = new int[i0.values().length];
        try {
            iArr[i0.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i0.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i0.REDEEMED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i0.EXPIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f220493a = iArr;
    }
}

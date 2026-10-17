package yg6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f313548a;

    static {
        int[] iArr = new int[ho3.d.values().length];
        try {
            iArr[ho3.d.REVOKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ho3.d.EXPIRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ho3.d.REVALIDATION_PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f313548a = iArr;
    }
}

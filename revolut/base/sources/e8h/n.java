package e8h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123712a;

    static {
        int[] iArr = new int[xzg.e0.values().length];
        try {
            iArr[xzg.e0.IGNORE_EMPTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xzg.e0.ALLOW_EMPTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f123712a = iArr;
    }
}

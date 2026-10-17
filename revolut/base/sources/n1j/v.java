package n1j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f211406a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.JOINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q.PRO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[q.COMMODITIES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f211406a = iArr;
    }
}

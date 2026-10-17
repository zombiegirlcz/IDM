package s9h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261179a;

    static {
        int[] iArr = new int[q0h.e.values().length];
        try {
            iArr[q0h.e.STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q0h.e.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q0h.e.CFD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f261179a = iArr;
    }
}

package d4f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f111280a;

    static {
        int[] iArr = new int[vbl.a.values().length];
        try {
            iArr[vbl.a.STRUCTURED_NOTES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vbl.a.PAPER_TRADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vbl.a.MUTUAL_FUNDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f111280a = iArr;
    }
}

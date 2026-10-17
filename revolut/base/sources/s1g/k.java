package s1g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f259140a;

    static {
        int[] iArr = new int[x3g.b.values().length];
        try {
            iArr[x3g.b.FULL_REFUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x3g.b.PARTIAL_REFUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x3g.b.NO_REFUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f259140a = iArr;
    }
}

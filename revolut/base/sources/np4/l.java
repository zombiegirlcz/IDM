package np4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f218138a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.SINGLE_PURCHASE_LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.MONTHLY_SPENDING_LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f218138a = iArr;
    }
}

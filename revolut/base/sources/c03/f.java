package c03;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20124a;

    static {
        int[] iArr = new int[wy2.d.values().length];
        try {
            iArr[wy2.d.LOST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wy2.d.FRAUD_OR_THEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wy2.d.DAMAGED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f20124a = iArr;
    }
}

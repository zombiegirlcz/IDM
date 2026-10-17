package dfj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f113938a;

    static {
        int[] iArr = new int[dej.m3.values().length];
        try {
            iArr[dej.m3.PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dej.m3.REFUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[dej.m3.POINTS_REDEMPTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[dej.m3.POINTS_REFUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f113938a = iArr;
    }
}

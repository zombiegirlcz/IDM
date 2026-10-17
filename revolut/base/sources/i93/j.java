package i93;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f159564a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.ECOMMERCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.LOCATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.MAGNET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.ATM_WITHDRAWAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[e.CONTACTLESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[e.POINT_OF_SALE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f159564a = iArr;
    }
}

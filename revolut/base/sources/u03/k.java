package u03;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f276050a;

    static {
        int[] iArr = new int[i93.e.values().length];
        try {
            iArr[i93.e.LOCATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i93.e.MAGNET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i93.e.CONTACTLESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i93.e.ATM_WITHDRAWAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[i93.e.ECOMMERCE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[i93.e.POINT_OF_SALE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f276050a = iArr;
    }
}

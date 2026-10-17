package hjd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f152721a;

    static {
        int[] iArr = new int[m1c.j.values().length];
        try {
            iArr[m1c.j.CASHBACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m1c.j.LOYALTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m1c.j.LOYALTY_BOOSTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m1c.j.DISCOUNT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[m1c.j.CALENDAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f152721a = iArr;
    }
}

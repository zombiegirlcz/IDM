package ku1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f189622a;

    static {
        int[] iArr = new int[c02.e.values().length];
        try {
            iArr[c02.e.POS_PURCHASE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c02.e.WEB_PURCHASE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c02.e.CASH_WITHDRAWAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c02.e.WEB_RETURN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c02.e.POS_RETURN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f189622a = iArr;
    }
}

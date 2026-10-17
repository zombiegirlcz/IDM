package dnc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f116283a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.STOCKS_TAB_ID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.BONDS_TAB_ID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.COMMODITIES_TAB_ID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l.CASH_TAB_ID.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f116283a = iArr;
    }
}

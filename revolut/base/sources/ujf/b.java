package ujf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f280610a;

    static {
        int[] iArr = new int[uhf.c.values().length];
        try {
            iArr[uhf.c.LOAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[uhf.c.SHARE_PAYMENT_LINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[uhf.c.OPEN_SPLIT_BILL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[uhf.c.CANCEL_TRANSFER_LINK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[uhf.c.HIDE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[uhf.c.UNHIDE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[uhf.c.EXCLUDE_FROM_ANALYTICS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[uhf.c.INCLUDE_IN_ANALYTICS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f280610a = iArr;
    }
}

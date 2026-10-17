package hye;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f156868a;

    static {
        int[] iArr = new int[aue.c.values().length];
        try {
            iArr[aue.c.ACCOUNT_LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[aue.c.DAILY_LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[aue.c.WEEKLY_LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[aue.c.MONTHLY_LIMIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[aue.c.YEARLY_LIMIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[aue.c.SINGLE_TRANSACTION_MAX_LIMIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[aue.c.ALL_TRANSACTIONS_LIMIT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f156868a = iArr;
    }
}

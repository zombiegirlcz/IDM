package pgb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f235857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f235858b;

    static {
        int[] iArr = new int[tgb.j.values().length];
        try {
            iArr[tgb.j.CLAIMABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tgb.j.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tgb.j.EXPIRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tgb.j.AT_RISK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[tgb.j.LOCKED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[tgb.j.UNLOCKED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[tgb.j.COMING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f235857a = iArr;
        int[] iArr2 = new int[tgb.k.values().length];
        try {
            iArr2[tgb.k.SALARY_DRAW.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[tgb.k.FREE_PREMIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[tgb.k.SAVINGS_BOOST.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[tgb.k.INCOME_INSURANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        f235858b = iArr2;
    }
}

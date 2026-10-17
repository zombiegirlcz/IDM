package pz3;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f240886a;

    static {
        int[] iArr = new int[is3.a.values().length];
        try {
            iArr[is3.a.IBAN_ACCOUNT_NOT_FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[is3.a.NO_MATCHING_ACCOUNT_FOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[is3.a.NOT_MATCHING_CURRENCY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[is3.a.UNKNOWN_BANK_OVER_LIMIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[is3.a.UNKNOWN_BANK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[is3.a.UNKNOWN_BANK_UNDER_LIMIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[is3.a.INCOME_ASSESSMENT_NOT_AVAILABLE_OVER_LIMIT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[is3.a.INCOME_ASSESSMENT_NOT_AVAILABLE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[is3.a.INCOME_ASSESSMENT_NOT_AVAILABLE_UNDER_LIMIT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f240886a = iArr;
    }
}

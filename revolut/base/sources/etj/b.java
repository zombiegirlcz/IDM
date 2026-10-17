package etj;

import tof.w6;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f129413a;

    static {
        int[] iArr = new int[w6.values().length];
        try {
            iArr[w6.CASH_DEPOSIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w6.CHEQUE_DEPOSIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w6.DIRECT_DEBIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[w6.EXTERNAL_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[w6.EXTERNAL_ACCOUNT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[w6.OPEN_BANKING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[w6.INVESTMENT_WALLET.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[w6.CRYPTO_WALLET.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f129413a = iArr;
    }
}

package dce;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f112876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f112877c;

    static {
        int[] iArr = new int[qua.q.values().length];
        try {
            iArr[qua.q.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qua.q.REASON_REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f112875a = iArr;
        int[] iArr2 = new int[ibd.h.values().length];
        try {
            iArr2[ibd.h.INTERNAL_CHARITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ibd.h.SAVINGS_POCKET.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ibd.h.YOUTH_ALLOWANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ibd.h.CREDIT_CARD_PAYMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ibd.h.BILL_MONEY_BOX.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ibd.h.VAULT.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ibd.h.EXTERNAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ibd.h.INTERNAL.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ibd.h.WALLET.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ibd.h.BPAY.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[ibd.h.NZ_BILLS.ordinal()] = 11;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[ibd.h.UPI.ordinal()] = 12;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[ibd.h.GIRO_HU_DIRECT_DEBIT.ordinal()] = 13;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[ibd.h.MASAV_IL_DIRECT_DEBIT.ordinal()] = 14;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[ibd.h.EXTERNAL_MANDATE.ordinal()] = 15;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[ibd.h.BIZUM_MANDATE.ordinal()] = 16;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[ibd.h.CARD_MANDATE.ordinal()] = 17;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[ibd.h.PREDEFINED_CARD_MANDATE.ordinal()] = 18;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[ibd.h.MANUAL_CARD_MANDATE.ordinal()] = 19;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[ibd.h.BILL.ordinal()] = 20;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[ibd.h.UAE_BILLS.ordinal()] = 21;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[ibd.h.QR_CODE.ordinal()] = 22;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[ibd.h.PIX_MANDATE.ordinal()] = 23;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[ibd.h.UPI_MANDATE.ordinal()] = 24;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[ibd.h.MOBILE_PLAN_SUBSCRIPTION.ordinal()] = 25;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[ibd.h.PAID_PLAN.ordinal()] = 26;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[ibd.h.REFUND.ordinal()] = 27;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[ibd.h.MORTGAGE_PAYMENT.ordinal()] = 28;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[ibd.h.LOAN_PAYMENT.ordinal()] = 29;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[ibd.h.COMMODITY.ordinal()] = 30;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[ibd.h.CRYPTO.ordinal()] = 31;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[ibd.h.DIRECT_DEBIT_TOPUP.ordinal()] = 32;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[ibd.h.ACQUIRING_ONE_OFF.ordinal()] = 33;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[ibd.h.ACQUIRING_SUBSCRIPTION.ordinal()] = 34;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[ibd.h.BOLETO.ordinal()] = 35;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[ibd.h.UNKNOWN.ordinal()] = 36;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[ibd.h.PAY_LATER_PAYMENT.ordinal()] = 37;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[ibd.h.COBRANDS.ordinal()] = 38;
        } catch (NoSuchFieldError unused40) {
        }
        f112876b = iArr2;
        int[] iArr3 = new int[fva.e.values().length];
        try {
            iArr3[fva.e.WEEKLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr3[fva.e.BI_WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr3[fva.e.MONTHLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr3[fva.e.QUARTERLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr3[fva.e.HALF_YEARLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr3[fva.e.YEARLY.ordinal()] = 6;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr3[fva.e.ADHOC.ordinal()] = 7;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr3[fva.e.DAILY.ordinal()] = 8;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr3[fva.e.TWICE_WEEKLY.ordinal()] = 9;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr3[fva.e.TEN_DAYS.ordinal()] = 10;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr3[fva.e.BI_MONTHLY.ordinal()] = 11;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr3[fva.e.TRIMESTER.ordinal()] = 12;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr3[fva.e.UNKNOWN.ordinal()] = 13;
        } catch (NoSuchFieldError unused53) {
        }
        f112877c = iArr3;
    }
}

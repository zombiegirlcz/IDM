package bnf;

import hha.w0;
import tof.w6;
import tof.y6;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f17150c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[uof.c.values().length];
        try {
            iArr[uof.c.PLAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[uof.c.BOOSTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17148a = iArr;
        int[] iArr2 = new int[w0.values().length];
        try {
            iArr2[w0.PLUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[w0.PREMIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[w0.METAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[w0.ULTRA.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[w0.PRIVATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f17149b = iArr2;
        int[] iArr3 = new int[w6.values().length];
        try {
            iArr3[w6.CASH_DEPOSIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        f17150c = iArr3;
        int[] iArr4 = new int[y6.values().length];
        try {
            iArr4[y6.OTP_ATM.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[y6.ATM.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[y6.CARD_PAYMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[y6.MERCHANT_PAYMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[y6.MERCHANT_RESERVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[y6.REV_PAYMENT_REFUND.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[y6.TOPUP_RETURN.ordinal()] = 7;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[y6.REFUND.ordinal()] = 8;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[y6.CARD_REFUND.ordinal()] = 9;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[y6.CHARGE_REFUND.ordinal()] = 10;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[y6.MERCHANT_REFUND.ordinal()] = 11;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[y6.MERCHANT_CRED_RVSL.ordinal()] = 12;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[y6.OTP_PAYMENT.ordinal()] = 13;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr4[y6.OTP_PAYMENT_REFUND.ordinal()] = 14;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[y6.MERCHANT_FEE_RVSL.ordinal()] = 15;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr4[y6.P2M_PAYMENT.ordinal()] = 16;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr4[y6.ALIPAY_PLUS_PAYMENT.ordinal()] = 17;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr4[y6.IRIS_PAYMENT.ordinal()] = 18;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr4[y6.UPI_PAYMENT.ordinal()] = 19;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr4[y6.WERO_PAYMENT.ordinal()] = 20;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr4[y6.COLLECTION_EXCHANGE.ordinal()] = 21;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr4[y6.REVX_EXCHANGE.ordinal()] = 22;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr4[y6.DEFI_SWAP.ordinal()] = 23;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr4[y6.EXCHANGE.ordinal()] = 24;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr4[y6.FEE.ordinal()] = 25;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr4[y6.MERCHANT_FEE.ordinal()] = 26;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr4[y6.CHARGE.ordinal()] = 27;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr4[y6.REWARD.ordinal()] = 28;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr4[y6.TOPUP.ordinal()] = 29;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr4[y6.DEFI_TOPUP.ordinal()] = 30;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr4[y6.TOPUP_CHARGEBACK.ordinal()] = 31;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr4[y6.INTEREST.ordinal()] = 32;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr4[y6.REVX_TRANSFER.ordinal()] = 33;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr4[y6.DEFI_TRANSFER.ordinal()] = 34;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr4[y6.TRANSFER.ordinal()] = 35;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr4[y6.TRADE.ordinal()] = 36;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr4[y6.CREDIT_INTEREST.ordinal()] = 37;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr4[y6.LOAN.ordinal()] = 38;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr4[y6.LOAN_PAYOFF.ordinal()] = 39;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr4[y6.LOAN_PAYMENT.ordinal()] = 40;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr4[y6.REV_PAYMENT.ordinal()] = 41;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr4[y6.MERCHANT_CB.ordinal()] = 42;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr4[y6.MERCHANT_CB_RVSL.ordinal()] = 43;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr4[y6.CASHBACK_REVERSAL.ordinal()] = 44;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr4[y6.CHARGEBACK_REVERSAL.ordinal()] = 45;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr4[y6.UNKNOWN.ordinal()] = 46;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr4[y6.CARD_CHARGEBACK.ordinal()] = 47;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr4[y6.CARD_CREDIT.ordinal()] = 48;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr4[y6.CARD_CREDIT_RETURN.ordinal()] = 49;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr4[y6.CASHBACK.ordinal()] = 50;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr4[y6.CRYPTO_WITHDRAWAL.ordinal()] = 51;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr4[y6.FEE_REVERSAL.ordinal()] = 52;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr4[y6.TAX.ordinal()] = 53;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr4[y6.TAX_REFUND.ordinal()] = 54;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr4[y6.TRANSFER_CHARGEBACK.ordinal()] = 55;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr4[y6.TRANSFER_CHARGEBACK_RVSL.ordinal()] = 56;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr4[y6.DERIVATIVE_PNL.ordinal()] = 57;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr4[y6.COLLATERAL_HOLD.ordinal()] = 58;
        } catch (NoSuchFieldError unused66) {
        }
        d = iArr4;
    }
}

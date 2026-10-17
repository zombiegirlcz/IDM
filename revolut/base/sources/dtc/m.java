package dtc;

import tof.y6;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f117424a;

    static {
        int[] iArr = new int[y6.values().length];
        try {
            iArr[y6.REVX_TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y6.DEFI_TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y6.TRANSFER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[y6.DEFI_TOPUP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[y6.TOPUP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[y6.CASHBACK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[y6.CASHBACK_REVERSAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[y6.CARD_PAYMENT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[y6.REVX_EXCHANGE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[y6.DEFI_SWAP.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[y6.COLLECTION_EXCHANGE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[y6.EXCHANGE.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[y6.FEE.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[y6.REFUND.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[y6.REV_PAYMENT.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[y6.CRYPTO_WITHDRAWAL.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[y6.CARD_REFUND.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[y6.TRADE.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[y6.ATM.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[y6.CARD_CREDIT.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[y6.CHARGEBACK_REVERSAL.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[y6.LOAN.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[y6.REWARD.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[y6.TOPUP_CHARGEBACK.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[y6.TOPUP_RETURN.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[y6.TAX.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[y6.TAX_REFUND.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[y6.LOAN_PAYOFF.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[y6.LOAN_PAYMENT.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[y6.CREDIT_INTEREST.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[y6.REV_PAYMENT_REFUND.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[y6.INTEREST.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[y6.CARD_CHARGEBACK.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[y6.CARD_CREDIT_RETURN.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[y6.FEE_REVERSAL.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[y6.MERCHANT_CB.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[y6.MERCHANT_CB_RVSL.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[y6.MERCHANT_CRED_RVSL.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[y6.MERCHANT_FEE.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[y6.MERCHANT_FEE_RVSL.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[y6.MERCHANT_PAYMENT.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[y6.MERCHANT_REFUND.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[y6.MERCHANT_RESERVE.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[y6.TRANSFER_CHARGEBACK.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[y6.TRANSFER_CHARGEBACK_RVSL.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[y6.OTP_ATM.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[y6.OTP_PAYMENT.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[y6.OTP_PAYMENT_REFUND.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr[y6.COLLATERAL_HOLD.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr[y6.P2M_PAYMENT.ordinal()] = 50;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr[y6.ALIPAY_PLUS_PAYMENT.ordinal()] = 51;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr[y6.IRIS_PAYMENT.ordinal()] = 52;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr[y6.UPI_PAYMENT.ordinal()] = 53;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr[y6.WERO_PAYMENT.ordinal()] = 54;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr[y6.CHARGE.ordinal()] = 55;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr[y6.CHARGE_REFUND.ordinal()] = 56;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr[y6.DERIVATIVE_PNL.ordinal()] = 57;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr[y6.UNKNOWN.ordinal()] = 58;
        } catch (NoSuchFieldError unused58) {
        }
        f117424a = iArr;
    }
}

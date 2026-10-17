package tof;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class y6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y6[] $VALUES;
    public static final y6 ALIPAY_PLUS_PAYMENT;
    public static final y6 ATM;
    public static final y6 CARD_CHARGEBACK;
    public static final y6 CARD_CREDIT;
    public static final y6 CARD_CREDIT_RETURN;
    public static final y6 CARD_PAYMENT;
    public static final y6 CARD_REFUND;
    public static final y6 CASHBACK;
    public static final y6 CASHBACK_REVERSAL;
    public static final y6 CHARGE;
    public static final y6 CHARGEBACK_REVERSAL;
    public static final y6 CHARGE_REFUND;
    public static final y6 COLLATERAL_HOLD;
    public static final y6 COLLECTION_EXCHANGE;
    public static final y6 CREDIT_INTEREST;
    public static final y6 CRYPTO_WITHDRAWAL;
    public static final y6 DEFI_SWAP;
    public static final y6 DEFI_TOPUP;
    public static final y6 DEFI_TRANSFER;
    public static final y6 DERIVATIVE_PNL;
    public static final y6 EXCHANGE;
    public static final y6 FEE;
    public static final y6 FEE_REVERSAL;
    public static final y6 INTEREST;
    public static final y6 IRIS_PAYMENT;
    public static final y6 LOAN;
    public static final y6 LOAN_PAYMENT;
    public static final y6 LOAN_PAYOFF;
    public static final y6 MERCHANT_CB;
    public static final y6 MERCHANT_CB_RVSL;
    public static final y6 MERCHANT_CRED_RVSL;
    public static final y6 MERCHANT_FEE;
    public static final y6 MERCHANT_FEE_RVSL;
    public static final y6 MERCHANT_PAYMENT;
    public static final y6 MERCHANT_REFUND;
    public static final y6 MERCHANT_RESERVE;
    public static final y6 OTP_ATM;
    public static final y6 OTP_PAYMENT;
    public static final y6 OTP_PAYMENT_REFUND;
    public static final y6 P2M_PAYMENT;
    public static final y6 REFUND;
    public static final y6 REVX_EXCHANGE;
    public static final y6 REVX_TRANSFER;
    public static final y6 REV_PAYMENT;
    public static final y6 REV_PAYMENT_REFUND;
    public static final y6 REWARD;
    public static final y6 TAX;
    public static final y6 TAX_REFUND;
    public static final y6 TOPUP;
    public static final y6 TOPUP_CHARGEBACK;
    public static final y6 TOPUP_RETURN;
    public static final y6 TRADE;
    public static final y6 TRANSFER;
    public static final y6 TRANSFER_CHARGEBACK;
    public static final y6 TRANSFER_CHARGEBACK_RVSL;
    public static final y6 UNKNOWN;
    public static final y6 UPI_PAYMENT;
    public static final y6 WERO_PAYMENT;

    @NotNull
    private final String alias;

    static {
        y6 y6Var = new y6("ATM", 0, "ATM");
        ATM = y6Var;
        y6 y6Var2 = new y6("CARD_PAYMENT", 1, "CARD_PAYMENT");
        CARD_PAYMENT = y6Var2;
        y6 y6Var3 = new y6("CARD_REFUND", 2, "CARD_REFUND");
        CARD_REFUND = y6Var3;
        y6 y6Var4 = new y6("CARD_CHARGEBACK", 3, "CARD_CHARGEBACK");
        CARD_CHARGEBACK = y6Var4;
        y6 y6Var5 = new y6("CARD_CREDIT", 4, "CARD_CREDIT");
        CARD_CREDIT = y6Var5;
        y6 y6Var6 = new y6("CARD_CREDIT_RETURN", 5, "CARD_CREDIT_RETURN");
        CARD_CREDIT_RETURN = y6Var6;
        y6 y6Var7 = new y6("CHARGEBACK_REVERSAL", 6, "CHARGEBACK_REVERSAL");
        CHARGEBACK_REVERSAL = y6Var7;
        y6 y6Var8 = new y6("EXCHANGE", 7, "EXCHANGE");
        EXCHANGE = y6Var8;
        y6 y6Var9 = new y6("FEE", 8, "FEE");
        FEE = y6Var9;
        y6 y6Var10 = new y6("FEE_REVERSAL", 9, "FEE_REVERSAL");
        FEE_REVERSAL = y6Var10;
        y6 y6Var11 = new y6("LOAN", 10, "LOAN");
        LOAN = y6Var11;
        y6 y6Var12 = new y6("REFUND", 11, "REFUND");
        REFUND = y6Var12;
        y6 y6Var13 = new y6("CHARGE", 12, "CHARGE");
        CHARGE = y6Var13;
        y6 y6Var14 = new y6("CHARGE_REFUND", 13, "CHARGE_REFUND");
        CHARGE_REFUND = y6Var14;
        y6 y6Var15 = new y6("REWARD", 14, "REWARD");
        REWARD = y6Var15;
        y6 y6Var16 = new y6("TOPUP", 15, "TOPUP");
        TOPUP = y6Var16;
        y6 y6Var17 = new y6("TOPUP_CHARGEBACK", 16, "TOPUP_CHARGEBACK");
        TOPUP_CHARGEBACK = y6Var17;
        y6 y6Var18 = new y6("TOPUP_RETURN", 17, "TOPUP_RETURN");
        TOPUP_RETURN = y6Var18;
        y6 y6Var19 = new y6("TRANSFER", 18, "TRANSFER");
        TRANSFER = y6Var19;
        y6 y6Var20 = new y6("TRANSFER_CHARGEBACK", 19, "TRANSFER_CHARGEBACK");
        TRANSFER_CHARGEBACK = y6Var20;
        y6 y6Var21 = new y6("TRANSFER_CHARGEBACK_RVSL", 20, "TRANSFER_CHARGEBACK_RVSL");
        TRANSFER_CHARGEBACK_RVSL = y6Var21;
        y6 y6Var22 = new y6("TAX", 21, "TAX");
        TAX = y6Var22;
        y6 y6Var23 = new y6("TAX_REFUND", 22, "TAX_REFUND");
        TAX_REFUND = y6Var23;
        y6 y6Var24 = new y6("TRADE", 23, "TRADE");
        TRADE = y6Var24;
        y6 y6Var25 = new y6("CASHBACK", 24, "CASHBACK");
        CASHBACK = y6Var25;
        y6 y6Var26 = new y6("CASHBACK_REVERSAL", 25, "CASHBACK_REVERSAL");
        CASHBACK_REVERSAL = y6Var26;
        y6 y6Var27 = new y6("LOAN_PAYOFF", 26, "LOAN_PAYOFF");
        LOAN_PAYOFF = y6Var27;
        y6 y6Var28 = new y6("LOAN_PAYMENT", 27, "LOAN_PAYMENT");
        LOAN_PAYMENT = y6Var28;
        y6 y6Var29 = new y6("CREDIT_INTEREST", 28, "CREDIT_INTEREST");
        CREDIT_INTEREST = y6Var29;
        y6 y6Var30 = new y6("REV_PAYMENT", 29, "REV_PAYMENT");
        REV_PAYMENT = y6Var30;
        y6 y6Var31 = new y6("REV_PAYMENT_REFUND", 30, "REV_PAYMENT_REFUND");
        REV_PAYMENT_REFUND = y6Var31;
        y6 y6Var32 = new y6("CRYPTO_WITHDRAWAL", 31, "CRYPTO_WITHDRAWAL");
        CRYPTO_WITHDRAWAL = y6Var32;
        y6 y6Var33 = new y6("MERCHANT_PAYMENT", 32, "MERCHANT_PAYMENT");
        MERCHANT_PAYMENT = y6Var33;
        y6 y6Var34 = new y6("MERCHANT_REFUND", 33, "MERCHANT_REFUND");
        MERCHANT_REFUND = y6Var34;
        y6 y6Var35 = new y6("MERCHANT_CB", 34, "MERCHANT_CB");
        MERCHANT_CB = y6Var35;
        y6 y6Var36 = new y6("MERCHANT_CB_RVSL", 35, "MERCHANT_CB_RVSL");
        MERCHANT_CB_RVSL = y6Var36;
        y6 y6Var37 = new y6("MERCHANT_CRED_RVSL", 36, "MERCHANT_CRED_RVSL");
        MERCHANT_CRED_RVSL = y6Var37;
        y6 y6Var38 = new y6("MERCHANT_FEE_RVSL", 37, "MERCHANT_FEE_RVSL");
        MERCHANT_FEE_RVSL = y6Var38;
        y6 y6Var39 = new y6("MERCHANT_FEE", 38, "MERCHANT_FEE");
        MERCHANT_FEE = y6Var39;
        y6 y6Var40 = new y6("MERCHANT_RESERVE", 39, "MERCHANT_RESERVE");
        MERCHANT_RESERVE = y6Var40;
        y6 y6Var41 = new y6("COLLECTION_EXCHANGE", 40, "COLLECTION_EXCHANGE");
        COLLECTION_EXCHANGE = y6Var41;
        y6 y6Var42 = new y6("OTP_ATM", 41, "OTP_ATM");
        OTP_ATM = y6Var42;
        y6 y6Var43 = new y6("OTP_PAYMENT", 42, "OTP_PAYMENT");
        OTP_PAYMENT = y6Var43;
        y6 y6Var44 = new y6("OTP_PAYMENT_REFUND", 43, "OTP_PAYMENT_REFUND");
        OTP_PAYMENT_REFUND = y6Var44;
        y6 y6Var45 = new y6("REVX_EXCHANGE", 44, "REVX_EXCHANGE");
        REVX_EXCHANGE = y6Var45;
        y6 y6Var46 = new y6("REVX_TRANSFER", 45, "REVX_TRANSFER");
        REVX_TRANSFER = y6Var46;
        y6 y6Var47 = new y6("DERIVATIVE_PNL", 46, "DERIVATIVE_PNL");
        DERIVATIVE_PNL = y6Var47;
        y6 y6Var48 = new y6("COLLATERAL_HOLD", 47, "COLLATERAL_HOLD");
        COLLATERAL_HOLD = y6Var48;
        y6 y6Var49 = new y6("P2M_PAYMENT", 48, "P2M_PAYMENT");
        P2M_PAYMENT = y6Var49;
        y6 y6Var50 = new y6("ALIPAY_PLUS_PAYMENT", 49, "ALIPAY_PLUS_PAYMENT");
        ALIPAY_PLUS_PAYMENT = y6Var50;
        y6 y6Var51 = new y6("IRIS_PAYMENT", 50, "IRIS_PAYMENT");
        IRIS_PAYMENT = y6Var51;
        y6 y6Var52 = new y6("UPI_PAYMENT", 51, "UPI_PAYMENT");
        UPI_PAYMENT = y6Var52;
        y6 y6Var53 = new y6("WERO_PAYMENT", 52, "WERO_PAYMENT");
        WERO_PAYMENT = y6Var53;
        y6 y6Var54 = new y6("INTEREST", 53, "INTEREST");
        INTEREST = y6Var54;
        y6 y6Var55 = new y6("DEFI_SWAP", 54, "DEFI_SWAP");
        DEFI_SWAP = y6Var55;
        y6 y6Var56 = new y6("DEFI_TOPUP", 55, "DEFI_TOPUP");
        DEFI_TOPUP = y6Var56;
        y6 y6Var57 = new y6("DEFI_TRANSFER", 56, "DEFI_TRANSFER");
        DEFI_TRANSFER = y6Var57;
        y6 y6Var58 = new y6("UNKNOWN", 57, "UNKNOWN");
        UNKNOWN = y6Var58;
        y6[] y6VarArr = {y6Var, y6Var2, y6Var3, y6Var4, y6Var5, y6Var6, y6Var7, y6Var8, y6Var9, y6Var10, y6Var11, y6Var12, y6Var13, y6Var14, y6Var15, y6Var16, y6Var17, y6Var18, y6Var19, y6Var20, y6Var21, y6Var22, y6Var23, y6Var24, y6Var25, y6Var26, y6Var27, y6Var28, y6Var29, y6Var30, y6Var31, y6Var32, y6Var33, y6Var34, y6Var35, y6Var36, y6Var37, y6Var38, y6Var39, y6Var40, y6Var41, y6Var42, y6Var43, y6Var44, y6Var45, y6Var46, y6Var47, y6Var48, y6Var49, y6Var50, y6Var51, y6Var52, y6Var53, y6Var54, y6Var55, y6Var56, y6Var57, y6Var58};
        $VALUES = y6VarArr;
        $ENTRIES = vc.s.n(y6VarArr);
    }

    public y6(String str, int i, String str2) {
        this.alias = str2;
    }

    public static y6 valueOf(String str) {
        return (y6) Enum.valueOf(y6.class, str);
    }

    public static y6[] values() {
        return (y6[]) $VALUES.clone();
    }

    public final String a() {
        return this.alias;
    }
}

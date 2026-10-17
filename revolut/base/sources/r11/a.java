package r11;

import f5j.r;
import io3.i;
import io3.l;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import org.joda.time.LocalDate;
import rd0.d;
import tof.b5;
import tof.c;
import tof.c1;
import tof.c5;
import tof.d1;
import tof.f1;
import tof.g5;
import tof.ic;
import tof.m5;
import tof.n;
import tof.n2;
import tof.o5;
import tof.p0;
import tof.p1;
import tof.q5;
import tof.r5;
import tof.s5;
import tof.t0;
import tof.v5;
import tof.v6;
import tof.w6;
import tof.y2;
import tof.y6;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f250867a = r0.k(new Pair("PERSONAL", c.PERSONAL), new Pair("PRO", c.PRO), new Pair("PRO_VAULT", c.PRO_VAULT), new Pair("VAULT", c.VAULT), new Pair("JOINT_VAULT", c.JOINT_VAULT), new Pair("GROUP_VAULT", c.GROUP_VAULT), new Pair("SAVINGS", c.SAVINGS), new Pair("JOINT_SAVINGS", c.JOINT_SAVINGS), new Pair("JOINT", c.JOINT), new Pair("LOYALTY_VAULT", c.LOYALTY_VAULT), new Pair("CREDIT", c.CREDIT), new Pair("JUNIOR_PERSONAL", c.JUNIOR_PERSONAL), new Pair("JUNIOR_VAULT", c.JUNIOR_VAULT), new Pair("JUNIOR_SAVINGS", c.JUNIOR_SAVINGS), new Pair("INVEST_GIA", c.INVEST_GIA), new Pair("INVEST_GIA_JOINT", c.INVEST_GIA_JOINT), new Pair("INVEST_ISA", c.INVEST_ISA), new Pair("INVEST_CUSTODIAN_JISA", c.INVEST_CUSTODIAN_JISA), new Pair("INVEST_PERSONAL_JISA", c.INVEST_PERSONAL_JISA), new Pair("REVX_FIAT", c.REVX_FIAT), new Pair("JOINT_INHERITANCE", c.JOINT_INHERITANCE), new Pair("UNKNOWN", c.UNKNOWN));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f250868b = r0.k(new Pair("LOCAL", r.LOCAL), new Pair("SWIFT", r.SWIFT), new Pair("UK", r.UK), new Pair("US", r.US), new Pair("IBAN", r.IBAN), new Pair("MOBILE_WALLET", r.MOBILE_WALLET), new Pair("CHEQUE", r.CHEQUE), new Pair("PIX_ALIAS", r.PIX_ALIAS), new Pair("BR", r.BR), new Pair("PAYID_ALIAS", r.PAYID_ALIAS), new Pair("SPIN_ALIAS", r.SPIN_ALIAS));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f250869c = r0.k(new Pair("MONEYBOX", n2.MONEYBOX), new Pair("UNKNOWN", n2.UNKNOWN));
    public static final Object d = r0.k(new Pair("sell", p0.SELL), new Pair("buy", p0.BUY));
    public static final Object e = r0.k(new Pair("SUSPICIOUS", t0.SUSPICIOUS), new Pair("JUSTIFIED", t0.JUSTIFIED), new Pair("FRAUDULENT", t0.FRAUDULENT));
    public static final Object f = r0.k(new Pair("CURRENT", l.CURRENT), new Pair("SAVINGS", l.SAVINGS), new Pair("SAVINGS_EXTERNAL", l.SAVINGS_EXTERNAL), new Pair("SAVINGS_INTEREST_BEARING", l.SAVINGS_INTEREST_BEARING), new Pair("STAKING", l.STAKING), new Pair("STAKING_PROXY", l.STAKING_PROXY), new Pair("INVESTMENT", l.INVESTMENT), new Pair("TAX_ADV_PROXY", l.TAX_ADV_PROXY), new Pair("MERCHANT", l.MERCHANT), new Pair("CREDIT", l.CREDIT), new Pair("INSTALMENT", l.INSTALMENT), new Pair("VESTING", l.VESTING), new Pair("BLOCKING", l.BLOCKING), new Pair("SALARY_ADVANCE", l.SALARY_ADVANCE), new Pair("CRYPTO_EXCHANGE", l.CRYPTO_EXCHANGE), new Pair("REVX_FIAT", l.REVX_FIAT), new Pair("COLLATERAL", l.COLLATERAL), new Pair("COLLATERAL_PROXY", l.COLLATERAL_PROXY), new Pair("INHERITANCE", l.INHERITANCE), new Pair("LOCKED_GIFT", l.LOCKED_GIFT), new Pair("UNKNOWN", l.UNKNOWN));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f250870g = r0.k(new Pair("EXTERNAL", i.EXTERNAL), new Pair("INTERNAL", i.INTERNAL));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f250871h = r0.k(new Pair("APPLE_PAY", y2.APPLE_PAY), new Pair("GOOGLE_PAY", y2.GOOGLE_PAY), new Pair("ANDROID_PAY", y2.ANDROID_PAY));
    public static final Object i = r0.k(new Pair("PENDING", v6.PENDING), new Pair("COMPLETED", v6.COMPLETED), new Pair("REVERTED", v6.REVERTED), new Pair("DECLINED", v6.DECLINED), new Pair("CANCELLED", v6.CANCELLED), new Pair("FAILED", v6.FAILED), new Pair("RECORDED", v6.RECORDED), new Pair("CREATED", v6.CREATED));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f250872j = r0.k(new Pair("AANI", tof.l.AANI), new Pair("BIZUM", tof.l.BIZUM), new Pair("BLIK_P2P", tof.l.BLIK_P2P), new Pair("BREB_ALIAS", tof.l.BREB_ALIAS), new Pair("GIRO_ALIAS", tof.l.GIRO_ALIAS), new Pair("IRIS", tof.l.IRIS), new Pair("MBWAY", tof.l.MBWAY), new Pair("WERO", tof.l.WERO), new Pair("UNKNOWN", tof.l.UNKNOWN));
    public static final Object k = r0.k(new Pair("BIZUM", n.BIZUM), new Pair("BLIK", n.BLIK), new Pair("BREB_ALIAS", n.BREB_ALIAS), new Pair("GIRO_ALIAS", n.GIRO_ALIAS), new Pair("IRIS", n.IRIS), new Pair("MBWAY", n.MBWAY), new Pair("WERO", n.WERO), new Pair("UNKNOWN", n.UNKNOWN));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Map f250873l = q0.c(new Pair("MULTIBANCO", s5.MULTIBANCO));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f250874m = r0.k(new Pair("BLIK_P2P", v5.BLIK_P2P), new Pair("GIRO_ALIAS", v5.GIRO_ALIAS), new Pair("WERO", v5.WERO), new Pair("PIX_CHANGE", v5.PIX_CHANGE), new Pair("PIX_WITHDRAW", v5.PIX_WITHDRAW), new Pair("AANI", v5.AANI));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f250875n = r0.k(new Pair("PLAN", uof.c.PLAN), new Pair("BOOSTER", uof.c.BOOSTER));
    public static final Object o = r0.k(new Pair("ATM", y6.ATM), new Pair("CARD_PAYMENT", y6.CARD_PAYMENT), new Pair("CARD_REFUND", y6.CARD_REFUND), new Pair("CARD_CHARGEBACK", y6.CARD_CHARGEBACK), new Pair("CARD_CREDIT", y6.CARD_CREDIT), new Pair("CARD_CREDIT_RETURN", y6.CARD_CREDIT_RETURN), new Pair("CHARGEBACK_REVERSAL", y6.CHARGEBACK_REVERSAL), new Pair("DERIVATIVE_PNL", y6.DERIVATIVE_PNL), new Pair("EXCHANGE", y6.EXCHANGE), new Pair("FEE_REVERSAL", y6.FEE_REVERSAL), new Pair("FEE", y6.FEE), new Pair("LOAN", y6.LOAN), new Pair("REFUND", y6.REFUND), new Pair("REWARD", y6.REWARD), new Pair("TOPUP", y6.TOPUP), new Pair("TOPUP_CHARGEBACK", y6.TOPUP_CHARGEBACK), new Pair("TOPUP_RETURN", y6.TOPUP_RETURN), new Pair("TRANSFER", y6.TRANSFER), new Pair("TRANSFER_CHARGEBACK", y6.TRANSFER_CHARGEBACK), new Pair("TRANSFER_CHARGEBACK_RVSL", y6.TRANSFER_CHARGEBACK_RVSL), new Pair("TAX", y6.TAX), new Pair("TAX_REFUND", y6.TAX_REFUND), new Pair("TRADE", y6.TRADE), new Pair("CASHBACK", y6.CASHBACK), new Pair("CASHBACK_REVERSAL", y6.CASHBACK_REVERSAL), new Pair("LOAN_PAYOFF", y6.LOAN_PAYOFF), new Pair("LOAN_PAYMENT", y6.LOAN_PAYMENT), new Pair("CREDIT_INTEREST", y6.CREDIT_INTEREST), new Pair("REV_PAYMENT", y6.REV_PAYMENT), new Pair("REV_PAYMENT_REFUND", y6.REV_PAYMENT_REFUND), new Pair("CRYPTO_WITHDRAWAL", y6.CRYPTO_WITHDRAWAL), new Pair("MERCHANT_PAYMENT", y6.MERCHANT_PAYMENT), new Pair("MERCHANT_REFUND", y6.MERCHANT_REFUND), new Pair("MERCHANT_CB", y6.MERCHANT_CB), new Pair("MERCHANT_CB_RVSL", y6.MERCHANT_CB_RVSL), new Pair("MERCHANT_CRED_RVSL", y6.MERCHANT_CRED_RVSL), new Pair("MERCHANT_FEE_RVSL", y6.MERCHANT_FEE_RVSL), new Pair("MERCHANT_FEE", y6.MERCHANT_FEE), new Pair("MERCHANT_RESERVE", y6.MERCHANT_RESERVE), new Pair("COLLECTION_EXCHANGE", y6.COLLECTION_EXCHANGE), new Pair("OTP_ATM", y6.OTP_ATM), new Pair("OTP_PAYMENT", y6.OTP_PAYMENT), new Pair("OTP_PAYMENT_REFUND", y6.OTP_PAYMENT_REFUND), new Pair("REVX_EXCHANGE", y6.REVX_EXCHANGE), new Pair("REVX_TRANSFER", y6.REVX_TRANSFER), new Pair("COLLATERAL_HOLD", y6.COLLATERAL_HOLD), new Pair("INTEREST", y6.INTEREST), new Pair("P2M_PAYMENT", y6.P2M_PAYMENT), new Pair("ALIPAY_PLUS_PAYMENT", y6.ALIPAY_PLUS_PAYMENT), new Pair("IRIS_PAYMENT", y6.IRIS_PAYMENT), new Pair("UPI_PAYMENT", y6.UPI_PAYMENT), new Pair("WERO_PAYMENT", y6.WERO_PAYMENT), new Pair("CHARGE", y6.CHARGE), new Pair("CHARGE_REFUND", y6.CHARGE_REFUND), new Pair("DEFI_SWAP", y6.DEFI_SWAP), new Pair("DEFI_TOPUP", y6.DEFI_TOPUP), new Pair("DEFI_TRANSFER", y6.DEFI_TRANSFER));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f250876p = r0.k(new Pair("KARMA", c1.KARMA), new Pair("LENDING_WORKS", c1.LENDING_WORKS), new Pair("UNKNOWN", c1.UNKNOWN));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f250877q = r0.k(new Pair("CLAIMED", c5.CLAIMED), new Pair("UNCLAIMED", c5.UNCLAIMED), new Pair("RESPONDED", c5.RESPONDED), new Pair("SCHEDULED", c5.SCHEDULED));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f250878r = r0.k(new Pair("INCOMING", b5.INCOMING), new Pair("OUTGOING", b5.OUTGOING));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f250879s = r0.k(new Pair("PAY_OFF", d1.PAY_OFF), new Pair("REPAYMENT", d1.REPAYMENT), new Pair("PARTIAL_REPAYMENT", d1.PARTIAL_REPAYMENT), new Pair("OVERDUE_REPAYMENT", d1.OVERDUE_REPAYMENT), new Pair("OUTSTANDING_PARTIAL_REPAYMENT", d1.OUTSTANDING_PARTIAL_REPAYMENT), new Pair("PENALTY_REPAYMENT", d1.PENALTY_REPAYMENT));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f250880t = r0.k(new Pair("MANUAL", f1.MANUAL), new Pair("AUTO", f1.AUTOMATIC));
    public static final Object u = r0.k(new Pair("CHEQUE_DEPOSIT", w6.CHEQUE_DEPOSIT), new Pair("CRYPTO_WALLET", w6.CRYPTO_WALLET), new Pair("DIRECT_DEBIT", w6.DIRECT_DEBIT), new Pair("EXTERNAL_CARD", w6.EXTERNAL_CARD), new Pair("EXTERNAL_ACCOUNT", w6.EXTERNAL_ACCOUNT), new Pair("INVESTMENT_WALLET", w6.INVESTMENT_WALLET), new Pair("OPEN_BANKING", w6.OPEN_BANKING), new Pair("CASH_DEPOSIT", w6.CASH_DEPOSIT));
    public static final Object v = r0.k(new Pair("CHARGEBACK", r5.CHARGEBACK), new Pair("CHARGEBACK_REVERSAL", r5.CHARGEBACK_REVERSAL), new Pair("CREDIT_REIMBURSEMENT", r5.CREDIT_REIMBURSEMENT), new Pair("PAYMENT", r5.PAYMENT), new Pair("REFUND", r5.REFUND));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object f250881w = r0.k(new Pair("APPLE_PAY", q5.APPLE_PAY), new Pair("BANK_TRANSFER", q5.BANK_TRANSFER), new Pair("CARD", q5.CARD), new Pair("CARD_PRESENT", q5.CARD_PRESENT), new Pair("GOOGLE_PAY", q5.GOOGLE_PAY), new Pair("OPEN_BANKING", q5.OPEN_BANKING), new Pair("PAY_WITH_REVOLUT", q5.PAY_WITH_REVOLUT));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Object f250882x = r0.k(new Pair("CHARGEBACK", o5.CHARGEBACK), new Pair("CHARGEBACK_REVERSAL", o5.CHARGEBACK_REVERSAL), new Pair("CREDIT_REIMBURSEMENT", o5.CREDIT_REIMBURSEMENT), new Pair("PAYMENT", o5.PAYMENT), new Pair("PAYMENT_REQUEST", o5.PAYMENT_REQUEST), new Pair("REFUND", o5.REFUND));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object f250883y = r0.k(new Pair("AIRPLUS", m5.AIRPLUS), new Pair("AMERICAN_EXPRESS", m5.AMERICAN_EXPRESS), new Pair("AMEX", m5.AMEX), new Pair("DINER", m5.DINER), new Pair("DISCOVER", m5.DISCOVER), new Pair("JCB", m5.JCB), new Pair("MAESTRO", m5.MAESTRO), new Pair("MASTERCARD", m5.MASTERCARD), new Pair("PRIVATE_LABEL", m5.PRIVATE_LABEL), new Pair("VISA", m5.VISA));
    public static final Object z = r0.k(new Pair("WITHDRAWAL", g5.WITHDRAWAL), new Pair("TASK_REWARD", g5.TASK_REWARD), new Pair("P2P_TRANSFER", g5.P2P_TRANSFER));
    public static final Map A = q0.c(new Pair("ACTIVE", p1.ACTIVE));
    public static final Map B = q0.c(new Pair("CRYPTO", tof.r.CRYPTO));
    public static final Object C = r0.k(new Pair("ROBO", ic.ROBO), new Pair("MARGIN", ic.MARGIN), new Pair("GIA", ic.GIA), new Pair("TAX_ADVANTAGED", ic.TAX_ADVANTAGED), new Pair("UNKNOWN", ic.UNKNOWN));

    private a() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map a() {
        return f250867a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map b() {
        return f250875n;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map c() {
        return f250872j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map d() {
        return k;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map e() {
        return f250868b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map f() {
        return f250869c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map g() {
        return d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map h() {
        return e;
    }

    public static Map i() {
        return A;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map j() {
        return f250880t;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map k() {
        return f250870g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map l() {
        return f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map m() {
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map n() {
        return f250871h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map o() {
        return u;
    }

    public static Map p() {
        return f250873l;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map q() {
        return f250874m;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map r() {
        return o;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map s() {
        return C;
    }

    public static LocalDate t(String str) {
        if (str != null) {
            try {
                return new LocalDate(str);
            } catch (IllegalArgumentException e2) {
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.b(rd0.c.VERBOSE, null, null, e2, null, 16);
            }
        }
        return null;
    }
}

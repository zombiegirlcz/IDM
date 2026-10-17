package wnf;

import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import ql4.q0;
import tof.u2;
import tof.y6;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f298827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f298828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f298829c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[u2.values().length];
        try {
            iArr[u2.VAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u2.ROBO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u2.REVPOINTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[u2.CRYPTO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[u2.CHARITY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f298827a = iArr;
        int[] iArr2 = new int[y6.values().length];
        try {
            iArr2[y6.TOPUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[y6.TOPUP_RETURN.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[y6.TOPUP_CHARGEBACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[y6.ATM.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[y6.TRANSFER.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[y6.CARD_PAYMENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[y6.CARD_REFUND.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[y6.REFUND.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[y6.EXCHANGE.ordinal()] = 9;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[y6.REWARD.ordinal()] = 10;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[y6.FEE.ordinal()] = 11;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[y6.LOAN_PAYMENT.ordinal()] = 12;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[y6.LOAN_PAYOFF.ordinal()] = 13;
        } catch (NoSuchFieldError unused18) {
        }
        f298828b = iArr2;
        int[] iArr3 = new int[q0.values().length];
        try {
            iArr3[q0.POST_PURCHASE.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[q0.DEBIT_POST_PURCHASE_PLAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[q0.STATEMENT_DEFERRAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[q0.INTEREST_FREE.ordinal()] = 4;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[q0.PRE_PURCHASE.ordinal()] = 5;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[q0.UNSUPPORTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused24) {
        }
        f298829c = iArr3;
        int[] iArr4 = new int[BeneficiaryIdentificationType.values().length];
        try {
            iArr4[BeneficiaryIdentificationType.BR_CNPJ.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr4[BeneficiaryIdentificationType.BR_CPF.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        d = iArr4;
    }
}

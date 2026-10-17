package g25;

import ft3.j1;
import ft3.z0;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f139897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f139898c;

    static {
        int[] iArr = new int[fs3.b.values().length];
        try {
            iArr[fs3.b.LOAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fs3.b.REFINANCING_LOAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fs3.b.HOME_IMPROVEMENT_LOAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[fs3.b.MORTGAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[fs3.b.REFINANCING_MORTGAGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[fs3.b.CREDIT_CARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[fs3.b.SECURED_CREDIT_CARD.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[fs3.b.CREDIT_BUILDER_CARD.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[fs3.b.BALANCE_TRANSFER_CREDIT_CARD.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[fs3.b.PAY_LATER.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[fs3.b.OVERDRAFT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[fs3.b.CREDIT_HEALTH.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        f139896a = iArr;
        int[] iArr2 = new int[z0.values().length];
        try {
            iArr2[z0.BALANCE_TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        f139897b = iArr2;
        int[] iArr3 = new int[j1.values().length];
        try {
            iArr3[j1.CREDIT_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[j1.CREDIT_CARD_LIMIT_DECREASE.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[j1.CREDIT_CARD_LIMIT_INCREASE.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[j1.BUY_NOW_PAY_LATER.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[j1.FIXED_TERM_CREDIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[j1.MORTGAGE.ordinal()] = 6;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[j1.REFINANCING_MORTGAGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[j1.OVERDRAFT.ordinal()] = 8;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[j1.FAMILY_CREDIT_CARD.ordinal()] = 9;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[j1.BASIC_CREDIT_CARD.ordinal()] = 10;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[j1.FTC_FORBEARANCE.ordinal()] = 11;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr3[j1.CC_FORBEARANCE.ordinal()] = 12;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr3[j1.MORTGAGE_RENEGOTIATION.ordinal()] = 13;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr3[j1.POST_TERMINATION_REPAYMENT_PLAN.ordinal()] = 14;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr3[j1.POST_TERMINATION_PARTIAL_SETTLEMENTS.ordinal()] = 15;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr3[j1.NON_EMBEDDED_CREDIT_INSURANCE_CC.ordinal()] = 16;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr3[j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC.ordinal()] = 17;
        } catch (NoSuchFieldError unused30) {
        }
        f139898c = iArr3;
    }
}

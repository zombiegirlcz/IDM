package xq3;

import ft3.j1;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f308084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f308085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f308086c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.LEGACY_FEATURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.PRODUCT_CATALOGUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.FEATURE_TOGGLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m.ALWAYS_ENABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f308084a = iArr;
        int[] iArr2 = new int[it3.k.values().length];
        try {
            iArr2[it3.k.INVITATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        f308085b = iArr2;
        int[] iArr3 = new int[gt3.d.values().length];
        try {
            iArr3[gt3.d.HOME_IMPROVEMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        f308086c = iArr3;
        int[] iArr4 = new int[j1.values().length];
        try {
            iArr4[j1.MORTGAGE_RENEGOTIATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr4[j1.BASIC_CREDIT_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[j1.CC_FORBEARANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[j1.NON_EMBEDDED_CREDIT_INSURANCE_CC.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[j1.FAMILY_CREDIT_CARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[j1.CREDIT_CARD.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[j1.FIXED_TERM_CREDIT.ordinal()] = 8;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[j1.MORTGAGE.ordinal()] = 9;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[j1.REFINANCING_MORTGAGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[j1.OVERDRAFT.ordinal()] = 11;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[j1.BUY_NOW_PAY_LATER.ordinal()] = 12;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[j1.CREDIT_CARD_LIMIT_INCREASE.ordinal()] = 13;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[j1.FTC_FORBEARANCE.ordinal()] = 14;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[j1.CREDIT_CARD_LIMIT_DECREASE.ordinal()] = 15;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr4[j1.POST_TERMINATION_REPAYMENT_PLAN.ordinal()] = 16;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[j1.POST_TERMINATION_PARTIAL_SETTLEMENTS.ordinal()] = 17;
        } catch (NoSuchFieldError unused23) {
        }
        d = iArr4;
    }
}

package h54;

import ft3.j1;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f149476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f149477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f149478c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[yp3.b.values().length];
        try {
            iArr[yp3.b.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yp3.b.SKIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f149476a = iArr;
        int[] iArr2 = new int[j1.values().length];
        try {
            iArr2[j1.CREDIT_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[j1.FTC_FORBEARANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[j1.CC_FORBEARANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[j1.FIXED_TERM_CREDIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[j1.BUY_NOW_PAY_LATER.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[j1.CREDIT_CARD_LIMIT_INCREASE.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[j1.FAMILY_CREDIT_CARD.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[j1.BASIC_CREDIT_CARD.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[j1.MORTGAGE.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[j1.REFINANCING_MORTGAGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[j1.MORTGAGE_RENEGOTIATION.ordinal()] = 11;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[j1.OVERDRAFT.ordinal()] = 12;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[j1.POST_TERMINATION_REPAYMENT_PLAN.ordinal()] = 13;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[j1.POST_TERMINATION_PARTIAL_SETTLEMENTS.ordinal()] = 14;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[j1.CREDIT_CARD_LIMIT_DECREASE.ordinal()] = 15;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[j1.NON_EMBEDDED_CREDIT_INSURANCE_CC.ordinal()] = 16;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC.ordinal()] = 17;
        } catch (NoSuchFieldError unused19) {
        }
        f149477b = iArr2;
        int[] iArr3 = new int[c.values().length];
        try {
            iArr3[c.RESUME_INTRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[c.RESUME_APPLICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[c.KYC_VERIFICATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[c.PRODUCT_ELIGIBILITY_VERIFICATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[c.PRODUCT_INTRO.ordinal()] = 5;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr3[c.PRODUCT_ARTICLES.ordinal()] = 6;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr3[c.PRE_APPLICATION_CHECKS.ordinal()] = 7;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr3[c.PLAN_SELECTION.ordinal()] = 8;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr3[c.START_APPLICATION.ordinal()] = 9;
        } catch (NoSuchFieldError unused28) {
        }
        f149478c = iArr3;
        int[] iArr4 = new int[yp3.c.values().length];
        try {
            iArr4[yp3.c.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr4[yp3.c.FORCE_SKIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused30) {
        }
        d = iArr4;
        int[] iArr5 = new int[wp3.a.values().length];
        try {
            iArr5[wp3.a.OPEN_EXISTING_APPLICATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr5[wp3.a.START_FORCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused32) {
        }
        e = iArr5;
        int[] iArr6 = new int[it3.h.values().length];
        try {
            iArr6[it3.h.NOT_ELIGIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr6[it3.h.ELIGIBLE_WITH_CREDIT_HEALTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr6[it3.h.MAINTENANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr6[it3.h.UPDATE_REQUIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr6[it3.h.MULTIPLE_APPLICATIONS.ordinal()] = 5;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr6[it3.h.FACILITY_ALREADY_ACTIVE.ordinal()] = 6;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr6[it3.h.WAITING_LIST.ordinal()] = 7;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr6[it3.h.ELIGIBLE.ordinal()] = 8;
        } catch (NoSuchFieldError unused40) {
        }
        f = iArr6;
    }
}

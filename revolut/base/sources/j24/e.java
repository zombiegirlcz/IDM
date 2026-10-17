package j24;

import ft3.j1;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f170693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f170694b;

    static {
        int[] iArr = new int[j1.values().length];
        try {
            iArr[j1.CREDIT_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j1.FIXED_TERM_CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j1.MORTGAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j1.REFINANCING_MORTGAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[j1.OVERDRAFT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[j1.BUY_NOW_PAY_LATER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[j1.FAMILY_CREDIT_CARD.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[j1.NON_EMBEDDED_CREDIT_INSURANCE_CC.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[j1.CREDIT_CARD_LIMIT_INCREASE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[j1.BASIC_CREDIT_CARD.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[j1.FTC_FORBEARANCE.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[j1.CC_FORBEARANCE.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[j1.MORTGAGE_RENEGOTIATION.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[j1.POST_TERMINATION_REPAYMENT_PLAN.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[j1.POST_TERMINATION_PARTIAL_SETTLEMENTS.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[j1.CREDIT_CARD_LIMIT_DECREASE.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        f170693a = iArr;
        int[] iArr2 = new int[com.revolut.feature.credit.application.plugins.impl.ui.application.a.values().length];
        try {
            iArr2[com.revolut.feature.credit.application.plugins.impl.ui.application.a.Tutorial.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[com.revolut.feature.credit.application.plugins.impl.ui.application.a.WaitingList.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        f170694b = iArr2;
    }
}

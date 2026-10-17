package hz3;

import ft3.j1;
import ju3.g;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f157012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f157013b;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.BOTTOM_SHEET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.STATUS_DIALOG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f157012a = iArr;
        int[] iArr2 = new int[j1.values().length];
        try {
            iArr2[j1.CREDIT_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[j1.BUY_NOW_PAY_LATER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[j1.OVERDRAFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[j1.FAMILY_CREDIT_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[j1.BASIC_CREDIT_CARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[j1.FIXED_TERM_CREDIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[j1.CREDIT_CARD_LIMIT_INCREASE.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[j1.FTC_FORBEARANCE.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[j1.CC_FORBEARANCE.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[j1.MORTGAGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[j1.REFINANCING_MORTGAGE.ordinal()] = 11;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[j1.MORTGAGE_RENEGOTIATION.ordinal()] = 12;
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
        f157013b = iArr2;
    }
}

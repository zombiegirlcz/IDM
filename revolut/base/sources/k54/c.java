package k54;

import ft3.j1;
import it3.k;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f181386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f181387b;

    static {
        int[] iArr = new int[j1.values().length];
        try {
            iArr[j1.FTC_FORBEARANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j1.CC_FORBEARANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j1.CREDIT_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j1.CREDIT_CARD_LIMIT_INCREASE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[j1.FAMILY_CREDIT_CARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[j1.BASIC_CREDIT_CARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[j1.CREDIT_CARD_LIMIT_DECREASE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[j1.FIXED_TERM_CREDIT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[j1.BUY_NOW_PAY_LATER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[j1.MORTGAGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[j1.REFINANCING_MORTGAGE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[j1.MORTGAGE_RENEGOTIATION.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[j1.OVERDRAFT.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[j1.POST_TERMINATION_REPAYMENT_PLAN.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[j1.POST_TERMINATION_PARTIAL_SETTLEMENTS.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[j1.NON_EMBEDDED_CREDIT_INSURANCE_CC.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        f181386a = iArr;
        int[] iArr2 = new int[k.values().length];
        try {
            iArr2[k.INVITATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[k.CC_CLI_USER_INITIATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[k.CC_RETAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[k.CC_SECURED_RETAIL.ordinal()] = 4;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[k.CC_SECURED.ordinal()] = 5;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[k.CC_BUILDER.ordinal()] = 6;
        } catch (NoSuchFieldError unused23) {
        }
        f181387b = iArr2;
    }
}

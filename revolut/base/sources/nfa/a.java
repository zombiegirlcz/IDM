package nfa;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f214884a;

    static {
        int[] iArr = new int[ofa.b.values().length];
        try {
            iArr[ofa.b.CARD_CHECKOUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ofa.b.PLAN_AND_CARD_CHECKOUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ofa.b.PLAN_AND_CARD_CREDIT_CHECKOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ofa.b.VIRTUAL_CARD_AND_TOPUP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ofa.b.VIRTUAL_CARD_AND_TOPUP_NRA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ofa.b.CREDIT_ONBOARDING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ofa.b.RETAIL_CREDIT_ONBOARDING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ofa.b.PRO_ONBOARDING.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ofa.b.COBRANDS_ONBOARDING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ofa.b.RETAIL_CREDIT_ONBOARDING_WAITING.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f214884a = iArr;
    }
}

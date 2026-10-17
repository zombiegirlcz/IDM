package br4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17891b;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.PROMOTIONAL_PERIOD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.CREDIT_CARD_LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.GET_HELP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.CANCEL_CREDIT_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h.STATEMENTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[h.AUTO_PAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[h.DUE_DATE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[h.DISPLAY_AMOUNT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[h.PLAN_BENEFITS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[h.CREDIT_CARDS.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[h.DOCUMENTS_RATES_INFO.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f17890a = iArr;
        int[] iArr2 = new int[yw4.d.values().length];
        try {
            iArr2[yw4.d.CANCELLATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[yw4.d.WITHDRAWAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[yw4.d.NOT_AVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        f17891b = iArr2;
    }
}

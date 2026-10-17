package lnd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f197186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f197187b;

    static {
        int[] iArr = new int[he3.l.values().length];
        try {
            iArr[he3.l.CATEGORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[he3.l.MERCHANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[he3.l.COUNTRY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[he3.l.COUNTRY_OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[he3.l.CARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[he3.l.CARD_OTHER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[he3.l.CURRENCY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[he3.l.SAVINGS_TRANSACTION_TYPE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[he3.l.SAVINGS_OPERATION_TYPE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[he3.l.CARDHOLDERS.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[he3.l.PARTICIPANTS.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[he3.l.SOURCE_ACCOUNT.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[he3.l.PRO_APPLE_PAY.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[he3.l.PRO_CARD_READER.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[he3.l.PRO_POS.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[he3.l.PRO_E_COMMERCE.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[he3.l.PRO_INVOICE.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[he3.l.PRO_PAYMENT_LINK.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[he3.l.PRO_QR_CODE.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        f197186a = iArr;
        int[] iArr2 = new int[fnd.a.values().length];
        try {
            iArr2[fnd.a.INFLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[fnd.a.OUTFLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        f197187b = iArr2;
    }
}

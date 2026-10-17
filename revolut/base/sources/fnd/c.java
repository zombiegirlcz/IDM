package fnd;

import ejb.j;
import ejb.o;
import he3.l;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f136672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f136673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f136674c;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.CATEGORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.MERCHANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.COUNTRY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l.COUNTRY_OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l.CURRENCY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[l.SAVINGS_TRANSACTION_TYPE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[l.SAVINGS_OPERATION_TYPE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[l.CARDHOLDERS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[l.PARTICIPANTS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[l.SOURCE_ACCOUNT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[l.CARD.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[l.CARD_OTHER.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[l.PRO_APPLE_PAY.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[l.PRO_CARD_READER.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[l.PRO_POS.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[l.PRO_E_COMMERCE.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[l.PRO_INVOICE.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[l.PRO_PAYMENT_LINK.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[l.PRO_QR_CODE.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        f136672a = iArr;
        int[] iArr2 = new int[o.values().length];
        try {
            iArr2[o.MONEY_OUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[o.MONEY_IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[o.INTEREST.ordinal()] = 3;
        } catch (NoSuchFieldError unused22) {
        }
        f136673b = iArr2;
        int[] iArr3 = new int[j.values().length];
        try {
            iArr3[j.TOP_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[j.AUTO_TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr3[j.WITHDRAWAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr3[j.INTEREST.ordinal()] = 4;
        } catch (NoSuchFieldError unused26) {
        }
        f136674c = iArr3;
    }
}

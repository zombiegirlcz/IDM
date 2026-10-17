package awe;

import com.revolut.domain.models.topup.methods.TopupMethodType;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f10768a;

    static {
        int[] iArr = new int[TopupMethodType.values().length];
        try {
            iArr[TopupMethodType.BREB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TopupMethodType.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TopupMethodType.CASH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TopupMethodType.CHECK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TopupMethodType.CHECKOUT_PREORDER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TopupMethodType.EASY_BANK_TRANSFER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TopupMethodType.GOOGLE_PAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[TopupMethodType.IDEAL.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[TopupMethodType.MCY_BANK_TRANSFER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[TopupMethodType.MCY_NET_BANKING.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[TopupMethodType.MCY_UPI_APP.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[TopupMethodType.MOVE_MONEY.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[TopupMethodType.NET_BANKING.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[TopupMethodType.PAYNOW.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[TopupMethodType.PAY_TO.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[TopupMethodType.PIX.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[TopupMethodType.PIX_SMART_TRANSFER.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[TopupMethodType.PSE.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[TopupMethodType.REVOLUT_ACCOUNT.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[TopupMethodType.UPI_APP.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[TopupMethodType.ACCOUNT_SWITCH.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[TopupMethodType.AKAHU.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[TopupMethodType.GMO_PG_BANK_DIRECT.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[TopupMethodType.BANK_TRANSFER.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[TopupMethodType.CONNECT_NEW_BANK_DIRECT_LINK.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[TopupMethodType.CONNECT_NEW_BANK_OAUTH_ONCE.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[TopupMethodType.DIRECT_DEPOSIT.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[TopupMethodType.SALARY.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        f10768a = iArr;
    }
}

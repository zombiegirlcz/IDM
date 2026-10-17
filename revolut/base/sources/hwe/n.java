package hwe;

import com.revolut.domain.models.topup.methods.TopupMethodType;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f156150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f156151b;

    static {
        int[] iArr = new int[yte.n.values().length];
        try {
            iArr[yte.n.PRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yte.n.CURRENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yte.n.SAVINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yte.n.INVEST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[yte.n.JOINT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[yte.n.CARD_CHECKOUT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[yte.n.THREE_DS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[yte.n.REVPAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[yte.n.CARD_CHECKOUT_IND_GLOBAL.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[yte.n.REVX.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f156150a = iArr;
        int[] iArr2 = new int[TopupMethodType.values().length];
        try {
            iArr2[TopupMethodType.CASH.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[TopupMethodType.GOOGLE_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[TopupMethodType.CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[TopupMethodType.EASY_BANK_TRANSFER.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[TopupMethodType.CHECK.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[TopupMethodType.REVOLUT_ACCOUNT.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[TopupMethodType.CHECKOUT_PREORDER.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[TopupMethodType.PAY_TO.ordinal()] = 8;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[TopupMethodType.UPI_APP.ordinal()] = 9;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[TopupMethodType.MCY_UPI_APP.ordinal()] = 10;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[TopupMethodType.NET_BANKING.ordinal()] = 11;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[TopupMethodType.MCY_NET_BANKING.ordinal()] = 12;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[TopupMethodType.MCY_BANK_TRANSFER.ordinal()] = 13;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[TopupMethodType.IDEAL.ordinal()] = 14;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[TopupMethodType.BREB.ordinal()] = 15;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[TopupMethodType.PSE.ordinal()] = 16;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[TopupMethodType.PIX.ordinal()] = 17;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[TopupMethodType.PIX_SMART_TRANSFER.ordinal()] = 18;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[TopupMethodType.PAYNOW.ordinal()] = 19;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[TopupMethodType.MOVE_MONEY.ordinal()] = 20;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[TopupMethodType.BANK_TRANSFER.ordinal()] = 21;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[TopupMethodType.SALARY.ordinal()] = 22;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[TopupMethodType.ACCOUNT_SWITCH.ordinal()] = 23;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[TopupMethodType.DIRECT_DEPOSIT.ordinal()] = 24;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[TopupMethodType.CONNECT_NEW_BANK_DIRECT_LINK.ordinal()] = 25;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[TopupMethodType.CONNECT_NEW_BANK_OAUTH_ONCE.ordinal()] = 26;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[TopupMethodType.AKAHU.ordinal()] = 27;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[TopupMethodType.GMO_PG_BANK_DIRECT.ordinal()] = 28;
        } catch (NoSuchFieldError unused38) {
        }
        f156151b = iArr2;
    }
}

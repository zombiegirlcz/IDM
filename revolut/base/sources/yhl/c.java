package yhl;

import iel.j;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f314174b;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.MARKET_HOLIDAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.CASH_DIVIDEND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.STOCK_DIVIDEND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j.STOCK_SPLIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[j.LISTING_STATUS_CHANGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[j.SYMBOL_CHANGE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[j.EARNINGS_CALL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[j.EX_DIVIDEND.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[j.MERGER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[j.SPINOFF.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[j.BANKRUPTCY.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[j.BOND_COUPON.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[j.INTEREST_PAYMENT.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[j.EARLY_REDEMPTION.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[j.MATURITY_REDEMPTION.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[j.UNKNOWN.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        f314173a = iArr;
        int[] iArr2 = new int[iel.e.values().length];
        try {
            iArr2[iel.e.EX_DIVIDEND.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[iel.e.DIVIDENDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[iel.e.MARKET_HOLIDAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[iel.e.LISTING_CHANGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[iel.e.STOCK_SPLIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[iel.e.SYMBOL_CHANGE.ordinal()] = 6;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[iel.e.COMPANY_MEETING.ordinal()] = 7;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[iel.e.MERGER.ordinal()] = 8;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[iel.e.SPINOFF.ordinal()] = 9;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[iel.e.BANKRUPTCY.ordinal()] = 10;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[iel.e.COUPON.ordinal()] = 11;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[iel.e.CALL.ordinal()] = 12;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[iel.e.PRINCIPAL.ordinal()] = 13;
        } catch (NoSuchFieldError unused29) {
        }
        f314174b = iArr2;
    }
}

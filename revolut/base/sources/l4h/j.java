package l4h;

import nel.z;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f192136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f192137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f192138c;

    static {
        int[] iArr = new int[eel.i.values().length];
        try {
            iArr[eel.i.PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[eel.i.YTM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f192136a = iArr;
        int[] iArr2 = new int[eel.c.values().length];
        try {
            iArr2[eel.c.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[eel.c.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[eel.c.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[eel.c.SIX_MONTHS.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[eel.c.ONE_YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[eel.c.FIVE_YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[eel.c.ALL.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[eel.c.YEAR_TO_DATE.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[eel.c.TEN_YEARS.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        f192137b = iArr2;
        int[] iArr3 = new int[z.values().length];
        try {
            iArr3[z.FUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[z.ADR.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[z.ETF.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[z.ETC.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[z.ETN.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[z.EQUITY.ordinal()] = 6;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[z.WARRANT.ordinal()] = 7;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[z.SPAC.ordinal()] = 8;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[z.CFD.ordinal()] = 9;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[z.BOND.ordinal()] = 10;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[z.COMMODITY.ordinal()] = 11;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[z.MUTUAL_FUND.ordinal()] = 12;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[z.STRUCTURED_NOTE.ordinal()] = 13;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr3[z.OPTION.ordinal()] = 14;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr3[z.UNSPECIFIED.ordinal()] = 15;
        } catch (NoSuchFieldError unused26) {
        }
        f192138c = iArr3;
    }
}

package i4h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f158443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f158444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f158445c;

    static {
        int[] iArr = new int[nel.z.values().length];
        try {
            iArr[nel.z.CFD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[nel.z.BOND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[nel.z.UNSPECIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[nel.z.ADR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[nel.z.ETF.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[nel.z.ETC.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[nel.z.ETN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[nel.z.EQUITY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[nel.z.WARRANT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[nel.z.SPAC.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[nel.z.COMMODITY.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[nel.z.FUND.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[nel.z.MUTUAL_FUND.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[nel.z.STRUCTURED_NOTE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[nel.z.OPTION.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        f158443a = iArr;
        int[] iArr2 = new int[eel.c.values().length];
        try {
            iArr2[eel.c.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[eel.c.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[eel.c.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[eel.c.SIX_MONTHS.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[eel.c.ONE_YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[eel.c.FIVE_YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[eel.c.ALL.ordinal()] = 7;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[eel.c.YEAR_TO_DATE.ordinal()] = 8;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[eel.c.TEN_YEARS.ordinal()] = 9;
        } catch (NoSuchFieldError unused24) {
        }
        int[] iArr3 = new int[eel.i.values().length];
        try {
            iArr3[eel.i.PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr3[eel.i.YTM.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        f158444b = iArr3;
        int[] iArr4 = new int[i4l.a.values().length];
        try {
            iArr4[i4l.a.LINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr4[i4l.a.CANDLESTICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused28) {
        }
        f158445c = iArr4;
    }
}

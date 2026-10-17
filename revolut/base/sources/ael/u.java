package ael;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f3663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f3664c;

    static {
        int[] iArr = new int[del.d.values().length];
        try {
            iArr[del.d.TotalValue.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[del.d.Performance.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[del.d.Alphabetical.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[del.d.Products.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f3662a = iArr;
        int[] iArr2 = new int[del.e.values().length];
        try {
            iArr2[del.e.Ascending.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[del.e.Descending.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f3663b = iArr2;
        int[] iArr3 = new int[nel.z.values().length];
        try {
            iArr3[nel.z.ADR.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[nel.z.EQUITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[nel.z.WARRANT.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[nel.z.SPAC.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[nel.z.FUND.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[nel.z.ETF.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[nel.z.ETC.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[nel.z.ETN.ordinal()] = 8;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[nel.z.BOND.ordinal()] = 9;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[nel.z.CFD.ordinal()] = 10;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[nel.z.COMMODITY.ordinal()] = 11;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[nel.z.MUTUAL_FUND.ordinal()] = 12;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[nel.z.STRUCTURED_NOTE.ordinal()] = 13;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[nel.z.OPTION.ordinal()] = 14;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[nel.z.UNSPECIFIED.ordinal()] = 15;
        } catch (NoSuchFieldError unused21) {
        }
        f3664c = iArr3;
    }
}

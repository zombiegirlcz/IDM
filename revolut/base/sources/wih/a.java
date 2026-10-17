package wih;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f297895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f297896b;

    static {
        int[] iArr = new int[sih.c.values().length];
        try {
            iArr[sih.c.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sih.c.BONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[sih.c.ETF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[sih.c.CFD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[sih.c.COMMODITIES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[sih.c.PRIVATE_MARKETS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[sih.c.MUTUAL_FUNDS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[sih.c.STRUCTURED_NOTES.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[sih.c.STRATEGIES.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f297895a = iArr;
        int[] iArr2 = new int[tih.d.values().length];
        try {
            iArr2[tih.d.BONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[tih.d.ETFS.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[tih.d.PRIVATE_MARKETS.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[tih.d.GIA_MARGIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[tih.d.SECURITIES.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[tih.d.TAA_ISA.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[tih.d.TAA_CUSTODIAN_JISA.ordinal()] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[tih.d.TAA_PERSONAL_JISA.ordinal()] = 8;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[tih.d.TAA_PEA.ordinal()] = 9;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[tih.d.ROBO.ordinal()] = 10;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[tih.d.JOINT_SECURITIES.ordinal()] = 11;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[tih.d.MARGIN.ordinal()] = 12;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[tih.d.COMMODITIES.ordinal()] = 13;
        } catch (NoSuchFieldError unused22) {
        }
        f297896b = iArr2;
    }
}

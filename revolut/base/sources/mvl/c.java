package mvl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f209274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f209275b;

    static {
        int[] iArr = new int[l4l.a.values().length];
        try {
            iArr[l4l.a.RETAIL_FIAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l4l.a.TRADING_GIA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l4l.a.TRADING_GIA_CBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l4l.a.JOINT_TRADING_GIA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l4l.a.TRADING_TAA_ISA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[l4l.a.TRADING_TAA_JISA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[l4l.a.TRADING_TAA_PEA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[l4l.a.COMMODITIES.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[l4l.a.CRYPTO.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[l4l.a.VAULTS.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[l4l.a.SAVINGS.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f209274a = iArr;
        int[] iArr2 = new int[nel.b.values().length];
        try {
            iArr2[nel.b.NON_FRACTIONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[nel.b.FRACTIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        f209275b = iArr2;
    }
}

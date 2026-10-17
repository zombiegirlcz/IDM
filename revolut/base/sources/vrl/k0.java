package vrl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f291646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f291647b;

    static {
        int[] iArr = new int[l4l.a.values().length];
        try {
            iArr[l4l.a.RETAIL_FIAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l4l.a.COMMODITIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l4l.a.CRYPTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l4l.a.VAULTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l4l.a.SAVINGS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[l4l.a.TRADING_GIA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[l4l.a.TRADING_GIA_CBP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[l4l.a.JOINT_TRADING_GIA.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[l4l.a.TRADING_TAA_ISA.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[l4l.a.TRADING_TAA_JISA.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[l4l.a.TRADING_TAA_PEA.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f291646a = iArr;
        int[] iArr2 = new int[m4l.l.values().length];
        try {
            iArr2[m4l.l.INVESTMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[m4l.l.PERSONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        f291647b = iArr2;
    }
}

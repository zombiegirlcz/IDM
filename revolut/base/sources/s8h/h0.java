package s8h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f261007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f261008c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.SECURITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.CFD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.BOND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[d.CRYPTO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f261006a = iArr;
        int[] iArr2 = new int[f.values().length];
        try {
            iArr2[f.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[f.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[f.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[f.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[f.FIVE_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f261007b = iArr2;
        int[] iArr3 = new int[f0.values().length];
        try {
            iArr3[f0.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[f0.GAINERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[f0.LOSERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        f261008c = iArr3;
        int[] iArr4 = new int[xzg.n0.values().length];
        try {
            iArr4[xzg.n0.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[xzg.n0.GAINERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[xzg.n0.LOSERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        d = iArr4;
        int[] iArr5 = new int[xzg.l0.values().length];
        try {
            iArr5[xzg.l0.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[xzg.l0.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[xzg.l0.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[xzg.l0.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr5[xzg.l0.FIVE_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused21) {
        }
        e = iArr5;
    }
}

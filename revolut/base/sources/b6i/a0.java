package b6i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f12756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f12757c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int[] f12758g;

    static {
        int[] iArr = new int[j8l.d.values().length];
        try {
            iArr[j8l.d.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j8l.d.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f12755a = iArr;
        int[] iArr2 = new int[t6i.a.values().length];
        try {
            iArr2[t6i.a.SCHEDULING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[t6i.a.BALANCE_BASED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[t6i.a.EXCHANGE_RATE_BASED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f12756b = iArr2;
        int[] iArr3 = new int[l.values().length];
        try {
            iArr3[l.TOP_TO_BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[l.BOTTOM_TO_TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f12757c = iArr3;
        int[] iArr4 = new int[t6i.c.values().length];
        try {
            iArr4[t6i.c.LIMIT_ORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[t6i.c.STOP_ORDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        d = iArr4;
        int[] iArr5 = new int[j.values().length];
        try {
            iArr5[j.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr5[j.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        e = iArr5;
        int[] iArr6 = new int[x5i.l.values().length];
        try {
            iArr6[x5i.l.LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr6[x5i.l.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        f = iArr6;
        int[] iArr7 = new int[u6i.c.values().length];
        try {
            iArr7[u6i.c.SCHEDULING.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr7[u6i.c.MARKET_ORDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr7[u6i.c.LIMIT_ORDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr7[u6i.c.STOP_ORDER.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        f12758g = iArr7;
    }
}

package ct0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f108562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f108563c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[u.values().length];
        try {
            iArr[u.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u.UP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[u.DOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f108561a = iArr;
        int[] iArr2 = new int[q.values().length];
        try {
            iArr2[q.SOLID.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[q.GRADIENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f108562b = iArr2;
        int[] iArr3 = new int[vs0.b.values().length];
        try {
            iArr3[vs0.b.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[vs0.b.ALWAYS_SELECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f108563c = iArr3;
        int[] iArr4 = new int[x.values().length];
        try {
            iArr4[x.SELECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[x.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[x.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        d = iArr4;
        int[] iArr5 = new int[t.values().length];
        try {
            iArr5[t.BASIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr5[t.POSITIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr5[t.NEGATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr5[t.STATIC.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[t.WARNING.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr5[t.MONOCHROMATIC.ordinal()] = 6;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[t.DIMMED.ordinal()] = 7;
        } catch (NoSuchFieldError unused18) {
        }
        e = iArr5;
        int[] iArr6 = new int[w.values().length];
        try {
            iArr6[w.TIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr6[w.BODY.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr6[w.BASE.ordinal()] = 3;
        } catch (NoSuchFieldError unused21) {
        }
        f = iArr6;
    }
}

package au0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f9258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f9259c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[s0.values().length];
        try {
            iArr[s0.LEFT_ALIGNED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s0.CENTERED_HORIZONTALLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s0.CENTERED_HORIZONTALLY_SMALL_BUTTONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s0.CENTERED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[s0.CENTERED_SMALL_BUTTONS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f9257a = iArr;
        int[] iArr2 = new int[m0.values().length];
        try {
            iArr2[m0.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[m0.FULL_GRADIENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[m0.BOTTOM_BLUR.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f9258b = iArr2;
        int[] iArr3 = new int[r0.values().length];
        try {
            iArr3[r0.BLURRED_BACKGROUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[r0.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f9259c = iArr3;
        int[] iArr4 = new int[b1.values().length];
        try {
            iArr4[b1.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[b1.LARGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[b1.LARGE_SINGLE_LINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[b1.MARKETING.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
        int[] iArr5 = new int[f2.values().length];
        try {
            iArr5[f2.LINE_INDICATOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[f2.COUNT_TAG.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr5[f2.DOT_INDICATOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        e = iArr5;
        int[] iArr6 = new int[v0.values().length];
        try {
            iArr6[v0.FAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr6[v0.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr6[v0.SLOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr6[v0.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused21) {
        }
        f = iArr6;
    }
}

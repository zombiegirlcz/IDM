package zc0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f321005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f321006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f321007c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int[] f321008g;

    static {
        int[] iArr = new int[xl2.d0.values().length];
        try {
            iArr[xl2.d0.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xl2.d0.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xl2.d0.EXIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[xl2.d0.PENDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f321005a = iArr;
        int[] iArr2 = new int[xl2.s.values().length];
        try {
            iArr2[xl2.s.STANDARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[xl2.s.INLINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f321006b = iArr2;
        int[] iArr3 = new int[xl2.w.values().length];
        try {
            iArr3[xl2.w.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[xl2.w.WITHOUT_CURRENCY_CODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f321007c = iArr3;
        int[] iArr4 = new int[xl2.f0.values().length];
        try {
            iArr4[xl2.f0.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[xl2.f0.UPPERCASE.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        d = iArr4;
        int[] iArr5 = new int[xl2.e0.values().length];
        try {
            iArr5[xl2.e0.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr5[xl2.e0.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        e = iArr5;
        int[] iArr6 = new int[xl2.n.values().length];
        try {
            iArr6[xl2.n.DROPDOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr6[xl2.n.LIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        f = iArr6;
        int[] iArr7 = new int[xl2.e.values().length];
        try {
            iArr7[xl2.e.UPLOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr7[xl2.e.UPLOAD_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr7[xl2.e.VALIDATING.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr7[xl2.e.VALIDATION_FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr7[xl2.e.SUCCESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        f321008g = iArr7;
    }
}

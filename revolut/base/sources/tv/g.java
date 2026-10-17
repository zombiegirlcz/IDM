package tv;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f274644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f274645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f274646c;

    static {
        int[] iArr = new int[r00.b.values().length];
        try {
            iArr[r00.b.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r00.b.DARK_COUNTOUR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r00.b.BRIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r00.b.BLUR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[r00.b.GLARE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[r00.b.FACE_OCCLUDED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[r00.b.SUNGLASSES.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[r00.b.MISSING_FACE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[r00.b.COLORIZED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[r00.b.FRAUD.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[r00.b.EYES_CLOSED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f274644a = iArr;
        int[] iArr2 = new int[b00.c.values().length];
        try {
            iArr2[b00.c.TOO_DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[b00.c.TOO_BRIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        f274645b = iArr2;
        int[] iArr3 = new int[w00.a.values().length];
        try {
            iArr3[w00.a.TOO_FAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[w00.a.TOO_CLOSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        f274646c = iArr3;
    }
}

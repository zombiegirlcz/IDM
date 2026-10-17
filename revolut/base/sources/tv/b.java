package tv;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f274638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f274639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f274640c;

    static {
        int[] iArr = new int[b00.c.values().length];
        try {
            iArr[b00.c.TOO_DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b00.c.TOO_BRIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f274638a = iArr;
        int[] iArr2 = new int[j00.a.values().length];
        try {
            iArr2[j00.a.BLUR.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[j00.a.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[j00.a.BRIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[j00.a.GLARE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f274639b = iArr2;
        int[] iArr3 = new int[w00.a.values().length];
        try {
            iArr3[w00.a.TOO_FAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[w00.a.TOO_CLOSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f274640c = iArr3;
    }
}

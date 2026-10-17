package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class bi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f163613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f163614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f163615c;

    static {
        int[] iArr = new int[wh.values().length];
        try {
            iArr[wh.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wh.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wh.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f163613a = iArr;
        int[] iArr2 = new int[zh.values().length];
        try {
            iArr2[zh.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[zh.ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f163614b = iArr2;
        int[] iArr3 = new int[yh.values().length];
        try {
            iArr3[yh.PORTRAIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[yh.SQUARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[yh.CHALLENGES.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f163615c = iArr3;
    }
}

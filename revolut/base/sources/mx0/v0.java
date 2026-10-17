package mx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f210036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f210037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f210038c;

    static {
        int[] iArr = new int[u0.values().length];
        try {
            iArr[u0.FINISH_ACTION_MODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u0.PREFIX_CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u0.SUFFIX_CLICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[u0.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f210036a = iArr;
        int[] iArr2 = new int[k0.values().length];
        try {
            iArr2[k0.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[k0.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[k0.REMOVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f210037b = iArr2;
        int[] iArr3 = new int[m0.values().length];
        try {
            iArr3[m0.ANIMATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[m0.FORCED_IMMEDIATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        f210038c = iArr3;
    }
}

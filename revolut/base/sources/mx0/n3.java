package mx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f209851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f209852b;

    static {
        int[] iArr = new int[bw0.l.values().length];
        try {
            iArr[bw0.l.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bw0.l.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bw0.l.WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[bw0.l.ACTION_INFO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[bw0.l.ACTION_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[bw0.l.ACTION_ACCENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[bw0.l.LOADING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f209851a = iArr;
        int[] iArr2 = new int[m3.values().length];
        try {
            iArr2[m3.ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[m3.OFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        f209852b = iArr2;
    }
}

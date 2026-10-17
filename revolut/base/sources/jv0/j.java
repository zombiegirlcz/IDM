package jv0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f178746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f178747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f178748c;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.STOP_ON_DETACH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.PAUSE_ON_DETACH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f178746a = iArr;
        int[] iArr2 = new int[oz0.d.values().length];
        try {
            iArr2[oz0.d.AUTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[oz0.d.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f178747b = iArr2;
        int[] iArr3 = new int[oz0.b.values().length];
        try {
            iArr3[oz0.b.CENTER_CROP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[oz0.b.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[oz0.b.FILL.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[oz0.b.FIXED_WIDTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f178748c = iArr3;
    }
}

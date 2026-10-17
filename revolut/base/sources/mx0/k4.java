package mx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f209789a;

    static {
        int[] iArr = new int[d4.values().length];
        try {
            iArr[d4.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d4.HOLD_HINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d4.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d4.PREVIEW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[d4.RECORDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[d4.HANDS_FREE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f209789a = iArr;
    }
}

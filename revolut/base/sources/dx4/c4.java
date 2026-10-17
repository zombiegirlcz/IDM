package dx4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f120568a;

    static {
        int[] iArr = new int[y3.values().length];
        try {
            iArr[y3.FOREGROUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y3.GREY_TONE_50.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y3.STATUS_WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[y3.STATUS_DANGER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[y3.STATUS_SUCCESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f120568a = iArr;
    }
}

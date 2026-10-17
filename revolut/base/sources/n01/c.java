package n01;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f210849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f210850b;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.FOREGROUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.GREY_TONE_50.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f210849a = iArr;
        int[] iArr2 = new int[h.values().length];
        try {
            iArr2[h.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[h.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f210850b = iArr2;
    }
}

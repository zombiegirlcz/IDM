package tx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f275118a;

    static {
        int[] iArr = new int[b1.values().length];
        try {
            iArr[b1.FAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b1.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b1.SLOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b1.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f275118a = iArr;
    }
}

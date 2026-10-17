package op0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f227209a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.LARGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q.DYNAMIC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f227209a = iArr;
    }
}

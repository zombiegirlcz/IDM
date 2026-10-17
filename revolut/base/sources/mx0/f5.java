package mx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f209698a;

    static {
        int[] iArr = new int[pr0.d.values().length];
        try {
            iArr[pr0.d.DMY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pr0.d.MDY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pr0.d.YMD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f209698a = iArr;
    }
}

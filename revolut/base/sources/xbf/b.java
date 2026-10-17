package xbf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f304069a;

    static {
        int[] iArr = new int[wbf.d.values().length];
        try {
            iArr[wbf.d.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wbf.d.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wbf.d.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f304069a = iArr;
    }
}

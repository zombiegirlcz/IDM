package yp0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315726a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f315726a = iArr;
    }
}

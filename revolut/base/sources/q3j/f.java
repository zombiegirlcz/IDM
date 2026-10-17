package q3j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f241982a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.KEEP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.REMOVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.UPDATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f241982a = iArr;
    }
}

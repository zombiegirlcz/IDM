package d0d;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f110346a;

    static {
        int[] iArr = new int[g0d.a.values().length];
        try {
            iArr[g0d.a.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0d.a.LIMITED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g0d.a.LOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f110346a = iArr;
    }
}

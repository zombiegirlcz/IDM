package lwl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f200494a;

    static {
        int[] iArr = new int[nwl.g.values().length];
        f200494a = iArr;
        try {
            iArr[nwl.g.BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f200494a[nwl.g.FINISH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f200494a[nwl.g.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

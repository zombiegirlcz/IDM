package hld;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f153440a;

    static {
        int[] iArr = new int[uld.a.values().length];
        try {
            iArr[uld.a.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[uld.a.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f153440a = iArr;
    }
}

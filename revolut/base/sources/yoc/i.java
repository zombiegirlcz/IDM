package yoc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315647a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.RECOMMENDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f315647a = iArr;
    }
}

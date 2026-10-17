package ueg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f279389a;

    static {
        int[] iArr = new int[u.values().length];
        try {
            iArr[u.ANCHORED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u.COLLAPSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u.EXPANDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f279389a = iArr;
    }
}

package pq0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f238674a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.COLLAPSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.EXPANDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f238674a = iArr;
    }
}

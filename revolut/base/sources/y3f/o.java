package y3f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f310716a;

    static {
        int[] iArr = new int[y2f.b.values().length];
        try {
            iArr[y2f.b.HISTORY_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y2f.b.WAIT_FOR_INCREMENTAL_UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f310716a = iArr;
    }
}

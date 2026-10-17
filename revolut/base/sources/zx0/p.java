package zx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f326009a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.SEMI_OPEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.EXPANDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j.EXPANDED_SEARCH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f326009a = iArr;
    }
}

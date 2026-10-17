package ox4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f230552a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.SEARCH_BY_ID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.SEARCH_BY_ATTRIBUTES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f230552a = iArr;
    }
}

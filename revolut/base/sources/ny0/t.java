package ny0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f220611a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.MOST_RESTRICTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.LEAST_RESTRICTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f220611a = iArr;
    }
}

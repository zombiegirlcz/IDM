package qoc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f248132a;

    static {
        int[] iArr = new int[p0.values().length];
        try {
            iArr[p0.YEARLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p0.FIRST_AND_LAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p0.YEAR_ENDPOINTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f248132a = iArr;
    }
}

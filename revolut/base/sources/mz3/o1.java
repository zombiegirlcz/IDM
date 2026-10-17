package mz3;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f210643a;

    static {
        int[] iArr = new int[vs3.a.values().length];
        try {
            iArr[vs3.a.DISPLAYING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vs3.a.PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vs3.a.POST_FETCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vs3.a.FETCH_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[vs3.a.VALIDATION_FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[vs3.a.BLOCKED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f210643a = iArr;
    }
}

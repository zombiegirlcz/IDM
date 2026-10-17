package p9;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f234250a;

    static {
        int[] iArr = new int[l9.g.values().length];
        f234250a = iArr;
        try {
            iArr[l9.g.ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f234250a[l9.g.NON_NULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f234250a[l9.g.NON_DEFAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f234250a[l9.g.NON_EMPTY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f234250a[l9.g.DEFAULT_INCLUSION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}

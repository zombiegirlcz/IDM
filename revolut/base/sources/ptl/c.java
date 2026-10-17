package ptl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f239780a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.INCLUDE_ONLY_RECURRING_BUYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.EXCLUDE_RECURRING_BUYS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f239780a = iArr;
    }
}

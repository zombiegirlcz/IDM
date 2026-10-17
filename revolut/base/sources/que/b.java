package que;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f249437a;

    static {
        int[] iArr = new int[pte.a.values().length];
        try {
            iArr[pte.a.REVOLUT_PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pte.a.NESTED_TOP_UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pte.a.STANDARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f249437a = iArr;
    }
}

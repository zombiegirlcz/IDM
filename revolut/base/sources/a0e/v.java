package a0e;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f374a;

    static {
        int[] iArr = new int[wxd.y.values().length];
        try {
            iArr[wxd.y.CURRENT_DATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wxd.y.PREVIOUS_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wxd.y.CURRENT_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[wxd.y.CURRENT_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f374a = iArr;
    }
}

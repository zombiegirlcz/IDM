package ind;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f162797a;

    static {
        int[] iArr = new int[lzi.i.values().length];
        try {
            iArr[lzi.i.MAX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lzi.i.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lzi.i.YEARLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[lzi.i.WEEKLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[lzi.i.MONTHLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f162797a = iArr;
    }
}

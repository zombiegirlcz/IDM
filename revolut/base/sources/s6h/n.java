package s6h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f260361a;

    static {
        int[] iArr = new int[udh.c.values().length];
        try {
            iArr[udh.c.GOOD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[udh.c.FINAL_CALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[udh.c.LIQUIDATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[udh.c.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[udh.c.MARGIN_CALL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f260361a = iArr;
    }
}

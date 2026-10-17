package w43;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f294512a;

    static {
        int[] iArr = new int[i93.d.values().length];
        try {
            iArr[i93.d.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i93.d.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i93.d.ALL_FIAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i93.d.ALL_CRYPTO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[i93.d.POCKETS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f294512a = iArr;
    }
}

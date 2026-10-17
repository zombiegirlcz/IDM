package ms0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f208180b;

    static {
        int[] iArr = new int[n5.values().length];
        try {
            iArr[n5.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n5.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n5.TOP_BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f208179a = iArr;
        int[] iArr2 = new int[o5.values().length];
        try {
            iArr2[o5.COMPACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[o5.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f208180b = iArr2;
    }
}

package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f166587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f166588b;

    static {
        int[] iArr = new int[m4.values().length];
        try {
            iArr[m4.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m4.SQUARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f166587a = iArr;
        int[] iArr2 = new int[aw0.v1.values().length];
        try {
            iArr2[aw0.v1.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[aw0.v1.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f166588b = iArr2;
    }
}

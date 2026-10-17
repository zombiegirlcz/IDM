package gaf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f142170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f142171b;

    static {
        int[] iArr = new int[u8f.c.values().length];
        try {
            iArr[u8f.c.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u8f.c.PARTIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f142170a = iArr;
        int[] iArr2 = new int[u8f.b.values().length];
        try {
            iArr2[u8f.b.ASSETS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[u8f.b.CASH.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f142171b = iArr2;
    }
}

package rif;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f254583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f254584b;

    static {
        int[] iArr = new int[stf.b.values().length];
        try {
            iArr[stf.b.BOOLEAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[stf.b.MONEY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[stf.b.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f254583a = iArr;
        int[] iArr2 = new int[ttf.c.values().length];
        try {
            iArr2[ttf.c.CATEGORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ttf.c.REASON.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f254584b = iArr2;
    }
}

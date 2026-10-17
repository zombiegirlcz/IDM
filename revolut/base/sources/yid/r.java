package yid;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f314316b;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.GRID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.LIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f314315a = iArr;
        int[] iArr2 = new int[shd.j.values().length];
        try {
            iArr2[shd.j.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[shd.j.AUCTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f314316b = iArr2;
    }
}

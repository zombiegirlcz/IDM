package s2g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f259338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f259339b;

    static {
        int[] iArr = new int[x3g.b.values().length];
        try {
            iArr[x3g.b.FULL_REFUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x3g.b.PARTIAL_REFUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x3g.b.NO_REFUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f259338a = iArr;
        int[] iArr2 = new int[myf.v.values().length];
        try {
            iArr2[myf.v.AUDIO.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[myf.v.WRITTEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[myf.v.GUIDE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f259339b = iArr2;
    }
}

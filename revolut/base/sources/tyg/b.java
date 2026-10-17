package tyg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f275568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f275569b;

    static {
        int[] iArr = new int[vyg.f.values().length];
        try {
            iArr[vyg.f.REALISED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vyg.f.TOTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f275568a = iArr;
        int[] iArr2 = new int[fzg.f.values().length];
        try {
            iArr2[fzg.f.BY_ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[fzg.f.BY_TRANSACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[fzg.f.BY_POSITIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f275569b = iArr2;
    }
}

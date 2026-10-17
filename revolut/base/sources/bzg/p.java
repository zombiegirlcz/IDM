package bzg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f20013b;

    static {
        int[] iArr = new int[fzg.f.values().length];
        try {
            iArr[fzg.f.BY_ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fzg.f.BY_TRANSACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fzg.f.BY_POSITIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f20012a = iArr;
        int[] iArr2 = new int[vyg.f.values().length];
        try {
            iArr2[vyg.f.TOTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[vyg.f.REALISED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f20013b = iArr2;
    }
}

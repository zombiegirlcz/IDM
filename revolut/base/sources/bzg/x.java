package bzg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f20022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f20023c;

    static {
        int[] iArr = new int[vyg.d.values().length];
        try {
            iArr[vyg.d.LINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vyg.d.BAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f20021a = iArr;
        int[] iArr2 = new int[vyg.f.values().length];
        try {
            iArr2[vyg.f.TOTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[vyg.f.REALISED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f20022b = iArr2;
        int[] iArr3 = new int[fzg.f.values().length];
        try {
            iArr3[fzg.f.BY_ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[fzg.f.BY_TRANSACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[fzg.f.BY_POSITIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f20023c = iArr3;
    }
}

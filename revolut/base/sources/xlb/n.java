package xlb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f306992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f306993b;

    static {
        int[] iArr = new int[ncd.g.values().length];
        try {
            iArr[ncd.g.SAVINGS_FIXED_TERM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ncd.g.SAVINGS_DEPOSITS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ncd.g.SAVINGS_MMF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f306992a = iArr;
        int[] iArr2 = new int[yja.b.values().length];
        try {
            iArr2[yja.b.CLOSE_CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yja.b.NOT_FOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[yja.b.NEXT_CLICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[yja.b.ALREADY_SHOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f306993b = iArr2;
    }
}

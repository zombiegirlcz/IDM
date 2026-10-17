package wp4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f299029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f299030b;

    static {
        int[] iArr = new int[nb5.e.values().length];
        try {
            iArr[nb5.e.DIRECT_DEBIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f299029a = iArr;
        int[] iArr2 = new int[nb5.g.values().length];
        try {
            iArr2[nb5.g.CLABE.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        f299030b = iArr2;
    }
}

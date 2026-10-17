package bg0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15043a;

    static {
        int[] iArr = new int[cj0.d.values().length];
        try {
            iArr[cj0.d.TRANSACTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cj0.d.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f15043a = iArr;
    }
}

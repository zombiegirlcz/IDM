package q84;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f242970a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.MORTGAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.LOAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.CREDIT_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f242970a = iArr;
    }
}

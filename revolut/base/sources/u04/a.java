package u04;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f276053a;

    static {
        int[] iArr = new int[ru3.a.values().length];
        try {
            iArr[ru3.a.IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ru3.a.OFFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ru3.a.APPLICATION_REJECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f276053a = iArr;
    }
}

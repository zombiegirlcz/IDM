package hjd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f152711a;

    static {
        int[] iArr = new int[shd.j.values().length];
        try {
            iArr[shd.j.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[shd.j.AUCTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f152711a = iArr;
    }
}

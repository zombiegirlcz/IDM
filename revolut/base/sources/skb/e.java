package skb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f263802a;

    static {
        int[] iArr = new int[ncd.g.values().length];
        try {
            iArr[ncd.g.SAVINGS_DEPOSITS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ncd.g.SAVINGS_FIXED_TERM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ncd.g.SAVINGS_MMF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f263802a = iArr;
    }
}

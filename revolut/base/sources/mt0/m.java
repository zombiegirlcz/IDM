package mt0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208712a;

    static {
        int[] iArr = new int[x.values().length];
        try {
            iArr[x.SWIPING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x.TAP_PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f208712a = iArr;
    }
}

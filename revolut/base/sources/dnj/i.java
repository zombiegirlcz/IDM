package dnj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f116353a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.CONTINUE_WITH_REFUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.PROCEED_WITH_CANCELLATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f116353a = iArr;
    }
}

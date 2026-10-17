package fnj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f136692a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.HOW_REFUNDS_CALCULATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.REFUND_PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f136692a = iArr;
    }
}

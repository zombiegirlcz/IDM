package nc1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f214138a;

    static {
        int[] iArr = new int[fa1.n.values().length];
        try {
            iArr[fa1.n.INITIALIZING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fa1.n.ENTER_SECURE_SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fa1.n.KSN_AVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[fa1.n.START_TRANSACTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[fa1.n.WAITING_CARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[fa1.n.CANCELLING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f214138a = iArr;
    }
}

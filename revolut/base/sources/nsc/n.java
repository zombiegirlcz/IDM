package nsc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f218788a;

    static {
        int[] iArr = new int[vrc.k.values().length];
        try {
            iArr[vrc.k.OPTIONAL_TO_SKIP_2FA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vrc.k.MANDATORY_TO_TRADE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vrc.k.TRADE_WITH_WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f218788a = iArr;
    }
}

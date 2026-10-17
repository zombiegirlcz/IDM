package adb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3320a;

    static {
        int[] iArr = new int[tcb.a.values().length];
        try {
            iArr[tcb.a.MONEY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tcb.a.TRADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tcb.a.CRYPTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f3320a = iArr;
    }
}

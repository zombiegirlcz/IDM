package p2j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f232258a;

    static {
        int[] iArr = new int[k1j.a.values().length];
        try {
            iArr[k1j.a.TRADING_ACCOUNTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k1j.a.JOINT_TRADING_ACCOUNTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k1j.a.SAVINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f232258a = iArr;
    }
}

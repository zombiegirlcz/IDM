package zbj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f320938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f320939b;

    static {
        int[] iArr = new int[w.values().length];
        try {
            iArr[w.RevolutFriends.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w.Wallet.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w.Tabs.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f320938a = iArr;
        int[] iArr2 = new int[u0.values().length];
        try {
            iArr2[u0.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[u0.FRIENDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f320939b = iArr2;
    }
}

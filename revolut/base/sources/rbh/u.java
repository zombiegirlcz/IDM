package rbh;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f253101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f253102b;

    static {
        int[] iArr = new int[k1j.a.values().length];
        try {
            iArr[k1j.a.PRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f253101a = iArr;
        int[] iArr2 = new int[t.values().length];
        try {
            iArr2[t.ADD_MONEY.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[t.WITHDRAW_MONEY.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f253102b = iArr2;
    }
}

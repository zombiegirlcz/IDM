package xuc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f309017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f309018b;

    static {
        int[] iArr = new int[vuc.m.values().length];
        try {
            iArr[vuc.m.WALLETS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vuc.m.MERCHANTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f309017a = iArr;
        int[] iArr2 = new int[qtc.d.values().length];
        try {
            iArr2[qtc.d.MERCHANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[qtc.d.WALLET.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[qtc.d.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f309018b = iArr2;
    }
}

package zq5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f324408b;

    static {
        int[] iArr = new int[go5.a.values().length];
        try {
            iArr[go5.a.NEW_TRANSFER_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[go5.a.OPTIONS_BOTTOM_SHEET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f324407a = iArr;
        int[] iArr2 = new int[ko5.p.values().length];
        try {
            iArr2[ko5.p.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ko5.p.P2P.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ko5.p.BANK_BENEFICIARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f324408b = iArr2;
    }
}

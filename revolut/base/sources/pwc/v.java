package pwc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f240424a;

    static {
        int[] iArr = new int[qtc.k.values().length];
        try {
            iArr[qtc.k.POCKETS_WITHDRAWAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qtc.k.TRANSFERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qtc.k.CARD_PAYMENTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f240424a = iArr;
    }
}

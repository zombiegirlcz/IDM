package q97;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f243669a;

    static {
        int[] iArr = new int[fs3.b.values().length];
        try {
            iArr[fs3.b.CREDIT_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fs3.b.BALANCE_TRANSFER_CREDIT_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fs3.b.SECURED_CREDIT_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[fs3.b.CREDIT_BUILDER_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f243669a = iArr;
    }
}

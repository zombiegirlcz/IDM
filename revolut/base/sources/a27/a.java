package a27;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f695a;

    static {
        int[] iArr = new int[cs6.c.values().length];
        try {
            iArr[cs6.c.PAYMENT_LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cs6.c.INVOICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cs6.c.CARD_READER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f695a = iArr;
    }
}

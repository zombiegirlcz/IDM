package knd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f186119a;

    static {
        int[] iArr = new int[jia.c.values().length];
        try {
            iArr[jia.c.APPLE_PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jia.c.CARD_READER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jia.c.POS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[jia.c.ECOMMERCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[jia.c.INVOICE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[jia.c.PAYMENT_LINK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[jia.c.QR_CODE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f186119a = iArr;
    }
}

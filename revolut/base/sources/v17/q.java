package v17;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f285256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f285257b;

    static {
        int[] iArr = new int[cs6.g.values().length];
        try {
            iArr[cs6.g.ALL_SALES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cs6.g.PAYMENT_LINKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cs6.g.INVOICES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cs6.g.RECURRING_INVOICES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[cs6.g.IN_PERSON.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[cs6.g.ECOMMERCE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f285256a = iArr;
        int[] iArr2 = new int[cs6.e.values().length];
        try {
            iArr2[cs6.e.LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[cs6.e.QR_CODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[cs6.e.INVOICE.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[cs6.e.APPLE_TAP_TO_PAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[cs6.e.ECOMMERCE.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[cs6.e.POS.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[cs6.e.CARD_READER.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        f285257b = iArr2;
    }
}

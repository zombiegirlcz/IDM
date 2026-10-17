package t17;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f267208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f267209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f267210c;
    public static final /* synthetic */ int[] d;

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
            iArr[cs6.g.IN_PERSON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cs6.g.ECOMMERCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[cs6.g.INVOICES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[cs6.g.RECURRING_INVOICES.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f267208a = iArr;
        int[] iArr2 = new int[cs6.f.values().length];
        try {
            iArr2[cs6.f.DRAFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[cs6.f.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[cs6.f.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[cs6.f.SUSPENDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[cs6.f.COMPLETED.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[cs6.f.OVERDUE.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[cs6.f.EXPIRED.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[cs6.f.CANCELLED.ordinal()] = 8;
        } catch (NoSuchFieldError unused14) {
        }
        f267209b = iArr2;
        int[] iArr3 = new int[cs6.e.values().length];
        try {
            iArr3[cs6.e.LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[cs6.e.QR_CODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[cs6.e.INVOICE.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[cs6.e.CARD_READER.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[cs6.e.POS.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[cs6.e.APPLE_TAP_TO_PAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[cs6.e.ECOMMERCE.ordinal()] = 7;
        } catch (NoSuchFieldError unused21) {
        }
        f267210c = iArr3;
        int[] iArr4 = new int[cs6.h.values().length];
        try {
            iArr4[cs6.h.PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[cs6.h.REFUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr4[cs6.h.CHARGEBACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused24) {
        }
        d = iArr4;
    }
}

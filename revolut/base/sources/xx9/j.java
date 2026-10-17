package xx9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f309428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f309429b;

    static {
        int[] iArr = new int[nx9.d.values().length];
        try {
            iArr[nx9.d.BANK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[nx9.d.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[nx9.d.CONTACT_PHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[nx9.d.CONTACT_EMAIL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[nx9.d.CONTACT_CODE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[nx9.d.GROUP.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[nx9.d.CHARITY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[nx9.d.CRYPTO.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[nx9.d.APM_CONTACT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[nx9.d.PAYMENT_COUNTERPARTY.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f309428a = iArr;
        int[] iArr2 = new int[nx9.a.values().length];
        try {
            iArr2[nx9.a.TRANSACTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[nx9.a.MONEY_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[nx9.a.PAYMENT_LINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[nx9.a.MESSAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[nx9.a.GROUP_BILL.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[nx9.a.GROUP_SETTLEMENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[nx9.a.NEW_GROUP.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[nx9.a.NEW_CONTACT.ordinal()] = 8;
        } catch (NoSuchFieldError unused18) {
        }
        f309429b = iArr2;
    }
}

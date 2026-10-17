package md8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f204508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f204509b;

    static {
        int[] iArr = new int[v6d.a.values().length];
        try {
            iArr[v6d.a.FIRST_PARTY_MARKETING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v6d.a.THIRD_PARTY_MARKETING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v6d.a.BLANK_CARD_DELIVERY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[v6d.a.FIRST_PARTY_NFC_PAYMENTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[v6d.a.PERSONAL_DATA_PROCESSING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[v6d.a.PAYMENT_LINKS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f204508a = iArr;
        int[] iArr2 = new int[xc8.d.values().length];
        try {
            iArr2[xc8.d.PERSONAL_DATA_PROCESSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[xc8.d.PAYMENT_LINKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f204509b = iArr2;
    }
}

package md8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f204525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f204526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f204527c;

    static {
        int[] iArr = new int[zc8.a.values().length];
        try {
            iArr[zc8.a.QR_CODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zc8.a.CARDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zc8.a.PROFILE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f204525a = iArr;
        int[] iArr2 = new int[v6d.a.values().length];
        try {
            iArr2[v6d.a.FIRST_PARTY_MARKETING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[v6d.a.THIRD_PARTY_MARKETING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[v6d.a.BLANK_CARD_DELIVERY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[v6d.a.FIRST_PARTY_NFC_PAYMENTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[v6d.a.PERSONAL_DATA_PROCESSING.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[v6d.a.PAYMENT_LINKS.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        f204526b = iArr2;
        int[] iArr3 = new int[xc8.d.values().length];
        try {
            iArr3[xc8.d.PERSONAL_DATA_PROCESSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[xc8.d.PAYMENT_LINKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        f204527c = iArr3;
    }
}

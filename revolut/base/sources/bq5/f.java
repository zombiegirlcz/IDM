package bq5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17708b;

    static {
        int[] iArr = new int[wk5.h.values().length];
        try {
            iArr[wk5.h.EXCHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f17707a = iArr;
        int[] iArr2 = new int[c0.values().length];
        try {
            iArr2[c0.NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[c0.SURNAME.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[c0.COMPANY_NAME.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[c0.BUSINESS_REGISTRATION_NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[c0.ADDRESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[c0.LABEL.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[c0.DESTINATION_TAG.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[c0.RECIPIENT_DETAILS_DROPDOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[c0.HOSTING_DROPDOWN.ordinal()] = 9;
        } catch (NoSuchFieldError unused10) {
        }
        f17708b = iArr2;
    }
}

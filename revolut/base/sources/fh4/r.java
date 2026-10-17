package fh4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f135144a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.IBAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.AGREEMENT_NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o.AGREEMENT_DATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o.BANK_NAME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[o.DOCUMENTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[o.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f135144a = iArr;
    }
}

package fcg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f133743a;

    static {
        int[] iArr = new int[ufi.b.values().length];
        try {
            iArr[ufi.b.TAX_AND_SERVICE_FEE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ufi.b.MANDATORY_EXTRA_TAX_AND_FEE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ufi.b.EXTRA_PERSON_FEE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ufi.b.PROPERTY_FEE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ufi.b.TRAVELLER_SERVICE_FEE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ufi.b.REFUNDABLE_DAMAGE_DEPOSIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f133743a = iArr;
    }
}

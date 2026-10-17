package do9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f116472a;

    static {
        int[] iArr = new int[ho9.b.values().length];
        try {
            iArr[ho9.b.BPAY_BILLER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ho9.b.UPI_CONTACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ho9.b.TAPI_BILLER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ho9.b.NZ_BILLS_BILLER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f116472a = iArr;
    }
}

package nei;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f214546a;

    static {
        int[] iArr = new int[bfi.a.values().length];
        try {
            iArr[bfi.a.PROPERTIES_AVAILABILITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bfi.a.PROPERTY_DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bfi.a.ROOMS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[bfi.a.CHECKOUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[bfi.a.BOOKED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f214546a = iArr;
    }
}

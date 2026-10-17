package i9g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f159837a;

    static {
        int[] iArr = new int[bfi.a.values().length];
        try {
            iArr[bfi.a.PROPERTIES_AVAILABILITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bfi.a.BOOKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bfi.a.PROPERTY_DETAILS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[bfi.a.ROOMS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[bfi.a.CHECKOUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f159837a = iArr;
    }
}

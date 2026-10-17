package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum u7 implements com.google.protobuf.a1 {
    ProductUnspecified(0),
    POS(1),
    MobilePlatform(2),
    CardReader(3),
    MerchantLocations(4),
    ProductCatalogue(5),
    RevolutUIKit(6),
    SSO(7),
    Vision(8),
    Camera(9),
    Terminal(10),
    Onboarding(11),
    UNRECOGNIZED(-1);

    public static final int Camera_VALUE = 9;
    public static final int CardReader_VALUE = 3;
    public static final int MerchantLocations_VALUE = 4;
    public static final int MobilePlatform_VALUE = 2;
    public static final int Onboarding_VALUE = 11;
    public static final int POS_VALUE = 1;
    public static final int ProductCatalogue_VALUE = 5;
    public static final int ProductUnspecified_VALUE = 0;
    public static final int RevolutUIKit_VALUE = 6;
    public static final int SSO_VALUE = 7;
    public static final int Terminal_VALUE = 10;
    public static final int Vision_VALUE = 8;
    private static final com.google.protobuf.b1 internalValueMap = new t7();
    private final int value;

    u7(int i) {
        this.value = i;
    }

    public static u7 a(int i) {
        switch (i) {
            case 0:
                return ProductUnspecified;
            case 1:
                return POS;
            case 2:
                return MobilePlatform;
            case 3:
                return CardReader;
            case 4:
                return MerchantLocations;
            case 5:
                return ProductCatalogue;
            case 6:
                return RevolutUIKit;
            case 7:
                return SSO;
            case 8:
                return Vision;
            case 9:
                return Camera;
            case 10:
                return Terminal;
            case 11:
                return Onboarding;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

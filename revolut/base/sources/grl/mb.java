package grl;

/* JADX INFO: loaded from: classes13.dex */
public enum mb implements com.google.protobuf.a1 {
    PushNotifications(0),
    ContactsAccess(1),
    FaceRecognition(2),
    FingerprintRecognition(3),
    Microphone(4),
    Camera(5),
    Bluetooth(6),
    CalendarAccess(7),
    Location(8),
    PhotoLibraryAccess(9),
    ThirdPartyTracking(10),
    UNRECOGNIZED(-1);

    public static final int Bluetooth_VALUE = 6;
    public static final int CalendarAccess_VALUE = 7;
    public static final int Camera_VALUE = 5;
    public static final int ContactsAccess_VALUE = 1;
    public static final int FaceRecognition_VALUE = 2;
    public static final int FingerprintRecognition_VALUE = 3;
    public static final int Location_VALUE = 8;
    public static final int Microphone_VALUE = 4;
    public static final int PhotoLibraryAccess_VALUE = 9;
    public static final int PushNotifications_VALUE = 0;
    public static final int ThirdPartyTracking_VALUE = 10;
    private static final com.google.protobuf.b1 internalValueMap = new lb();
    private final int value;

    mb(int i) {
        this.value = i;
    }

    public static mb a(int i) {
        switch (i) {
            case 0:
                return PushNotifications;
            case 1:
                return ContactsAccess;
            case 2:
                return FaceRecognition;
            case 3:
                return FingerprintRecognition;
            case 4:
                return Microphone;
            case 5:
                return Camera;
            case 6:
                return Bluetooth;
            case 7:
                return CalendarAccess;
            case 8:
                return Location;
            case 9:
                return PhotoLibraryAccess;
            case 10:
                return ThirdPartyTracking;
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

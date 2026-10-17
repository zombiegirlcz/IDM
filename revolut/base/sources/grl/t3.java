package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum t3 implements com.google.protobuf.a1 {
    Auth(0),
    Home(1),
    HireOnboard(2),
    People(3),
    Payments(4),
    Services(5),
    Analytics(6),
    Documents(7),
    Integrations(8),
    Company(9),
    Compensation(10),
    TimeManagement(11),
    Settings(12),
    HelpAndSupport(13),
    UNRECOGNIZED(-1);

    public static final int Analytics_VALUE = 6;
    public static final int Auth_VALUE = 0;
    public static final int Company_VALUE = 9;
    public static final int Compensation_VALUE = 10;
    public static final int Documents_VALUE = 7;
    public static final int HelpAndSupport_VALUE = 13;
    public static final int HireOnboard_VALUE = 2;
    public static final int Home_VALUE = 1;
    public static final int Integrations_VALUE = 8;
    public static final int Payments_VALUE = 4;
    public static final int People_VALUE = 3;
    public static final int Services_VALUE = 5;
    public static final int Settings_VALUE = 12;
    public static final int TimeManagement_VALUE = 11;
    private static final com.google.protobuf.b1 internalValueMap = new s3();
    private final int value;

    t3(int i) {
        this.value = i;
    }

    public static t3 a(int i) {
        switch (i) {
            case 0:
                return Auth;
            case 1:
                return Home;
            case 2:
                return HireOnboard;
            case 3:
                return People;
            case 4:
                return Payments;
            case 5:
                return Services;
            case 6:
                return Analytics;
            case 7:
                return Documents;
            case 8:
                return Integrations;
            case 9:
                return Company;
            case 10:
                return Compensation;
            case 11:
                return TimeManagement;
            case 12:
                return Settings;
            case 13:
                return HelpAndSupport;
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

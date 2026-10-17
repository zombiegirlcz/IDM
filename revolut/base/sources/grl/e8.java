package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum e8 implements com.google.protobuf.a1 {
    ProductUnspecified(0),
    Dashboard(1),
    Onboarding(2),
    Core(3),
    Home(4),
    EmployeeProfile(5),
    Employees(6),
    Offboarding(7),
    Teams(8),
    Roles(9),
    TimeManagement(10),
    Goals(11),
    Reviews(12),
    Analytics(13),
    JobsAndRequisitions(14),
    Interviews(15),
    Candidates(16),
    AccessManagement(17),
    Notifications(18),
    Settings(19),
    UNRECOGNIZED(-1);

    public static final int AccessManagement_VALUE = 17;
    public static final int Analytics_VALUE = 13;
    public static final int Candidates_VALUE = 16;
    public static final int Core_VALUE = 3;
    public static final int Dashboard_VALUE = 1;
    public static final int EmployeeProfile_VALUE = 5;
    public static final int Employees_VALUE = 6;
    public static final int Goals_VALUE = 11;
    public static final int Home_VALUE = 4;
    public static final int Interviews_VALUE = 15;
    public static final int JobsAndRequisitions_VALUE = 14;
    public static final int Notifications_VALUE = 18;
    public static final int Offboarding_VALUE = 7;
    public static final int Onboarding_VALUE = 2;
    public static final int ProductUnspecified_VALUE = 0;
    public static final int Reviews_VALUE = 12;
    public static final int Roles_VALUE = 9;
    public static final int Settings_VALUE = 19;
    public static final int Teams_VALUE = 8;
    public static final int TimeManagement_VALUE = 10;
    private static final com.google.protobuf.b1 internalValueMap = new d8();
    private final int value;

    e8(int i) {
        this.value = i;
    }

    public static e8 a(int i) {
        switch (i) {
            case 0:
                return ProductUnspecified;
            case 1:
                return Dashboard;
            case 2:
                return Onboarding;
            case 3:
                return Core;
            case 4:
                return Home;
            case 5:
                return EmployeeProfile;
            case 6:
                return Employees;
            case 7:
                return Offboarding;
            case 8:
                return Teams;
            case 9:
                return Roles;
            case 10:
                return TimeManagement;
            case 11:
                return Goals;
            case 12:
                return Reviews;
            case 13:
                return Analytics;
            case 14:
                return JobsAndRequisitions;
            case 15:
                return Interviews;
            case 16:
                return Candidates;
            case 17:
                return AccessManagement;
            case 18:
                return Notifications;
            case 19:
                return Settings;
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

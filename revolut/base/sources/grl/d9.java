package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum d9 implements com.google.protobuf.a1 {
    FeatureFlags(0),
    FeatureToggles(1),
    ABTests(2),
    Rollouts(3),
    Metrics(4),
    Feedbacks(5),
    AppVersions(6),
    Tasks(7),
    Clients(8),
    UNRECOGNIZED(-1);

    public static final int ABTests_VALUE = 2;
    public static final int AppVersions_VALUE = 6;
    public static final int Clients_VALUE = 8;
    public static final int FeatureFlags_VALUE = 0;
    public static final int FeatureToggles_VALUE = 1;
    public static final int Feedbacks_VALUE = 5;
    public static final int Metrics_VALUE = 4;
    public static final int Rollouts_VALUE = 3;
    public static final int Tasks_VALUE = 7;
    private static final com.google.protobuf.b1 internalValueMap = new c9();
    private final int value;

    d9(int i) {
        this.value = i;
    }

    public static d9 a(int i) {
        switch (i) {
            case 0:
                return FeatureFlags;
            case 1:
                return FeatureToggles;
            case 2:
                return ABTests;
            case 3:
                return Rollouts;
            case 4:
                return Metrics;
            case 5:
                return Feedbacks;
            case 6:
                return AppVersions;
            case 7:
                return Tasks;
            case 8:
                return Clients;
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

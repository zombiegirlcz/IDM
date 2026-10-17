package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum he implements com.google.protobuf.a1 {
    NOT_AVAILABLE(0),
    NOT_ONBOARDED(1),
    PENDING(2),
    ONBOARDED(3),
    ACTIVE(4),
    OFFBOARDING(5),
    UNKNOWN(6),
    UNRECOGNIZED(-1);

    public static final int ACTIVE_VALUE = 4;
    public static final int NOT_AVAILABLE_VALUE = 0;
    public static final int NOT_ONBOARDED_VALUE = 1;
    public static final int OFFBOARDING_VALUE = 5;
    public static final int ONBOARDED_VALUE = 3;
    public static final int PENDING_VALUE = 2;
    public static final int UNKNOWN_VALUE = 6;
    private static final com.google.protobuf.b1 internalValueMap = new ge();
    private final int value;

    he(int i) {
        this.value = i;
    }

    public static he a(int i) {
        switch (i) {
            case 0:
                return NOT_AVAILABLE;
            case 1:
                return NOT_ONBOARDED;
            case 2:
                return PENDING;
            case 3:
                return ONBOARDED;
            case 4:
                return ACTIVE;
            case 5:
                return OFFBOARDING;
            case 6:
                return UNKNOWN;
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

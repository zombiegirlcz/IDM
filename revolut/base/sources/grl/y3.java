package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum y3 implements com.google.protobuf.a1 {
    SINGLE_TRANSACTION_LIMIT(0),
    DAILY_LIMIT(1),
    WEEKLY_LIMIT(2),
    MONTHLY_LIMIT(3),
    YEARLY_LIMIT(4),
    TOTAL_LIMIT(5),
    UNRECOGNIZED(-1);

    public static final int DAILY_LIMIT_VALUE = 1;
    public static final int MONTHLY_LIMIT_VALUE = 3;
    public static final int SINGLE_TRANSACTION_LIMIT_VALUE = 0;
    public static final int TOTAL_LIMIT_VALUE = 5;
    public static final int WEEKLY_LIMIT_VALUE = 2;
    public static final int YEARLY_LIMIT_VALUE = 4;
    private static final com.google.protobuf.b1 internalValueMap = new x3();
    private final int value;

    y3(int i) {
        this.value = i;
    }

    public static y3 a(int i) {
        if (i == 0) {
            return SINGLE_TRANSACTION_LIMIT;
        }
        if (i == 1) {
            return DAILY_LIMIT;
        }
        if (i == 2) {
            return WEEKLY_LIMIT;
        }
        if (i == 3) {
            return MONTHLY_LIMIT;
        }
        if (i == 4) {
            return YEARLY_LIMIT;
        }
        if (i != 5) {
            return null;
        }
        return TOTAL_LIMIT;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

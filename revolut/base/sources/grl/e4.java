package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum e4 implements com.google.protobuf.a1 {
    OPEN(0),
    EXTENDED_HOURS(1),
    CLOSE(2),
    UNRECOGNIZED(-1);

    public static final int CLOSE_VALUE = 2;
    public static final int EXTENDED_HOURS_VALUE = 1;
    public static final int OPEN_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new d4();
    private final int value;

    e4(int i) {
        this.value = i;
    }

    public static e4 a(int i) {
        if (i == 0) {
            return OPEN;
        }
        if (i == 1) {
            return EXTENDED_HOURS;
        }
        if (i != 2) {
            return null;
        }
        return CLOSE;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

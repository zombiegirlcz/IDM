package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum n7 implements com.google.protobuf.a1 {
    Success(0),
    Failure(1),
    Progress(2),
    Warning(3),
    Offline(4),
    Pending(5),
    UNRECOGNIZED(-1);

    public static final int Failure_VALUE = 1;
    public static final int Offline_VALUE = 4;
    public static final int Pending_VALUE = 5;
    public static final int Progress_VALUE = 2;
    public static final int Success_VALUE = 0;
    public static final int Warning_VALUE = 3;
    private static final com.google.protobuf.b1 internalValueMap = new m7();
    private final int value;

    n7(int i) {
        this.value = i;
    }

    public static n7 a(int i) {
        if (i == 0) {
            return Success;
        }
        if (i == 1) {
            return Failure;
        }
        if (i == 2) {
            return Progress;
        }
        if (i == 3) {
            return Warning;
        }
        if (i == 4) {
            return Offline;
        }
        if (i != 5) {
            return null;
        }
        return Pending;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

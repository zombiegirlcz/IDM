package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum t9 implements com.google.protobuf.a1 {
    DATA(0),
    EMPTY(1),
    LOADING(2),
    ERROR(3),
    UNRECOGNIZED(-1);

    public static final int DATA_VALUE = 0;
    public static final int EMPTY_VALUE = 1;
    public static final int ERROR_VALUE = 3;
    public static final int LOADING_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new s9();
    private final int value;

    t9(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

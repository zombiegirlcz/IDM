package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum b5 implements com.google.protobuf.a1 {
    NON_VIEWABLE(0),
    VIEWABLE(1),
    SUB_SECOND(2),
    UNRECOGNIZED(-1);

    public static final int NON_VIEWABLE_VALUE = 0;
    public static final int SUB_SECOND_VALUE = 2;
    public static final int VIEWABLE_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new a5();
    private final int value;

    b5(int i) {
        this.value = i;
    }

    public static b5 a(int i) {
        if (i == 0) {
            return NON_VIEWABLE;
        }
        if (i == 1) {
            return VIEWABLE;
        }
        if (i != 2) {
            return null;
        }
        return SUB_SECOND;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

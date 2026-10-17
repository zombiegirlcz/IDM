package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum v implements com.google.protobuf.a1 {
    PERSONAL(0),
    JOINT(1),
    LINKED(2),
    PRO(3),
    SAVINGS(4),
    CREDIT(5),
    YOUTH(6),
    UNRECOGNIZED(-1);

    public static final int CREDIT_VALUE = 5;
    public static final int JOINT_VALUE = 1;
    public static final int LINKED_VALUE = 2;
    public static final int PERSONAL_VALUE = 0;
    public static final int PRO_VALUE = 3;
    public static final int SAVINGS_VALUE = 4;
    public static final int YOUTH_VALUE = 6;
    private static final com.google.protobuf.b1 internalValueMap = new u();
    private final int value;

    v(int i) {
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

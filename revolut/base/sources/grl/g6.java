package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum g6 implements com.google.protobuf.a1 {
    GIA(0),
    GIA_JOINT(1),
    ISA(2),
    PEA(3),
    JISA(4),
    ROBO(5),
    CFD(6),
    UNRECOGNIZED(-1);

    public static final int CFD_VALUE = 6;
    public static final int GIA_JOINT_VALUE = 1;
    public static final int GIA_VALUE = 0;
    public static final int ISA_VALUE = 2;
    public static final int JISA_VALUE = 4;
    public static final int PEA_VALUE = 3;
    public static final int ROBO_VALUE = 5;
    private static final com.google.protobuf.b1 internalValueMap = new f6();
    private final int value;

    g6(int i) {
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

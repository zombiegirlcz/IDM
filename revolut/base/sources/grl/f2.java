package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum f2 implements com.google.protobuf.a1 {
    STANDARD(0),
    PLUS(1),
    PREMIUM(2),
    METAL(3),
    ULTRA(4),
    NO_PLAN(5),
    PRIVATE(6),
    UNRECOGNIZED(-1);

    public static final int METAL_VALUE = 3;
    public static final int NO_PLAN_VALUE = 5;
    public static final int PLUS_VALUE = 1;
    public static final int PREMIUM_VALUE = 2;
    public static final int PRIVATE_VALUE = 6;
    public static final int STANDARD_VALUE = 0;
    public static final int ULTRA_VALUE = 4;
    private static final com.google.protobuf.b1 internalValueMap = new e2();
    private final int value;

    f2(int i) {
        this.value = i;
    }

    public static f2 a(int i) {
        switch (i) {
            case 0:
                return STANDARD;
            case 1:
                return PLUS;
            case 2:
                return PREMIUM;
            case 3:
                return METAL;
            case 4:
                return ULTRA;
            case 5:
                return NO_PLAN;
            case 6:
                return PRIVATE;
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

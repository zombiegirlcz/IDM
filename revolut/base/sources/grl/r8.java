package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum r8 implements com.google.protobuf.a1 {
    Ramp(0),
    OffRamp(1),
    NonRamp(2),
    UNRECOGNIZED(-1);

    public static final int NonRamp_VALUE = 2;
    public static final int OffRamp_VALUE = 1;
    public static final int Ramp_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new q8();
    private final int value;

    r8(int i) {
        this.value = i;
    }

    public static r8 a(int i) {
        if (i == 0) {
            return Ramp;
        }
        if (i == 1) {
            return OffRamp;
        }
        if (i != 2) {
            return null;
        }
        return NonRamp;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

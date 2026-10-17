package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum c0 implements com.google.protobuf.a1 {
    light(0),
    dark(1),
    system(2),
    UNRECOGNIZED(-1);

    public static final int dark_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new b0();
    public static final int light_VALUE = 0;
    public static final int system_VALUE = 2;
    private final int value;

    c0(int i) {
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

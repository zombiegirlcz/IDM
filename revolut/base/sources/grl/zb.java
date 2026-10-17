package grl;

/* JADX INFO: loaded from: classes13.dex */
public enum zb implements com.google.protobuf.a1 {
    Light(0),
    Dark(1),
    System(2),
    Transparent(3),
    UNRECOGNIZED(-1);

    public static final int Dark_VALUE = 1;
    public static final int Light_VALUE = 0;
    public static final int System_VALUE = 2;
    public static final int Transparent_VALUE = 3;
    private static final com.google.protobuf.b1 internalValueMap = new yb();
    private final int value;

    zb(int i) {
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

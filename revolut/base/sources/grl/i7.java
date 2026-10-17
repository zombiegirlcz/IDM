package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum i7 implements com.google.protobuf.a1 {
    Appeared(0),
    Disappeared(1),
    UNRECOGNIZED(-1);

    public static final int Appeared_VALUE = 0;
    public static final int Disappeared_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new h7();
    private final int value;

    i7(int i) {
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

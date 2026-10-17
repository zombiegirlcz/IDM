package grl;

/* JADX INFO: loaded from: classes13.dex */
public enum m5 implements com.google.protobuf.a1 {
    incoming(0),
    outgoing(1),
    UNRECOGNIZED(-1);

    public static final int incoming_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new l5();
    public static final int outgoing_VALUE = 1;
    private final int value;

    m5(int i) {
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

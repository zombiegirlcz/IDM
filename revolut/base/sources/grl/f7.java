package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum f7 implements com.google.protobuf.a1 {
    Opened(0),
    Received(1),
    UNRECOGNIZED(-1);

    public static final int Opened_VALUE = 0;
    public static final int Received_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new e7();
    private final int value;

    f7(int i) {
        this.value = i;
    }

    public static f7 a(int i) {
        if (i == 0) {
            return Opened;
        }
        if (i != 1) {
            return null;
        }
        return Received;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum o8 implements com.google.protobuf.a1 {
    Poseidon(0),
    UNRECOGNIZED(-1);

    public static final int Poseidon_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new n8();
    private final int value;

    o8(int i) {
        this.value = i;
    }

    public static o8 a(int i) {
        if (i != 0) {
            return null;
        }
        return Poseidon;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

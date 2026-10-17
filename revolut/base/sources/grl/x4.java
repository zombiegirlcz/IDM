package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum x4 implements com.google.protobuf.a1 {
    IDave(0),
    UNRECOGNIZED(-1);

    public static final int IDave_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new w4();
    private final int value;

    x4(int i) {
        this.value = i;
    }

    public static x4 a(int i) {
        if (i != 0) {
            return null;
        }
        return IDave;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

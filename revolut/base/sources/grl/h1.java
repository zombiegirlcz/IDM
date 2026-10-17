package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum h1 implements com.google.protobuf.a1 {
    AUTOMATIC(0),
    MANUAL(1),
    UNRECOGNIZED(-1);

    public static final int AUTOMATIC_VALUE = 0;
    public static final int MANUAL_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new g1();
    private final int value;

    h1(int i) {
        this.value = i;
    }

    public static h1 a(int i) {
        if (i == 0) {
            return AUTOMATIC;
        }
        if (i != 1) {
            return null;
        }
        return MANUAL;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

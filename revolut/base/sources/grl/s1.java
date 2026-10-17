package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum s1 implements com.google.protobuf.a1 {
    DISABLED(0),
    AUTOMATIC(1),
    MANUAL(2),
    UNRECOGNIZED(-1);

    public static final int AUTOMATIC_VALUE = 1;
    public static final int DISABLED_VALUE = 0;
    public static final int MANUAL_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new r1();
    private final int value;

    s1(int i) {
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

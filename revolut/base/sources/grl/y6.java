package grl;

/* JADX INFO: loaded from: classes13.dex */
public enum y6 implements com.google.protobuf.a1 {
    UnspecifiedCategory(0),
    Mobile(1),
    Tablet(2),
    Desktop(3),
    UNRECOGNIZED(-1);

    public static final int Desktop_VALUE = 3;
    public static final int Mobile_VALUE = 1;
    public static final int Tablet_VALUE = 2;
    public static final int UnspecifiedCategory_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new x6();
    private final int value;

    y6(int i) {
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

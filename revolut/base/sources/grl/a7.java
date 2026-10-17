package grl;

/* JADX INFO: loaded from: classes13.dex */
public enum a7 implements com.google.protobuf.a1 {
    UnspecifiedOS(0),
    iOS(1),
    Android(2),
    UNRECOGNIZED(-1);

    public static final int Android_VALUE = 2;
    public static final int UnspecifiedOS_VALUE = 0;
    public static final int iOS_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new z6();
    private final int value;

    a7(int i) {
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

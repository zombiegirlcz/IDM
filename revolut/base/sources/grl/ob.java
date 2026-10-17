package grl;

/* JADX INFO: loaded from: classes13.dex */
public enum ob implements com.google.protobuf.a1 {
    Enabled(0),
    Disabled(1),
    Unavailable(2),
    UNRECOGNIZED(-1);

    public static final int Disabled_VALUE = 1;
    public static final int Enabled_VALUE = 0;
    public static final int Unavailable_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new nb();
    private final int value;

    ob(int i) {
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

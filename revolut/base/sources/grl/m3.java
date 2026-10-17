package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum m3 implements com.google.protobuf.a1 {
    LOADED(0),
    ERROR(1),
    UNRECOGNIZED(-1);

    public static final int ERROR_VALUE = 1;
    public static final int LOADED_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new l3();
    private final int value;

    m3(int i) {
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

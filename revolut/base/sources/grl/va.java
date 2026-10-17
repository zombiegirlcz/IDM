package grl;

/* JADX INFO: loaded from: classes13.dex */
public enum va implements com.google.protobuf.a1 {
    Watch(0),
    App(1),
    UNRECOGNIZED(-1);

    public static final int App_VALUE = 1;
    public static final int Watch_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new ua();
    private final int value;

    va(int i) {
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

package grl;

/* JADX INFO: loaded from: classes13.dex */
public enum ta implements com.google.protobuf.a1 {
    opened(0),
    closed(1),
    UNRECOGNIZED(-1);

    public static final int closed_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new sa();
    public static final int opened_VALUE = 0;
    private final int value;

    ta(int i) {
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

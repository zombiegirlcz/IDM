package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum d1 implements com.google.protobuf.a1 {
    VENDOR(0),
    MEDIA_PIPE(1),
    UNRECOGNIZED(-1);

    public static final int MEDIA_PIPE_VALUE = 1;
    public static final int VENDOR_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new c1();
    private final int value;

    d1(int i) {
        this.value = i;
    }

    public static d1 a(int i) {
        if (i == 0) {
            return VENDOR;
        }
        if (i != 1) {
            return null;
        }
        return MEDIA_PIPE;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

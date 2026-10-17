package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum y1 implements com.google.protobuf.a1 {
    ChatUi(0),
    UNRECOGNIZED(-1);

    public static final int ChatUi_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new x1();
    private final int value;

    y1(int i) {
        this.value = i;
    }

    public static y1 a(int i) {
        if (i != 0) {
            return null;
        }
        return ChatUi;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

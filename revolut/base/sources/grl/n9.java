package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum n9 implements com.google.protobuf.a1 {
    DeepLink(0),
    App(1),
    UNRECOGNIZED(-1);

    public static final int App_VALUE = 1;
    public static final int DeepLink_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new m9();
    private final int value;

    n9(int i) {
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

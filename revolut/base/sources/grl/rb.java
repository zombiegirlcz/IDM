package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum rb implements com.google.protobuf.a1 {
    LOYALTY(0),
    UNRECOGNIZED(-1);

    public static final int LOYALTY_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new qb();
    private final int value;

    rb(int i) {
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

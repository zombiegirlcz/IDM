package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum z7 implements com.google.protobuf.a1 {
    CREDIT_CARD(0),
    LOANS(1),
    UNRECOGNIZED(-1);

    public static final int CREDIT_CARD_VALUE = 0;
    public static final int LOANS_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new y7();
    private final int value;

    z7(int i) {
        this.value = i;
    }

    public static z7 a(int i) {
        if (i == 0) {
            return CREDIT_CARD;
        }
        if (i != 1) {
            return null;
        }
        return LOANS;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

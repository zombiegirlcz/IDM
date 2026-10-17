package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum aa implements com.google.protobuf.a1 {
    regular(0),
    sdk_exported(1),
    web_payment(2),
    UNRECOGNIZED(-1);

    private static final com.google.protobuf.b1 internalValueMap = new z9();
    public static final int regular_VALUE = 0;
    public static final int sdk_exported_VALUE = 1;
    public static final int web_payment_VALUE = 2;
    private final int value;

    aa(int i) {
        this.value = i;
    }

    public static aa a(int i) {
        if (i == 0) {
            return regular;
        }
        if (i == 1) {
            return sdk_exported;
        }
        if (i != 2) {
            return null;
        }
        return web_payment;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum ca implements com.google.protobuf.a1 {
    retail(0),
    retail_only(1),
    business(2),
    business_only(3),
    UNRECOGNIZED(-1);

    public static final int business_VALUE = 2;
    public static final int business_only_VALUE = 3;
    private static final com.google.protobuf.b1 internalValueMap = new ba();
    public static final int retail_VALUE = 0;
    public static final int retail_only_VALUE = 1;
    private final int value;

    ca(int i) {
        this.value = i;
    }

    public static ca a(int i) {
        if (i == 0) {
            return retail;
        }
        if (i == 1) {
            return retail_only;
        }
        if (i == 2) {
            return business;
        }
        if (i != 3) {
            return null;
        }
        return business_only;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

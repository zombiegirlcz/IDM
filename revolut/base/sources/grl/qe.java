package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum qe implements com.google.protobuf.a1 {
    small(0),
    medium(1),
    large(2),
    dynamic(3),
    UNRECOGNIZED(-1);

    public static final int dynamic_VALUE = 3;
    private static final com.google.protobuf.b1 internalValueMap = new pe();
    public static final int large_VALUE = 2;
    public static final int medium_VALUE = 1;
    public static final int small_VALUE = 0;
    private final int value;

    qe(int i) {
        this.value = i;
    }

    public static qe a(int i) {
        if (i == 0) {
            return small;
        }
        if (i == 1) {
            return medium;
        }
        if (i == 2) {
            return large;
        }
        if (i != 3) {
            return null;
        }
        return dynamic;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

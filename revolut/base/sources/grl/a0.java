package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum a0 implements com.google.protobuf.a1 {
    blue(0),
    orange(1),
    green(2),
    teal(3),
    purple(4),
    minimal(5),
    UNRECOGNIZED(-1);

    public static final int blue_VALUE = 0;
    public static final int green_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new z();
    public static final int minimal_VALUE = 5;
    public static final int orange_VALUE = 1;
    public static final int purple_VALUE = 4;
    public static final int teal_VALUE = 3;
    private final int value;

    a0(int i) {
        this.value = i;
    }

    public static a0 a(int i) {
        if (i == 0) {
            return blue;
        }
        if (i == 1) {
            return orange;
        }
        if (i == 2) {
            return green;
        }
        if (i == 3) {
            return teal;
        }
        if (i == 4) {
            return purple;
        }
        if (i != 5) {
            return null;
        }
        return minimal;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

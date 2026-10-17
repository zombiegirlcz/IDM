package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum uc implements com.google.protobuf.a1 {
    auto(0),
    light(1),
    dark(2),
    UNRECOGNIZED(-1);

    public static final int auto_VALUE = 0;
    public static final int dark_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new tc();
    public static final int light_VALUE = 1;
    private final int value;

    uc(int i) {
        this.value = i;
    }

    public static uc a(int i) {
        if (i == 0) {
            return auto;
        }
        if (i == 1) {
            return light;
        }
        if (i != 2) {
            return null;
        }
        return dark;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

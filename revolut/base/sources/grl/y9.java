package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum y9 implements com.google.protobuf.a1 {
    screen_unspecified(0),
    initial(1),
    error(2),
    loading(3),
    loaded(4),
    UNRECOGNIZED(-1);

    public static final int error_VALUE = 2;
    public static final int initial_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new x9();
    public static final int loaded_VALUE = 4;
    public static final int loading_VALUE = 3;
    public static final int screen_unspecified_VALUE = 0;
    private final int value;

    y9(int i) {
        this.value = i;
    }

    public static y9 a(int i) {
        if (i == 0) {
            return screen_unspecified;
        }
        if (i == 1) {
            return initial;
        }
        if (i == 2) {
            return error;
        }
        if (i == 3) {
            return loading;
        }
        if (i != 4) {
            return null;
        }
        return loaded;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum ia implements com.google.protobuf.a1 {
    SignIn(0),
    SignUp(1),
    UNRECOGNIZED(-1);

    public static final int SignIn_VALUE = 0;
    public static final int SignUp_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new ha();
    private final int value;

    ia(int i) {
        this.value = i;
    }

    public static ia a(int i) {
        if (i == 0) {
            return SignIn;
        }
        if (i != 1) {
            return null;
        }
        return SignUp;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

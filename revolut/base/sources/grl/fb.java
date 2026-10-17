package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum fb implements com.google.protobuf.a1 {
    SignUp(0),
    SignIn(1),
    Reauthentication(2),
    UNRECOGNIZED(-1);

    public static final int Reauthentication_VALUE = 2;
    public static final int SignIn_VALUE = 1;
    public static final int SignUp_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new eb();
    private final int value;

    fb(int i) {
        this.value = i;
    }

    public static fb a(int i) {
        if (i == 0) {
            return SignUp;
        }
        if (i == 1) {
            return SignIn;
        }
        if (i != 2) {
            return null;
        }
        return Reauthentication;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum yc implements com.google.protobuf.a1 {
    signin(0),
    signin_only(1),
    signup(2),
    signup_only(3),
    reauthentication(4),
    change_passcode(5),
    manage_passkeys(6),
    UNRECOGNIZED(-1);

    public static final int change_passcode_VALUE = 5;
    private static final com.google.protobuf.b1 internalValueMap = new xc();
    public static final int manage_passkeys_VALUE = 6;
    public static final int reauthentication_VALUE = 4;
    public static final int signin_VALUE = 0;
    public static final int signin_only_VALUE = 1;
    public static final int signup_VALUE = 2;
    public static final int signup_only_VALUE = 3;
    private final int value;

    yc(int i) {
        this.value = i;
    }

    public static yc a(int i) {
        switch (i) {
            case 0:
                return signin;
            case 1:
                return signin_only;
            case 2:
                return signup;
            case 3:
                return signup_only;
            case 4:
                return reauthentication;
            case 5:
                return change_passcode;
            case 6:
                return manage_passkeys;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

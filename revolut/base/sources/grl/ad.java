package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum ad implements com.google.protobuf.a1 {
    silent(0),
    select_account(1),
    login(2),
    none(3),
    UNRECOGNIZED(-1);

    private static final com.google.protobuf.b1 internalValueMap = new zc();
    public static final int login_VALUE = 2;
    public static final int none_VALUE = 3;
    public static final int select_account_VALUE = 1;
    public static final int silent_VALUE = 0;
    private final int value;

    ad(int i) {
        this.value = i;
    }

    public static ad a(int i) {
        if (i == 0) {
            return silent;
        }
        if (i == 1) {
            return select_account;
        }
        if (i == 2) {
            return login;
        }
        if (i != 3) {
            return null;
        }
        return none;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

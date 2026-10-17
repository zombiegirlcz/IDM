package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum ld implements com.google.protobuf.a1 {
    Activation(0),
    Profile(1),
    Teen(2),
    UNRECOGNIZED(-1);

    public static final int Activation_VALUE = 0;
    public static final int Profile_VALUE = 1;
    public static final int Teen_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new kd();
    private final int value;

    ld(int i) {
        this.value = i;
    }

    public static ld a(int i) {
        if (i == 0) {
            return Activation;
        }
        if (i == 1) {
            return Profile;
        }
        if (i != 2) {
            return null;
        }
        return Teen;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

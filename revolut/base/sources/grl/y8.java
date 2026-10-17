package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum y8 implements com.google.protobuf.a1 {
    Reward(0),
    Default(1),
    UNRECOGNIZED(-1);

    public static final int Default_VALUE = 1;
    public static final int Reward_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new x8();
    private final int value;

    y8(int i) {
        this.value = i;
    }

    public static y8 a(int i) {
        if (i == 0) {
            return Reward;
        }
        if (i != 1) {
            return null;
        }
        return Default;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

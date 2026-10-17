package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum t6 implements com.google.protobuf.a1 {
    SelfieSignIn(0),
    SelfieSignUp(1),
    IDSignUp(2),
    IDRTRSignUp(3),
    ActiveLiveness(4),
    VisionWeb(5),
    UNRECOGNIZED(-1);

    public static final int ActiveLiveness_VALUE = 4;
    public static final int IDRTRSignUp_VALUE = 3;
    public static final int IDSignUp_VALUE = 2;
    public static final int SelfieSignIn_VALUE = 0;
    public static final int SelfieSignUp_VALUE = 1;
    public static final int VisionWeb_VALUE = 5;
    private static final com.google.protobuf.b1 internalValueMap = new s6();
    private final int value;

    t6(int i) {
        this.value = i;
    }

    public static t6 a(int i) {
        if (i == 0) {
            return SelfieSignIn;
        }
        if (i == 1) {
            return SelfieSignUp;
        }
        if (i == 2) {
            return IDSignUp;
        }
        if (i == 3) {
            return IDRTRSignUp;
        }
        if (i == 4) {
            return ActiveLiveness;
        }
        if (i != 5) {
            return null;
        }
        return VisionWeb;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

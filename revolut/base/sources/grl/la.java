package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum la implements com.google.protobuf.a1 {
    UnspecifiedType(0),
    Deposits(1),
    MMF(2),
    UNRECOGNIZED(-1);

    public static final int Deposits_VALUE = 1;
    public static final int MMF_VALUE = 2;
    public static final int UnspecifiedType_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new ka();
    private final int value;

    la(int i) {
        this.value = i;
    }

    public static la a(int i) {
        if (i == 0) {
            return UnspecifiedType;
        }
        if (i == 1) {
            return Deposits;
        }
        if (i != 2) {
            return null;
        }
        return MMF;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

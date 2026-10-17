package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum jb implements com.google.protobuf.a1 {
    Success(0),
    Failure(1),
    UNRECOGNIZED(-1);

    public static final int Failure_VALUE = 1;
    public static final int Success_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new ib();
    private final int value;

    jb(int i) {
        this.value = i;
    }

    public static jb a(int i) {
        if (i == 0) {
            return Success;
        }
        if (i != 1) {
            return null;
        }
        return Failure;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

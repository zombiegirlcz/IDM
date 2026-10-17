package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum cc implements com.google.protobuf.a1 {
    Started(0),
    Failed(1),
    Succeeded(2),
    Redirected(3),
    Skipped(4),
    UNRECOGNIZED(-1);

    public static final int Failed_VALUE = 1;
    public static final int Redirected_VALUE = 3;
    public static final int Skipped_VALUE = 4;
    public static final int Started_VALUE = 0;
    public static final int Succeeded_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new bc();
    private final int value;

    cc(int i) {
        this.value = i;
    }

    public static cc a(int i) {
        if (i == 0) {
            return Started;
        }
        if (i == 1) {
            return Failed;
        }
        if (i == 2) {
            return Succeeded;
        }
        if (i == 3) {
            return Redirected;
        }
        if (i != 4) {
            return null;
        }
        return Skipped;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

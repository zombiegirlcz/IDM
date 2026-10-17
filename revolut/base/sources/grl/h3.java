package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum h3 implements com.google.protobuf.a1 {
    Datasets(0),
    Consumers(1),
    Domains(2),
    DataLineage(3),
    UNRECOGNIZED(-1);

    public static final int Consumers_VALUE = 1;
    public static final int DataLineage_VALUE = 3;
    public static final int Datasets_VALUE = 0;
    public static final int Domains_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new g3();
    private final int value;

    h3(int i) {
        this.value = i;
    }

    public static h3 a(int i) {
        if (i == 0) {
            return Datasets;
        }
        if (i == 1) {
            return Consumers;
        }
        if (i == 2) {
            return Domains;
        }
        if (i != 3) {
            return null;
        }
        return DataLineage;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

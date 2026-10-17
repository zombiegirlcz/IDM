package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum j1 implements com.google.protobuf.a1 {
    SELFIE(0),
    DOCUMENT(1),
    SELFIE_WITHOUT_PREVIEW(2),
    UNRECOGNIZED(-1);

    public static final int DOCUMENT_VALUE = 1;
    public static final int SELFIE_VALUE = 0;
    public static final int SELFIE_WITHOUT_PREVIEW_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new i1();
    private final int value;

    j1(int i) {
        this.value = i;
    }

    public static j1 a(int i) {
        if (i == 0) {
            return SELFIE;
        }
        if (i == 1) {
            return DOCUMENT;
        }
        if (i != 2) {
            return null;
        }
        return SELFIE_WITHOUT_PREVIEW;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

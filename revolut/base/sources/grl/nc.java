package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum nc implements com.google.protobuf.a1 {
    WebExtension(0),
    UNRECOGNIZED(-1);

    public static final int WebExtension_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new mc();
    private final int value;

    nc(int i) {
        this.value = i;
    }

    public static nc a(int i) {
        if (i != 0) {
            return null;
        }
        return WebExtension;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

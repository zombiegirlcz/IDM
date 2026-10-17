package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum wc implements com.google.protobuf.a1 {
    page(0),
    popup(1),
    UNRECOGNIZED(-1);

    private static final com.google.protobuf.b1 internalValueMap = new vc();
    public static final int page_VALUE = 0;
    public static final int popup_VALUE = 1;
    private final int value;

    wc(int i) {
        this.value = i;
    }

    public static wc a(int i) {
        if (i == 0) {
            return page;
        }
        if (i != 1) {
            return null;
        }
        return popup;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

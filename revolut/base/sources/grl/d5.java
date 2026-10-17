package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum d5 implements com.google.protobuf.a1 {
    AVATAR(0),
    SMALL_TILE(1),
    WIDE_TILE(2),
    LARGE_TILE(3),
    HEADER(4),
    UNRECOGNIZED(-1);

    public static final int AVATAR_VALUE = 0;
    public static final int HEADER_VALUE = 4;
    public static final int LARGE_TILE_VALUE = 3;
    public static final int SMALL_TILE_VALUE = 1;
    public static final int WIDE_TILE_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new c5();
    private final int value;

    d5(int i) {
        this.value = i;
    }

    public static d5 a(int i) {
        if (i == 0) {
            return AVATAR;
        }
        if (i == 1) {
            return SMALL_TILE;
        }
        if (i == 2) {
            return WIDE_TILE;
        }
        if (i == 3) {
            return LARGE_TILE;
        }
        if (i != 4) {
            return null;
        }
        return HEADER;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

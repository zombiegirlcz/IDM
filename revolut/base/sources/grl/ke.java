package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum ke implements com.google.protobuf.a1 {
    UnspecifiedCategory(0),
    Mobile(1),
    Tablet(2),
    Desktop(3),
    TV(4),
    Bot(5),
    UNRECOGNIZED(-1);

    public static final int Bot_VALUE = 5;
    public static final int Desktop_VALUE = 3;
    public static final int Mobile_VALUE = 1;
    public static final int TV_VALUE = 4;
    public static final int Tablet_VALUE = 2;
    public static final int UnspecifiedCategory_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new je();
    private final int value;

    ke(int i) {
        this.value = i;
    }

    public static ke a(int i) {
        if (i == 0) {
            return UnspecifiedCategory;
        }
        if (i == 1) {
            return Mobile;
        }
        if (i == 2) {
            return Tablet;
        }
        if (i == 3) {
            return Desktop;
        }
        if (i == 4) {
            return TV;
        }
        if (i != 5) {
            return null;
        }
        return Bot;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

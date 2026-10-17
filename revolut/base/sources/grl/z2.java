package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum z2 implements com.google.protobuf.a1 {
    App(0),
    DeepLink(1),
    SystemWidget(2),
    RevolutShop(3),
    UNRECOGNIZED(-1);

    public static final int App_VALUE = 0;
    public static final int DeepLink_VALUE = 1;
    public static final int RevolutShop_VALUE = 3;
    public static final int SystemWidget_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new y2();
    private final int value;

    z2(int i) {
        this.value = i;
    }

    public static z2 a(int i) {
        if (i == 0) {
            return App;
        }
        if (i == 1) {
            return DeepLink;
        }
        if (i == 2) {
            return SystemWidget;
        }
        if (i != 3) {
            return null;
        }
        return RevolutShop;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

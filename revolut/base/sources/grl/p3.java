package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum p3 implements com.google.protobuf.a1 {
    Docs(0),
    DesignSystem(1),
    Developer(2),
    Internal(3),
    UIKit(4),
    Revpress(5),
    People(6),
    UNRECOGNIZED(-1);

    public static final int DesignSystem_VALUE = 1;
    public static final int Developer_VALUE = 2;
    public static final int Docs_VALUE = 0;
    public static final int Internal_VALUE = 3;
    public static final int People_VALUE = 6;
    public static final int Revpress_VALUE = 5;
    public static final int UIKit_VALUE = 4;
    private static final com.google.protobuf.b1 internalValueMap = new o3();
    private final int value;

    p3(int i) {
        this.value = i;
    }

    public static p3 a(int i) {
        switch (i) {
            case 0:
                return Docs;
            case 1:
                return DesignSystem;
            case 2:
                return Developer;
            case 3:
                return Internal;
            case 4:
                return UIKit;
            case 5:
                return Revpress;
            case 6:
                return People;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

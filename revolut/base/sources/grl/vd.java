package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum vd implements com.google.protobuf.a1 {
    Dpad(0),
    Gamepad(1),
    Joystick(2),
    Keyboard(3),
    Mouse(4),
    MouseRelative(5),
    Stylus(6),
    Touchpad(7),
    Touchscreen(8),
    Trackball(9),
    Unknown(10),
    AccessibilityNode(11),
    UNRECOGNIZED(-1);

    public static final int AccessibilityNode_VALUE = 11;
    public static final int Dpad_VALUE = 0;
    public static final int Gamepad_VALUE = 1;
    public static final int Joystick_VALUE = 2;
    public static final int Keyboard_VALUE = 3;
    public static final int MouseRelative_VALUE = 5;
    public static final int Mouse_VALUE = 4;
    public static final int Stylus_VALUE = 6;
    public static final int Touchpad_VALUE = 7;
    public static final int Touchscreen_VALUE = 8;
    public static final int Trackball_VALUE = 9;
    public static final int Unknown_VALUE = 10;
    private static final com.google.protobuf.b1 internalValueMap = new ud();
    private final int value;

    vd(int i) {
        this.value = i;
    }

    public static vd a(int i) {
        switch (i) {
            case 0:
                return Dpad;
            case 1:
                return Gamepad;
            case 2:
                return Joystick;
            case 3:
                return Keyboard;
            case 4:
                return Mouse;
            case 5:
                return MouseRelative;
            case 6:
                return Stylus;
            case 7:
                return Touchpad;
            case 8:
                return Touchscreen;
            case 9:
                return Trackball;
            case 10:
                return Unknown;
            case 11:
                return AccessibilityNode;
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

package uo;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f281484a;

    static {
        int[] iArr = new int[zz0.f.values().length];
        try {
            iArr[zz0.f.DPAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zz0.f.GAMEPAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zz0.f.JOYSTICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zz0.f.KEYBOARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[zz0.f.MOUSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[zz0.f.MOUSE_RELATIVE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[zz0.f.STYLUS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[zz0.f.TOUCHPAD.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[zz0.f.TOUCHSCREEN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[zz0.f.TRACKBALL.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[zz0.f.UNKNOWN.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[zz0.f.ACCESSIBILITY_NODE.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        f281484a = iArr;
    }
}

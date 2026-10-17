package zz0;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ACCESSIBILITY_NODE;

    @NotNull
    public static final e Companion;
    public static final f DPAD;
    public static final f GAMEPAD;
    public static final f JOYSTICK;
    public static final f KEYBOARD;
    public static final f MOUSE;
    public static final f MOUSE_RELATIVE;
    public static final f STYLUS;
    public static final f TOUCHPAD;
    public static final f TOUCHSCREEN;
    public static final f TRACKBALL;
    public static final f UNKNOWN;

    static {
        f fVar = new f("DPAD", 0);
        DPAD = fVar;
        f fVar2 = new f("GAMEPAD", 1);
        GAMEPAD = fVar2;
        f fVar3 = new f("JOYSTICK", 2);
        JOYSTICK = fVar3;
        f fVar4 = new f("KEYBOARD", 3);
        KEYBOARD = fVar4;
        f fVar5 = new f("MOUSE", 4);
        MOUSE = fVar5;
        f fVar6 = new f("MOUSE_RELATIVE", 5);
        MOUSE_RELATIVE = fVar6;
        f fVar7 = new f("STYLUS", 6);
        STYLUS = fVar7;
        f fVar8 = new f("TOUCHPAD", 7);
        TOUCHPAD = fVar8;
        f fVar9 = new f("TOUCHSCREEN", 8);
        TOUCHSCREEN = fVar9;
        f fVar10 = new f("TRACKBALL", 9);
        TRACKBALL = fVar10;
        f fVar11 = new f("UNKNOWN", 10);
        UNKNOWN = fVar11;
        f fVar12 = new f("ACCESSIBILITY_NODE", 11);
        ACCESSIBILITY_NODE = fVar12;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
        Companion = new e();
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}

package jz;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o LOOK_STRAIGHT;
    public static final o MOVE_CLOSER;
    public static final o MOVE_DOWN;
    public static final o MOVE_FURTHER;
    public static final o MOVE_LEFT;
    public static final o MOVE_RIGHT;
    public static final o MOVE_UP;
    public static final o SUCCESS_VALIDATION;
    public static final o TOO_BLURRY;
    public static final o TOO_BRIGHT;
    public static final o TOO_DARK;
    public static final o VERIFY_IDENTITY;

    static {
        o oVar = new o("VERIFY_IDENTITY", 0);
        VERIFY_IDENTITY = oVar;
        o oVar2 = new o("MOVE_LEFT", 1);
        MOVE_LEFT = oVar2;
        o oVar3 = new o("MOVE_RIGHT", 2);
        MOVE_RIGHT = oVar3;
        o oVar4 = new o("MOVE_DOWN", 3);
        MOVE_DOWN = oVar4;
        o oVar5 = new o("MOVE_UP", 4);
        MOVE_UP = oVar5;
        o oVar6 = new o("MOVE_CLOSER", 5);
        MOVE_CLOSER = oVar6;
        o oVar7 = new o("MOVE_FURTHER", 6);
        MOVE_FURTHER = oVar7;
        o oVar8 = new o("LOOK_STRAIGHT", 7);
        LOOK_STRAIGHT = oVar8;
        o oVar9 = new o("TOO_BRIGHT", 8);
        TOO_BRIGHT = oVar9;
        o oVar10 = new o("TOO_DARK", 9);
        TOO_DARK = oVar10;
        o oVar11 = new o("TOO_BLURRY", 10);
        TOO_BLURRY = oVar11;
        o oVar12 = new o("SUCCESS_VALIDATION", 11);
        SUCCESS_VALIDATION = oVar12;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, oVar10, oVar11, oVar12};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}

package fmg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class j0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 BLACK;
    public static final j0 DISABLED_PRIMARY;
    public static final j0 DISABLED_SECONDARY;
    public static final j0 DOWN;
    public static final j0 GREEN;
    public static final j0 HIGHLIGHTED;
    public static final j0 ORANGE;
    public static final j0 PINK;
    public static final j0 RED;
    public static final j0 REGULAR_PRIMARY;
    public static final j0 REGULAR_SECONDARY;
    public static final j0 UP;
    public static final j0 WHITE;

    static {
        j0 j0Var = new j0("HIGHLIGHTED", 0);
        HIGHLIGHTED = j0Var;
        j0 j0Var2 = new j0("REGULAR_PRIMARY", 1);
        REGULAR_PRIMARY = j0Var2;
        j0 j0Var3 = new j0("REGULAR_SECONDARY", 2);
        REGULAR_SECONDARY = j0Var3;
        j0 j0Var4 = new j0("DISABLED_PRIMARY", 3);
        DISABLED_PRIMARY = j0Var4;
        j0 j0Var5 = new j0("DISABLED_SECONDARY", 4);
        DISABLED_SECONDARY = j0Var5;
        j0 j0Var6 = new j0("PINK", 5);
        PINK = j0Var6;
        j0 j0Var7 = new j0("ORANGE", 6);
        ORANGE = j0Var7;
        j0 j0Var8 = new j0("WHITE", 7);
        WHITE = j0Var8;
        j0 j0Var9 = new j0("RED", 8);
        RED = j0Var9;
        j0 j0Var10 = new j0("BLACK", 9);
        BLACK = j0Var10;
        j0 j0Var11 = new j0("GREEN", 10);
        GREEN = j0Var11;
        j0 j0Var12 = new j0("UP", 11);
        UP = j0Var12;
        j0 j0Var13 = new j0("DOWN", 12);
        DOWN = j0Var13;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3, j0Var4, j0Var5, j0Var6, j0Var7, j0Var8, j0Var9, j0Var10, j0Var11, j0Var12, j0Var13};
        $VALUES = j0VarArr;
        $ENTRIES = vc.s.n(j0VarArr);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}

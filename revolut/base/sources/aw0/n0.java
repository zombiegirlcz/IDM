package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class n0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 LEFT;
    public static final n0 LEFT_TOP;
    public static final n0 RIGHT;
    public static final n0 RIGHT_TOP;
    public static final n0 TOP;

    static {
        n0 n0Var = new n0("LEFT", 0);
        LEFT = n0Var;
        n0 n0Var2 = new n0("LEFT_TOP", 1);
        LEFT_TOP = n0Var2;
        n0 n0Var3 = new n0("TOP", 2);
        TOP = n0Var3;
        n0 n0Var4 = new n0("RIGHT_TOP", 3);
        RIGHT_TOP = n0Var4;
        n0 n0Var5 = new n0("RIGHT", 4);
        RIGHT = n0Var5;
        n0[] n0VarArr = {n0Var, n0Var2, n0Var3, n0Var4, n0Var5};
        $VALUES = n0VarArr;
        $ENTRIES = vc.s.n(n0VarArr);
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }
}

package fmg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class k0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 DEFAULT;
    public static final k0 GREEN;
    public static final k0 GREY50;
    public static final k0 ORANGE;
    public static final k0 RED;

    static {
        k0 k0Var = new k0("DEFAULT", 0);
        DEFAULT = k0Var;
        k0 k0Var2 = new k0("RED", 1);
        RED = k0Var2;
        k0 k0Var3 = new k0("ORANGE", 2);
        ORANGE = k0Var3;
        k0 k0Var4 = new k0("GREEN", 3);
        GREEN = k0Var4;
        k0 k0Var5 = new k0("GREY50", 4);
        GREY50 = k0Var5;
        k0[] k0VarArr = {k0Var, k0Var2, k0Var3, k0Var4, k0Var5};
        $VALUES = k0VarArr;
        $ENTRIES = vc.s.n(k0VarArr);
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}

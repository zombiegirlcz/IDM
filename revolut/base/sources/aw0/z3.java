package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class z3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z3[] $VALUES;
    public static final z3 ALWAYS_SHOW;
    public static final z3 HIDE_WHEN_CLOSE;

    static {
        z3 z3Var = new z3("HIDE_WHEN_CLOSE", 0);
        HIDE_WHEN_CLOSE = z3Var;
        z3 z3Var2 = new z3("ALWAYS_SHOW", 1);
        ALWAYS_SHOW = z3Var2;
        z3[] z3VarArr = {z3Var, z3Var2};
        $VALUES = z3VarArr;
        $ENTRIES = vc.s.n(z3VarArr);
    }

    public static z3 valueOf(String str) {
        return (z3) Enum.valueOf(z3.class, str);
    }

    public static z3[] values() {
        return (z3[]) $VALUES.clone();
    }
}

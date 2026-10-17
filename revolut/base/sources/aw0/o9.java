package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o9 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o9[] $VALUES;
    public static final o9 NON_SENSITIVE;
    public static final o9 SENSITIVE;

    static {
        o9 o9Var = new o9("SENSITIVE", 0);
        SENSITIVE = o9Var;
        o9 o9Var2 = new o9("NON_SENSITIVE", 1);
        NON_SENSITIVE = o9Var2;
        o9[] o9VarArr = {o9Var, o9Var2};
        $VALUES = o9VarArr;
        $ENTRIES = vc.s.n(o9VarArr);
    }

    public static o9 valueOf(String str) {
        return (o9) Enum.valueOf(o9.class, str);
    }

    public static o9[] values() {
        return (o9[]) $VALUES.clone();
    }
}

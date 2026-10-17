package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class o4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o4[] $VALUES;
    public static final o4 FULL_CIRCLE;
    public static final o4 HALF_CIRCLE;
    public static final o4 SEMI_CIRCLE;

    static {
        o4 o4Var = new o4("FULL_CIRCLE", 0);
        FULL_CIRCLE = o4Var;
        o4 o4Var2 = new o4("SEMI_CIRCLE", 1);
        SEMI_CIRCLE = o4Var2;
        o4 o4Var3 = new o4("HALF_CIRCLE", 2);
        HALF_CIRCLE = o4Var3;
        o4[] o4VarArr = {o4Var, o4Var2, o4Var3};
        $VALUES = o4VarArr;
        $ENTRIES = vc.s.n(o4VarArr);
    }

    public static o4 valueOf(String str) {
        return (o4) Enum.valueOf(o4.class, str);
    }

    public static o4[] values() {
        return (o4[]) $VALUES.clone();
    }
}

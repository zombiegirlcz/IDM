package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class o5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o5[] $VALUES;
    public static final o5 COLOR;
    public static final o5 TOOLTIP;
    public static final o5 VERTICAL_LINE;

    static {
        o5 o5Var = new o5("VERTICAL_LINE", 0);
        VERTICAL_LINE = o5Var;
        o5 o5Var2 = new o5("COLOR", 1);
        COLOR = o5Var2;
        o5 o5Var3 = new o5("TOOLTIP", 2);
        TOOLTIP = o5Var3;
        o5[] o5VarArr = {o5Var, o5Var2, o5Var3};
        $VALUES = o5VarArr;
        $ENTRIES = vc.s.n(o5VarArr);
    }

    public static o5 valueOf(String str) {
        return (o5) Enum.valueOf(o5.class, str);
    }

    public static o5[] values() {
        return (o5[]) $VALUES.clone();
    }
}

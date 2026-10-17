package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class c3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c3[] $VALUES;
    public static final c3 CENTERED;
    public static final c3 LEFT;
    public static final c3 RIGHT;
    public static final c3 SPREAD_WITH_DYNAMIC_PADDINGS;
    public static final c3 SPREAD_WITH_FIXED_PADDINGS;

    static {
        c3 c3Var = new c3("SPREAD_WITH_FIXED_PADDINGS", 0);
        SPREAD_WITH_FIXED_PADDINGS = c3Var;
        c3 c3Var2 = new c3("SPREAD_WITH_DYNAMIC_PADDINGS", 1);
        SPREAD_WITH_DYNAMIC_PADDINGS = c3Var2;
        c3 c3Var3 = new c3("CENTERED", 2);
        CENTERED = c3Var3;
        c3 c3Var4 = new c3("LEFT", 3);
        LEFT = c3Var4;
        c3 c3Var5 = new c3("RIGHT", 4);
        RIGHT = c3Var5;
        c3[] c3VarArr = {c3Var, c3Var2, c3Var3, c3Var4, c3Var5};
        $VALUES = c3VarArr;
        $ENTRIES = vc.s.n(c3VarArr);
    }

    public static c3 valueOf(String str) {
        return (c3) Enum.valueOf(c3.class, str);
    }

    public static c3[] values() {
        return (c3[]) $VALUES.clone();
    }
}

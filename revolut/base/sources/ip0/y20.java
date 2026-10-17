package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class y20 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y20[] $VALUES;
    public static final y20 LARGE;
    public static final y20 SMALL;

    static {
        y20 y20Var = new y20("LARGE", 0);
        LARGE = y20Var;
        y20 y20Var2 = new y20("SMALL", 1);
        SMALL = y20Var2;
        y20[] y20VarArr = {y20Var, y20Var2};
        $VALUES = y20VarArr;
        $ENTRIES = vc.s.n(y20VarArr);
    }

    public static y20 valueOf(String str) {
        return (y20) Enum.valueOf(y20.class, str);
    }

    public static y20[] values() {
        return (y20[]) $VALUES.clone();
    }
}

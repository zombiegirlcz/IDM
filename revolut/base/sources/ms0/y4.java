package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class y4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y4[] $VALUES;
    public static final y4 LARGE;
    public static final y4 SMALL;

    static {
        y4 y4Var = new y4("SMALL", 0);
        SMALL = y4Var;
        y4 y4Var2 = new y4("LARGE", 1);
        LARGE = y4Var2;
        y4[] y4VarArr = {y4Var, y4Var2};
        $VALUES = y4VarArr;
        $ENTRIES = vc.s.n(y4VarArr);
    }

    public static y4 valueOf(String str) {
        return (y4) Enum.valueOf(y4.class, str);
    }

    public static y4[] values() {
        return (y4[]) $VALUES.clone();
    }
}

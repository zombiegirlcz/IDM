package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class y3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y3[] $VALUES;
    public static final y3 DASHED;
    public static final y3 DEFAULT;

    static {
        y3 y3Var = new y3("DEFAULT", 0);
        DEFAULT = y3Var;
        y3 y3Var2 = new y3("DASHED", 1);
        DASHED = y3Var2;
        y3[] y3VarArr = {y3Var, y3Var2};
        $VALUES = y3VarArr;
        $ENTRIES = vc.s.n(y3VarArr);
    }

    public static y3 valueOf(String str) {
        return (y3) Enum.valueOf(y3.class, str);
    }

    public static y3[] values() {
        return (y3[]) $VALUES.clone();
    }
}

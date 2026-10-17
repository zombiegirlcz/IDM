package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class y10 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y10[] $VALUES;
    public static final y10 GREY;
    public static final y10 LIGHT;

    static {
        y10 y10Var = new y10("LIGHT", 0);
        LIGHT = y10Var;
        y10 y10Var2 = new y10("GREY", 1);
        GREY = y10Var2;
        y10[] y10VarArr = {y10Var, y10Var2};
        $VALUES = y10VarArr;
        $ENTRIES = vc.s.n(y10VarArr);
    }

    public static y10 valueOf(String str) {
        return (y10) Enum.valueOf(y10.class, str);
    }

    public static y10[] values() {
        return (y10[]) $VALUES.clone();
    }
}

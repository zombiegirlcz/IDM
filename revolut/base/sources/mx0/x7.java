package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class x7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x7[] $VALUES;
    public static final x7 DUAL;
    public static final x7 SINGLE;

    static {
        x7 x7Var = new x7("DUAL", 0);
        DUAL = x7Var;
        x7 x7Var2 = new x7("SINGLE", 1);
        SINGLE = x7Var2;
        x7[] x7VarArr = {x7Var, x7Var2};
        $VALUES = x7VarArr;
        $ENTRIES = vc.s.n(x7VarArr);
    }

    public static x7 valueOf(String str) {
        return (x7) Enum.valueOf(x7.class, str);
    }

    public static x7[] values() {
        return (x7[]) $VALUES.clone();
    }
}

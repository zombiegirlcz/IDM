package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class x1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x1[] $VALUES;
    public static final x1 DEFAULT;
    public static final x1 LARGE;
    public static final x1 SMALL;

    static {
        x1 x1Var = new x1("DEFAULT", 0);
        DEFAULT = x1Var;
        x1 x1Var2 = new x1("LARGE", 1);
        LARGE = x1Var2;
        x1 x1Var3 = new x1("SMALL", 2);
        SMALL = x1Var3;
        x1[] x1VarArr = {x1Var, x1Var2, x1Var3};
        $VALUES = x1VarArr;
        $ENTRIES = vc.s.n(x1VarArr);
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) $VALUES.clone();
    }
}

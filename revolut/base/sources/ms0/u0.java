package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class u0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u0[] $VALUES;
    public static final u0 DOTTED;
    public static final u0 SOLID;

    static {
        u0 u0Var = new u0("DOTTED", 0);
        DOTTED = u0Var;
        u0 u0Var2 = new u0("SOLID", 1);
        SOLID = u0Var2;
        u0[] u0VarArr = {u0Var, u0Var2};
        $VALUES = u0VarArr;
        $ENTRIES = vc.s.n(u0VarArr);
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) $VALUES.clone();
    }
}

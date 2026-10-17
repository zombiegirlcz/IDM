package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class u0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u0[] $VALUES;
    public static final u0 FINISH_ACTION_MODE;
    public static final u0 NONE;
    public static final u0 PREFIX_CLICK;
    public static final u0 SUFFIX_CLICK;

    static {
        u0 u0Var = new u0("NONE", 0);
        NONE = u0Var;
        u0 u0Var2 = new u0("FINISH_ACTION_MODE", 1);
        FINISH_ACTION_MODE = u0Var2;
        u0 u0Var3 = new u0("PREFIX_CLICK", 2);
        PREFIX_CLICK = u0Var3;
        u0 u0Var4 = new u0("SUFFIX_CLICK", 3);
        SUFFIX_CLICK = u0Var4;
        u0[] u0VarArr = {u0Var, u0Var2, u0Var3, u0Var4};
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

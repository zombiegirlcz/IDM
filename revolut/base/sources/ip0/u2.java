package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class u2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u2[] $VALUES;
    public static final u2 DEFAULT;
    public static final u2 UNLIMITED;

    static {
        u2 u2Var = new u2("DEFAULT", 0);
        DEFAULT = u2Var;
        u2 u2Var2 = new u2("UNLIMITED", 1);
        UNLIMITED = u2Var2;
        u2[] u2VarArr = {u2Var, u2Var2};
        $VALUES = u2VarArr;
        $ENTRIES = vc.s.n(u2VarArr);
    }

    public static u2 valueOf(String str) {
        return (u2) Enum.valueOf(u2.class, str);
    }

    public static u2[] values() {
        return (u2[]) $VALUES.clone();
    }
}

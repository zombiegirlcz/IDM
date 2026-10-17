package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class u00 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u00[] $VALUES;
    public static final u00 BACK;
    public static final u00 FRONT;

    static {
        u00 u00Var = new u00("FRONT", 0);
        FRONT = u00Var;
        u00 u00Var2 = new u00("BACK", 1);
        BACK = u00Var2;
        u00[] u00VarArr = {u00Var, u00Var2};
        $VALUES = u00VarArr;
        $ENTRIES = vc.s.n(u00VarArr);
    }

    public static u00 valueOf(String str) {
        return (u00) Enum.valueOf(u00.class, str);
    }

    public static u00[] values() {
        return (u00[]) $VALUES.clone();
    }
}

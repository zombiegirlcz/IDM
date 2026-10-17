package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class u1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u1[] $VALUES;
    public static final u1 DEFAULT;
    public static final u1 TITLE_AND_SUBTITLE;
    public static final u1 TITLE_ONLY;

    static {
        u1 u1Var = new u1("DEFAULT", 0);
        DEFAULT = u1Var;
        u1 u1Var2 = new u1("TITLE_ONLY", 1);
        TITLE_ONLY = u1Var2;
        u1 u1Var3 = new u1("TITLE_AND_SUBTITLE", 2);
        TITLE_AND_SUBTITLE = u1Var3;
        u1[] u1VarArr = {u1Var, u1Var2, u1Var3};
        $VALUES = u1VarArr;
        $ENTRIES = vc.s.n(u1VarArr);
    }

    public static u1 valueOf(String str) {
        return (u1) Enum.valueOf(u1.class, str);
    }

    public static u1[] values() {
        return (u1[]) $VALUES.clone();
    }
}

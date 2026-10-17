package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ia0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ia0[] $VALUES;
    public static final ia0 ALWAYS_VISIBLE;
    public static final ia0 VISIBLE_WHEN_DESCRIPTION_ELLIPSIZED;

    static {
        ia0 ia0Var = new ia0("ALWAYS_VISIBLE", 0);
        ALWAYS_VISIBLE = ia0Var;
        ia0 ia0Var2 = new ia0("VISIBLE_WHEN_DESCRIPTION_ELLIPSIZED", 1);
        VISIBLE_WHEN_DESCRIPTION_ELLIPSIZED = ia0Var2;
        ia0[] ia0VarArr = {ia0Var, ia0Var2};
        $VALUES = ia0VarArr;
        $ENTRIES = vc.s.n(ia0VarArr);
    }

    public static ia0 valueOf(String str) {
        return (ia0) Enum.valueOf(ia0.class, str);
    }

    public static ia0[] values() {
        return (ia0[]) $VALUES.clone();
    }
}

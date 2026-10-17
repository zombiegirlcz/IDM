package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class j4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j4[] $VALUES;
    public static final j4 DEFAULT;
    public static final j4 SHOW_ON_SCROLL_UP;

    static {
        j4 j4Var = new j4("DEFAULT", 0);
        DEFAULT = j4Var;
        j4 j4Var2 = new j4("SHOW_ON_SCROLL_UP", 1);
        SHOW_ON_SCROLL_UP = j4Var2;
        j4[] j4VarArr = {j4Var, j4Var2};
        $VALUES = j4VarArr;
        $ENTRIES = vc.s.n(j4VarArr);
    }

    public static j4 valueOf(String str) {
        return (j4) Enum.valueOf(j4.class, str);
    }

    public static j4[] values() {
        return (j4[]) $VALUES.clone();
    }
}

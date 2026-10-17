package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class t1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t1[] $VALUES;
    public static final t1 DEFAULT;
    public static final t1 FILL_AVAILABLE_SPACE;

    static {
        t1 t1Var = new t1("DEFAULT", 0);
        DEFAULT = t1Var;
        t1 t1Var2 = new t1("FILL_AVAILABLE_SPACE", 1);
        FILL_AVAILABLE_SPACE = t1Var2;
        t1[] t1VarArr = {t1Var, t1Var2};
        $VALUES = t1VarArr;
        $ENTRIES = vc.s.n(t1VarArr);
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) $VALUES.clone();
    }
}

package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class t3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t3[] $VALUES;
    public static final t3 DEFAULT;
    public static final t3 PROFILE;
    public static final t3 TWO_LINES;

    static {
        t3 t3Var = new t3("DEFAULT", 0);
        DEFAULT = t3Var;
        t3 t3Var2 = new t3("PROFILE", 1);
        PROFILE = t3Var2;
        t3 t3Var3 = new t3("TWO_LINES", 2);
        TWO_LINES = t3Var3;
        t3[] t3VarArr = {t3Var, t3Var2, t3Var3};
        $VALUES = t3VarArr;
        $ENTRIES = vc.s.n(t3VarArr);
    }

    public static t3 valueOf(String str) {
        return (t3) Enum.valueOf(t3.class, str);
    }

    public static t3[] values() {
        return (t3[]) $VALUES.clone();
    }
}

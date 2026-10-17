package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class a3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a3[] $VALUES;
    public static final a3 COLLAPSE_EARLY;
    public static final a3 DEFAULT;

    static {
        a3 a3Var = new a3("DEFAULT", 0);
        DEFAULT = a3Var;
        a3 a3Var2 = new a3("COLLAPSE_EARLY", 1);
        COLLAPSE_EARLY = a3Var2;
        a3[] a3VarArr = {a3Var, a3Var2};
        $VALUES = a3VarArr;
        $ENTRIES = vc.s.n(a3VarArr);
    }

    public static a3 valueOf(String str) {
        return (a3) Enum.valueOf(a3.class, str);
    }

    public static a3[] values() {
        return (a3[]) $VALUES.clone();
    }
}

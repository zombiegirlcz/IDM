package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class w3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w3[] $VALUES;
    public static final w3 DEFAULT;
    public static final w3 DIMMED;

    static {
        w3 w3Var = new w3("DEFAULT", 0);
        DEFAULT = w3Var;
        w3 w3Var2 = new w3("DIMMED", 1);
        DIMMED = w3Var2;
        w3[] w3VarArr = {w3Var, w3Var2};
        $VALUES = w3VarArr;
        $ENTRIES = vc.s.n(w3VarArr);
    }

    public static w3 valueOf(String str) {
        return (w3) Enum.valueOf(w3.class, str);
    }

    public static w3[] values() {
        return (w3[]) $VALUES.clone();
    }
}

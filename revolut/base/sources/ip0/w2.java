package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class w2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w2[] $VALUES;
    public static final w2 MANY;
    public static final w2 ONE;

    static {
        w2 w2Var = new w2("ONE", 0);
        ONE = w2Var;
        w2 w2Var2 = new w2("MANY", 1);
        MANY = w2Var2;
        w2[] w2VarArr = {w2Var, w2Var2};
        $VALUES = w2VarArr;
        $ENTRIES = vc.s.n(w2VarArr);
    }

    public static w2 valueOf(String str) {
        return (w2) Enum.valueOf(w2.class, str);
    }

    public static w2[] values() {
        return (w2[]) $VALUES.clone();
    }
}

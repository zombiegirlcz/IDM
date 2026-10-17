package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class j2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j2[] $VALUES;
    public static final j2 FIXED;
    public static final j2 GRID;

    static {
        j2 j2Var = new j2("FIXED", 0);
        FIXED = j2Var;
        j2 j2Var2 = new j2("GRID", 1);
        GRID = j2Var2;
        j2[] j2VarArr = {j2Var, j2Var2};
        $VALUES = j2VarArr;
        $ENTRIES = vc.s.n(j2VarArr);
    }

    public static j2 valueOf(String str) {
        return (j2) Enum.valueOf(j2.class, str);
    }

    public static j2[] values() {
        return (j2[]) $VALUES.clone();
    }
}

package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class v6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v6[] $VALUES;
    public static final v6 NORMAL;
    public static final v6 SQUARE;

    static {
        v6 v6Var = new v6("NORMAL", 0);
        NORMAL = v6Var;
        v6 v6Var2 = new v6("SQUARE", 1);
        SQUARE = v6Var2;
        v6[] v6VarArr = {v6Var, v6Var2};
        $VALUES = v6VarArr;
        $ENTRIES = vc.s.n(v6VarArr);
    }

    public static v6 valueOf(String str) {
        return (v6) Enum.valueOf(v6.class, str);
    }

    public static v6[] values() {
        return (v6[]) $VALUES.clone();
    }
}

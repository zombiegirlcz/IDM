package op0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class i2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i2[] $VALUES;
    public static final i2 MATCH_PARENT;
    public static final i2 WRAP_CONTENT;

    static {
        i2 i2Var = new i2("WRAP_CONTENT", 0);
        WRAP_CONTENT = i2Var;
        i2 i2Var2 = new i2("MATCH_PARENT", 1);
        MATCH_PARENT = i2Var2;
        i2[] i2VarArr = {i2Var, i2Var2};
        $VALUES = i2VarArr;
        $ENTRIES = vc.s.n(i2VarArr);
    }

    public static i2 valueOf(String str) {
        return (i2) Enum.valueOf(i2.class, str);
    }

    public static i2[] values() {
        return (i2[]) $VALUES.clone();
    }
}

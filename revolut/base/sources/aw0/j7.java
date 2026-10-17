package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class j7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j7[] $VALUES;
    public static final j7 ALWAYS;
    public static final j7 DEFAULT;

    static {
        j7 j7Var = new j7("DEFAULT", 0);
        DEFAULT = j7Var;
        j7 j7Var2 = new j7("ALWAYS", 1);
        ALWAYS = j7Var2;
        j7[] j7VarArr = {j7Var, j7Var2};
        $VALUES = j7VarArr;
        $ENTRIES = vc.s.n(j7VarArr);
    }

    public static j7 valueOf(String str) {
        return (j7) Enum.valueOf(j7.class, str);
    }

    public static j7[] values() {
        return (j7[]) $VALUES.clone();
    }
}

package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class k7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k7[] $VALUES;
    public static final k7 ALWAYS;
    public static final k7 NEVER;
    public static final k7 ONLY_NEGATIVE;

    static {
        k7 k7Var = new k7("ALWAYS", 0);
        ALWAYS = k7Var;
        k7 k7Var2 = new k7("ONLY_NEGATIVE", 1);
        ONLY_NEGATIVE = k7Var2;
        k7 k7Var3 = new k7("NEVER", 2);
        NEVER = k7Var3;
        k7[] k7VarArr = {k7Var, k7Var2, k7Var3};
        $VALUES = k7VarArr;
        $ENTRIES = vc.s.n(k7VarArr);
    }

    public static k7 valueOf(String str) {
        return (k7) Enum.valueOf(k7.class, str);
    }

    public static k7[] values() {
        return (k7[]) $VALUES.clone();
    }
}

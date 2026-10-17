package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class m5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m5[] $VALUES;
    public static final m5 FIXED;
    public static final m5 SPACE_BETWEEN;
    public static final m5 SPACE_EVENLY;

    static {
        m5 m5Var = new m5("FIXED", 0);
        FIXED = m5Var;
        m5 m5Var2 = new m5("SPACE_BETWEEN", 1);
        SPACE_BETWEEN = m5Var2;
        m5 m5Var3 = new m5("SPACE_EVENLY", 2);
        SPACE_EVENLY = m5Var3;
        m5[] m5VarArr = {m5Var, m5Var2, m5Var3};
        $VALUES = m5VarArr;
        $ENTRIES = vc.s.n(m5VarArr);
    }

    public static m5 valueOf(String str) {
        return (m5) Enum.valueOf(m5.class, str);
    }

    public static m5[] values() {
        return (m5[]) $VALUES.clone();
    }
}

package ggk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class m1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m1[] $VALUES;
    public static final m1 PLAN_THEMED;
    public static final m1 WARNING;

    static {
        m1 m1Var = new m1("PLAN_THEMED", 0);
        PLAN_THEMED = m1Var;
        m1 m1Var2 = new m1("WARNING", 1);
        WARNING = m1Var2;
        m1[] m1VarArr = {m1Var, m1Var2};
        $VALUES = m1VarArr;
        $ENTRIES = vc.s.n(m1VarArr);
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) $VALUES.clone();
    }
}

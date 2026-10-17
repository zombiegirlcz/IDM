package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class m2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m2[] $VALUES;
    public static final m2 ALLOW;
    public static final m2 IGNORE;

    static {
        m2 m2Var = new m2("IGNORE", 0);
        IGNORE = m2Var;
        m2 m2Var2 = new m2("ALLOW", 1);
        ALLOW = m2Var2;
        m2[] m2VarArr = {m2Var, m2Var2};
        $VALUES = m2VarArr;
        $ENTRIES = vc.s.n(m2VarArr);
    }

    public static m2 valueOf(String str) {
        return (m2) Enum.valueOf(m2.class, str);
    }

    public static m2[] values() {
        return (m2[]) $VALUES.clone();
    }
}

package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class m0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m0[] $VALUES;
    public static final m0 MONTH_YEAR_PICKER;
    public static final m0 SELECTOR;

    static {
        m0 m0Var = new m0("SELECTOR", 0);
        SELECTOR = m0Var;
        m0 m0Var2 = new m0("MONTH_YEAR_PICKER", 1);
        MONTH_YEAR_PICKER = m0Var2;
        m0[] m0VarArr = {m0Var, m0Var2};
        $VALUES = m0VarArr;
        $ENTRIES = vc.s.n(m0VarArr);
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) $VALUES.clone();
    }
}

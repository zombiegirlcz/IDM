package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class m3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m3[] $VALUES;
    public static final m3 DOTTED;
    public static final m3 LINE;

    static {
        m3 m3Var = new m3("DOTTED", 0);
        DOTTED = m3Var;
        m3 m3Var2 = new m3("LINE", 1);
        LINE = m3Var2;
        m3[] m3VarArr = {m3Var, m3Var2};
        $VALUES = m3VarArr;
        $ENTRIES = vc.s.n(m3VarArr);
    }

    public static m3 valueOf(String str) {
        return (m3) Enum.valueOf(m3.class, str);
    }

    public static m3[] values() {
        return (m3[]) $VALUES.clone();
    }
}

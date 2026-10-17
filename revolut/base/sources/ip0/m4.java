package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class m4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m4[] $VALUES;
    public static final m4 NORMAL;
    public static final m4 SQUARE;

    static {
        m4 m4Var = new m4("NORMAL", 0);
        NORMAL = m4Var;
        m4 m4Var2 = new m4("SQUARE", 1);
        SQUARE = m4Var2;
        m4[] m4VarArr = {m4Var, m4Var2};
        $VALUES = m4VarArr;
        $ENTRIES = vc.s.n(m4VarArr);
    }

    public static m4 valueOf(String str) {
        return (m4) Enum.valueOf(m4.class, str);
    }

    public static m4[] values() {
        return (m4[]) $VALUES.clone();
    }
}

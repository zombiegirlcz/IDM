package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class m4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m4[] $VALUES;
    public static final m4 CONTEXTUAL;
    public static final m4 REFLECTIVE_SURFACE;
    public static final m4 WHITE_OR_BLACK_INVERTED;

    static {
        m4 m4Var = new m4("CONTEXTUAL", 0);
        CONTEXTUAL = m4Var;
        m4 m4Var2 = new m4("WHITE_OR_BLACK_INVERTED", 1);
        WHITE_OR_BLACK_INVERTED = m4Var2;
        m4 m4Var3 = new m4("REFLECTIVE_SURFACE", 2);
        REFLECTIVE_SURFACE = m4Var3;
        m4[] m4VarArr = {m4Var, m4Var2, m4Var3};
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

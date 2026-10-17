package au0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class m0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m0[] $VALUES;
    public static final m0 BOTTOM_BLUR;
    public static final m0 FULL_GRADIENT;
    public static final m0 NONE;

    static {
        m0 m0Var = new m0("NONE", 0);
        NONE = m0Var;
        m0 m0Var2 = new m0("FULL_GRADIENT", 1);
        FULL_GRADIENT = m0Var2;
        m0 m0Var3 = new m0("BOTTOM_BLUR", 2);
        BOTTOM_BLUR = m0Var3;
        m0[] m0VarArr = {m0Var, m0Var2, m0Var3};
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

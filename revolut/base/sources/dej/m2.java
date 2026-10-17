package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class m2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m2[] $VALUES;
    public static final m2 ERROR;
    public static final m2 INFO;
    public static final m2 UNKNOWN;
    public static final m2 WARNING;

    static {
        m2 m2Var = new m2("INFO", 0);
        INFO = m2Var;
        m2 m2Var2 = new m2("WARNING", 1);
        WARNING = m2Var2;
        m2 m2Var3 = new m2("ERROR", 2);
        ERROR = m2Var3;
        m2 m2Var4 = new m2("UNKNOWN", 3);
        UNKNOWN = m2Var4;
        m2[] m2VarArr = {m2Var, m2Var2, m2Var3, m2Var4};
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

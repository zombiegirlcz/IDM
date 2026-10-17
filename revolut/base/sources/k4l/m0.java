package k4l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class m0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m0[] $VALUES;
    public static final m0 FAILURE;
    public static final m0 PENDING;
    public static final m0 SUCCESS;

    static {
        m0 m0Var = new m0("SUCCESS", 0);
        SUCCESS = m0Var;
        m0 m0Var2 = new m0("PENDING", 1);
        PENDING = m0Var2;
        m0 m0Var3 = new m0("FAILURE", 2);
        FAILURE = m0Var3;
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

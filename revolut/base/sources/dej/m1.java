package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class m1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m1[] $VALUES;
    public static final m1 CANCELLED;
    public static final m1 FAILED;
    public static final m1 STARTED;
    public static final m1 SUCCEEDED;

    static {
        m1 m1Var = new m1("STARTED", 0);
        STARTED = m1Var;
        m1 m1Var2 = new m1("SUCCEEDED", 1);
        SUCCEEDED = m1Var2;
        m1 m1Var3 = new m1("FAILED", 2);
        FAILED = m1Var3;
        m1 m1Var4 = new m1("CANCELLED", 3);
        CANCELLED = m1Var4;
        m1[] m1VarArr = {m1Var, m1Var2, m1Var3, m1Var4};
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

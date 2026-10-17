package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class m1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m1[] $VALUES;
    public static final m1 ACTIVE;
    public static final m1 CANCELLED;
    public static final m1 CANCELLING;
    public static final m1 INACTIVE;
    public static final m1 INITIALISING;
    public static final m1 LAPSED;

    static {
        m1 m1Var = new m1("ACTIVE", 0);
        ACTIVE = m1Var;
        m1 m1Var2 = new m1("CANCELLED", 1);
        CANCELLED = m1Var2;
        m1 m1Var3 = new m1("CANCELLING", 2);
        CANCELLING = m1Var3;
        m1 m1Var4 = new m1("INACTIVE", 3);
        INACTIVE = m1Var4;
        m1 m1Var5 = new m1("INITIALISING", 4);
        INITIALISING = m1Var5;
        m1 m1Var6 = new m1("LAPSED", 5);
        LAPSED = m1Var6;
        m1[] m1VarArr = {m1Var, m1Var2, m1Var3, m1Var4, m1Var5, m1Var6};
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

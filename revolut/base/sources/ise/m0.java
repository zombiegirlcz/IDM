package ise;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class m0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m0[] $VALUES;
    public static final m0 NOT_REQUESTED;
    public static final m0 REQUESTED_FOR_ONE_STEP_FLOW;
    public static final m0 REQUESTED_FOR_TWO_STEP_FLOW;

    static {
        m0 m0Var = new m0("REQUESTED_FOR_ONE_STEP_FLOW", 0);
        REQUESTED_FOR_ONE_STEP_FLOW = m0Var;
        m0 m0Var2 = new m0("REQUESTED_FOR_TWO_STEP_FLOW", 1);
        REQUESTED_FOR_TWO_STEP_FLOW = m0Var2;
        m0 m0Var3 = new m0("NOT_REQUESTED", 2);
        NOT_REQUESTED = m0Var3;
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

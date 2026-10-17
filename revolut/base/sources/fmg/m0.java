package fmg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class m0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m0[] $VALUES;
    public static final m0 ADOPTION_JOURNEY_COMPLETED;
    public static final m0 SHOW_CARD_PREORDER_WIDGET;

    static {
        m0 m0Var = new m0("ADOPTION_JOURNEY_COMPLETED", 0);
        ADOPTION_JOURNEY_COMPLETED = m0Var;
        m0 m0Var2 = new m0("SHOW_CARD_PREORDER_WIDGET", 1);
        SHOW_CARD_PREORDER_WIDGET = m0Var2;
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

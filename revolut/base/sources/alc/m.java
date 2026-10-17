package alc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m FUNDING;
    public static final m INITIAL_FUNDING;
    public static final m PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE;
    public static final m PORTFOLIO_TEMPLATE_CHANGE;
    public static final m WITHDRAWAL;

    static {
        m mVar = new m("PORTFOLIO_TEMPLATE_CHANGE", 0);
        PORTFOLIO_TEMPLATE_CHANGE = mVar;
        m mVar2 = new m("PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE", 1);
        PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE = mVar2;
        m mVar3 = new m("WITHDRAWAL", 2);
        WITHDRAWAL = mVar3;
        m mVar4 = new m("FUNDING", 3);
        FUNDING = mVar4;
        m mVar5 = new m("INITIAL_FUNDING", 4);
        INITIAL_FUNDING = mVar5;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5};
        $VALUES = mVarArr;
        $ENTRIES = s.n(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}

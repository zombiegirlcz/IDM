package a0j;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m EMERGENCY_FUND;
    public static final m INVESTING_PACE;
    public static final m PORTFOLIO_RISK;
    public static final m PROJECTED_BALANCE;
    public static final m RECURRING_PAYMENTS;
    public static final m SAVING_PACE;
    public static final m SPENDING_PACE;
    public static final m TOTAL_WEALTH;

    static {
        m mVar = new m("SPENDING_PACE", 0);
        SPENDING_PACE = mVar;
        m mVar2 = new m("PROJECTED_BALANCE", 1);
        PROJECTED_BALANCE = mVar2;
        m mVar3 = new m("RECURRING_PAYMENTS", 2);
        RECURRING_PAYMENTS = mVar3;
        m mVar4 = new m("SAVING_PACE", 3);
        SAVING_PACE = mVar4;
        m mVar5 = new m("EMERGENCY_FUND", 4);
        EMERGENCY_FUND = mVar5;
        m mVar6 = new m("INVESTING_PACE", 5);
        INVESTING_PACE = mVar6;
        m mVar7 = new m("PORTFOLIO_RISK", 6);
        PORTFOLIO_RISK = mVar7;
        m mVar8 = new m("TOTAL_WEALTH", 7);
        TOTAL_WEALTH = mVar8;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8};
        $VALUES = mVarArr;
        $ENTRIES = vc.s.n(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}

package iyf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g CASHBACK;
    public static final g CASHBACK_REVERSAL;
    public static final g PAYMENT;
    public static final g POINTS_REDEMPTION;
    public static final g POINTS_REFUND;
    public static final g POINTS_REWARD;
    public static final g POINTS_REWARD_REVERSAL;
    public static final g REFUND;

    static {
        g gVar = new g("PAYMENT", 0);
        PAYMENT = gVar;
        g gVar2 = new g("REFUND", 1);
        REFUND = gVar2;
        g gVar3 = new g("CASHBACK", 2);
        CASHBACK = gVar3;
        g gVar4 = new g("CASHBACK_REVERSAL", 3);
        CASHBACK_REVERSAL = gVar4;
        g gVar5 = new g("POINTS_REDEMPTION", 4);
        POINTS_REDEMPTION = gVar5;
        g gVar6 = new g("POINTS_REFUND", 5);
        POINTS_REFUND = gVar6;
        g gVar7 = new g("POINTS_REWARD", 6);
        POINTS_REWARD = gVar7;
        g gVar8 = new g("POINTS_REWARD_REVERSAL", 7);
        POINTS_REWARD_REVERSAL = gVar8;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}

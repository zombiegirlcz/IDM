package rei;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o CASHBACK;
    public static final o PAYMENT;
    public static final o POINTS_REDEMPTION;
    public static final o POINTS_REFUND;
    public static final o POINTS_REWARD;
    public static final o POINTS_REWARD_REVERSAL;
    public static final o REFUND;
    public static final o UNKNOWN;

    static {
        o oVar = new o("PAYMENT", 0);
        PAYMENT = oVar;
        o oVar2 = new o("REFUND", 1);
        REFUND = oVar2;
        o oVar3 = new o("CASHBACK", 2);
        CASHBACK = oVar3;
        o oVar4 = new o("POINTS_REDEMPTION", 3);
        POINTS_REDEMPTION = oVar4;
        o oVar5 = new o("POINTS_REFUND", 4);
        POINTS_REFUND = oVar5;
        o oVar6 = new o("POINTS_REWARD", 5);
        POINTS_REWARD = oVar6;
        o oVar7 = new o("POINTS_REWARD_REVERSAL", 6);
        POINTS_REWARD_REVERSAL = oVar7;
        o oVar8 = new o("UNKNOWN", 7);
        UNKNOWN = oVar8;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}

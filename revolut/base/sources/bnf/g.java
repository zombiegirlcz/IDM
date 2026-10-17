package bnf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g CANCELLED;
    public static final g FAILED;
    public static final g MONEY_IN;
    public static final g MONEY_OUT;
    public static final g PENDING;
    public static final g PLUS;
    public static final g RECURRING;
    public static final g REFUND;
    public static final g SPARE_CHANGE;
    public static final g WARNING;

    static {
        g gVar = new g("PENDING", 0);
        PENDING = gVar;
        g gVar2 = new g("FAILED", 1);
        FAILED = gVar2;
        g gVar3 = new g("REFUND", 2);
        REFUND = gVar3;
        g gVar4 = new g("RECURRING", 3);
        RECURRING = gVar4;
        g gVar5 = new g("MONEY_IN", 4);
        MONEY_IN = gVar5;
        g gVar6 = new g("MONEY_OUT", 5);
        MONEY_OUT = gVar6;
        g gVar7 = new g("PLUS", 6);
        PLUS = gVar7;
        g gVar8 = new g("SPARE_CHANGE", 7);
        SPARE_CHANGE = gVar8;
        g gVar9 = new g("WARNING", 8);
        WARNING = gVar9;
        g gVar10 = new g("CANCELLED", 9);
        CANCELLED = gVar10;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10};
        $VALUES = gVarArr;
        $ENTRIES = vc.s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}

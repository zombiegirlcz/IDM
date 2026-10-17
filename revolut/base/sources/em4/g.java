package em4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g DayZero;
    public static final g MinPaid;
    public static final g NotPaid;
    public static final g Overdue;
    public static final g PaidInFull;
    public static final g PaidLessThanMin;
    public static final g Terminated;

    static {
        g gVar = new g("DayZero", 0);
        DayZero = gVar;
        g gVar2 = new g("Terminated", 1);
        Terminated = gVar2;
        g gVar3 = new g("Overdue", 2);
        Overdue = gVar3;
        g gVar4 = new g("NotPaid", 3);
        NotPaid = gVar4;
        g gVar5 = new g("PaidLessThanMin", 4);
        PaidLessThanMin = gVar5;
        g gVar6 = new g("PaidInFull", 5);
        PaidInFull = gVar6;
        g gVar7 = new g("MinPaid", 6);
        MinPaid = gVar7;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7};
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

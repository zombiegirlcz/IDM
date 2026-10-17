package zh9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o CANCELLED;
    public static final o OUTSTANDING;
    public static final o OVERDUE;
    public static final o REPAID;
    public static final o SCHEDULED;

    static {
        o oVar = new o("SCHEDULED", 0);
        SCHEDULED = oVar;
        o oVar2 = new o("OUTSTANDING", 1);
        OUTSTANDING = oVar2;
        o oVar3 = new o("OVERDUE", 2);
        OVERDUE = oVar3;
        o oVar4 = new o("CANCELLED", 3);
        CANCELLED = oVar4;
        o oVar5 = new o("REPAID", 4);
        REPAID = oVar5;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5};
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

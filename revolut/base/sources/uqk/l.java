package uqk;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l BALANCE_SHEET;
    public static final l CASH_FLOWS;
    public static final l INCOME_STATEMENT;

    static {
        l lVar = new l("INCOME_STATEMENT", 0);
        INCOME_STATEMENT = lVar;
        l lVar2 = new l("BALANCE_SHEET", 1);
        BALANCE_SHEET = lVar2;
        l lVar3 = new l("CASH_FLOWS", 2);
        CASH_FLOWS = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}

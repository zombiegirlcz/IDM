package bfl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i CASH;
    public static final i CUSTODY_FEES;
    public static final i DIVIDENDS;
    public static final i DIVIDENDS_TAX;
    public static final i TRADE;
    public static final i UNSUPPORTED;

    static {
        i iVar = new i("TRADE", 0);
        TRADE = iVar;
        i iVar2 = new i("CASH", 1);
        CASH = iVar2;
        i iVar3 = new i("DIVIDENDS", 2);
        DIVIDENDS = iVar3;
        i iVar4 = new i("DIVIDENDS_TAX", 3);
        DIVIDENDS_TAX = iVar4;
        i iVar5 = new i("CUSTODY_FEES", 4);
        CUSTODY_FEES = iVar5;
        i iVar6 = new i("UNSUPPORTED", 5);
        UNSUPPORTED = iVar6;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}

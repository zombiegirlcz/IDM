package emh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BONDS;
    public static final c ETF;
    public static final c MARGIN;
    public static final c MUTUAL_FUNDS;
    public static final c STOCKS;
    public static final c STRUCTURED_NOTES;

    static {
        c cVar = new c("BONDS", 0);
        BONDS = cVar;
        c cVar2 = new c("STOCKS", 1);
        STOCKS = cVar2;
        c cVar3 = new c("MARGIN", 2);
        MARGIN = cVar3;
        c cVar4 = new c("ETF", 3);
        ETF = cVar4;
        c cVar5 = new c("MUTUAL_FUNDS", 4);
        MUTUAL_FUNDS = cVar5;
        c cVar6 = new c("STRUCTURED_NOTES", 5);
        STRUCTURED_NOTES = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}

package sih;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BONDS;
    public static final c CFD;
    public static final c COMMODITIES;
    public static final c ETF;
    public static final c MUTUAL_FUNDS;
    public static final c PRIVATE_MARKETS;
    public static final c STOCKS;
    public static final c STRATEGIES;
    public static final c STRUCTURED_NOTES;

    static {
        c cVar = new c("STOCKS", 0);
        STOCKS = cVar;
        c cVar2 = new c("BONDS", 1);
        BONDS = cVar2;
        c cVar3 = new c("ETF", 2);
        ETF = cVar3;
        c cVar4 = new c("CFD", 3);
        CFD = cVar4;
        c cVar5 = new c("COMMODITIES", 4);
        COMMODITIES = cVar5;
        c cVar6 = new c("PRIVATE_MARKETS", 5);
        PRIVATE_MARKETS = cVar6;
        c cVar7 = new c("MUTUAL_FUNDS", 6);
        MUTUAL_FUNDS = cVar7;
        c cVar8 = new c("STRUCTURED_NOTES", 7);
        STRUCTURED_NOTES = cVar8;
        c cVar9 = new c("STRATEGIES", 8);
        STRATEGIES = cVar9;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9};
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

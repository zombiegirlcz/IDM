package cfl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p BONDS;
    public static final p CFD;
    public static final p ETF;
    public static final p MARGIN_TRADING;
    public static final p MUTUAL_FUNDS;
    public static final p OPTIONS;
    public static final p PRIVATE_BANK;
    public static final p PRIVATE_MARKETS;
    public static final p STOCK_LENDING;
    public static final p STRUCTURED_NOTES;

    static {
        p pVar = new p("BONDS", 0);
        BONDS = pVar;
        p pVar2 = new p("CFD", 1);
        CFD = pVar2;
        p pVar3 = new p("ETF", 2);
        ETF = pVar3;
        p pVar4 = new p("OPTIONS", 3);
        OPTIONS = pVar4;
        p pVar5 = new p("STOCK_LENDING", 4);
        STOCK_LENDING = pVar5;
        p pVar6 = new p("MARGIN_TRADING", 5);
        MARGIN_TRADING = pVar6;
        p pVar7 = new p("PRIVATE_MARKETS", 6);
        PRIVATE_MARKETS = pVar7;
        p pVar8 = new p("PRIVATE_BANK", 7);
        PRIVATE_BANK = pVar8;
        p pVar9 = new p("STRUCTURED_NOTES", 8);
        STRUCTURED_NOTES = pVar9;
        p pVar10 = new p("MUTUAL_FUNDS", 9);
        MUTUAL_FUNDS = pVar10;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10};
        $VALUES = pVarArr;
        $ENTRIES = vc.s.n(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}

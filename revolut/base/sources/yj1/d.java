package yj1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d BONDS;
    public static final d CFDS;
    public static final d COMMODITIES;
    public static final d ETPS;
    public static final d INVEST;
    public static final d MUTUAL_FUNDS;
    public static final d OPTIONS;
    public static final d PRIVATE_MARKETS;
    public static final d ROBO;
    public static final d STOCKS;
    public static final d STRUCTURED_NOTES;

    static {
        d dVar = new d("INVEST", 0);
        INVEST = dVar;
        d dVar2 = new d("STOCKS", 1);
        STOCKS = dVar2;
        d dVar3 = new d("ETPS", 2);
        ETPS = dVar3;
        d dVar4 = new d("BONDS", 3);
        BONDS = dVar4;
        d dVar5 = new d("MUTUAL_FUNDS", 4);
        MUTUAL_FUNDS = dVar5;
        d dVar6 = new d("COMMODITIES", 5);
        COMMODITIES = dVar6;
        d dVar7 = new d("CFDS", 6);
        CFDS = dVar7;
        d dVar8 = new d("OPTIONS", 7);
        OPTIONS = dVar8;
        d dVar9 = new d("ROBO", 8);
        ROBO = dVar9;
        d dVar10 = new d("PRIVATE_MARKETS", 9);
        PRIVATE_MARKETS = dVar10;
        d dVar11 = new d("STRUCTURED_NOTES", 10);
        STRUCTURED_NOTES = dVar11;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}

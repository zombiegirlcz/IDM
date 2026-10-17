package yfl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BONDS;
    public static final a CFD;
    public static final a COMMODITIES;
    public static final a ETFS;
    public static final a JOINT_STOCKS;
    public static final a MUTUAL_FUNDS;
    public static final a PRIVATE_MARKETS;
    public static final a STOCKS;
    public static final a STRATEGIES;
    public static final a STRUCTURED_NOTES;
    public static final a TAX_ADVANTAGE_ACCOUNTS;
    private final int priority;

    static {
        a aVar = new a("TAX_ADVANTAGE_ACCOUNTS", 0, 0);
        TAX_ADVANTAGE_ACCOUNTS = aVar;
        a aVar2 = new a("JOINT_STOCKS", 1, 1);
        JOINT_STOCKS = aVar2;
        a aVar3 = new a("STRATEGIES", 2, 2);
        STRATEGIES = aVar3;
        a aVar4 = new a("STOCKS", 3, 3);
        STOCKS = aVar4;
        a aVar5 = new a("ETFS", 4, 4);
        ETFS = aVar5;
        a aVar6 = new a("BONDS", 5, 5);
        BONDS = aVar6;
        a aVar7 = new a("COMMODITIES", 6, 6);
        COMMODITIES = aVar7;
        a aVar8 = new a("CFD", 7, 7);
        CFD = aVar8;
        a aVar9 = new a("MUTUAL_FUNDS", 8, 8);
        MUTUAL_FUNDS = aVar9;
        a aVar10 = new a("PRIVATE_MARKETS", 9, 9);
        PRIVATE_MARKETS = aVar10;
        a aVar11 = new a("STRUCTURED_NOTES", 10, 10);
        STRUCTURED_NOTES = aVar11;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, int i2) {
        this.priority = i2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int a() {
        return this.priority;
    }
}

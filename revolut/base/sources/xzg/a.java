package xzg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ADR;
    public static final a BOND;
    public static final a CFD;
    public static final a EQUITY;
    public static final a ETF;
    public static final a SPAC;
    public static final a WARRANT;

    static {
        a aVar = new a("BOND", 0);
        BOND = aVar;
        a aVar2 = new a("ETF", 1);
        ETF = aVar2;
        a aVar3 = new a("ADR", 2);
        ADR = aVar3;
        a aVar4 = new a("EQUITY", 3);
        EQUITY = aVar4;
        a aVar5 = new a("WARRANT", 4);
        WARRANT = aVar5;
        a aVar6 = new a("SPAC", 5);
        SPAC = aVar6;
        a aVar7 = new a("CFD", 6);
        CFD = aVar7;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}

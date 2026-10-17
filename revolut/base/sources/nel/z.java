package nel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z ADR;
    public static final z BOND;
    public static final z CFD;
    public static final z COMMODITY;
    public static final z EQUITY;
    public static final z ETC;
    public static final z ETF;
    public static final z ETN;
    public static final z FUND;
    public static final z MUTUAL_FUND;
    public static final z OPTION;
    public static final z SPAC;
    public static final z STRUCTURED_NOTE;
    public static final z UNSPECIFIED;
    public static final z WARRANT;

    static {
        z zVar = new z("ADR", 0);
        ADR = zVar;
        z zVar2 = new z("ETF", 1);
        ETF = zVar2;
        z zVar3 = new z("ETC", 2);
        ETC = zVar3;
        z zVar4 = new z("ETN", 3);
        ETN = zVar4;
        z zVar5 = new z("EQUITY", 4);
        EQUITY = zVar5;
        z zVar6 = new z("WARRANT", 5);
        WARRANT = zVar6;
        z zVar7 = new z("SPAC", 6);
        SPAC = zVar7;
        z zVar8 = new z("CFD", 7);
        CFD = zVar8;
        z zVar9 = new z("BOND", 8);
        BOND = zVar9;
        z zVar10 = new z("COMMODITY", 9);
        COMMODITY = zVar10;
        z zVar11 = new z("FUND", 10);
        FUND = zVar11;
        z zVar12 = new z("MUTUAL_FUND", 11);
        MUTUAL_FUND = zVar12;
        z zVar13 = new z("STRUCTURED_NOTE", 12);
        STRUCTURED_NOTE = zVar13;
        z zVar14 = new z("OPTION", 13);
        OPTION = zVar14;
        z zVar15 = new z("UNSPECIFIED", 14);
        UNSPECIFIED = zVar15;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7, zVar8, zVar9, zVar10, zVar11, zVar12, zVar13, zVar14, zVar15};
        $VALUES = zVarArr;
        $ENTRIES = vc.s.n(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}

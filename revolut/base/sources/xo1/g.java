package xo1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g BANKGIROT;
    public static final g BOLETO;
    public static final g BPAY;
    public static final g DIAS_REFERENCE;
    public static final g F24;
    public static final g GIRO_HU_DIRECT_DEBIT;
    public static final g MASAV_IL_DIRECT_DEBIT;
    public static final g MBREF;
    public static final g NZ_BILLS;
    public static final g POSTAL_CHECK;
    public static final g TAPI;
    public static final g TAPI_CO;
    public static final g UAE_BILLS;

    static {
        g gVar = new g("BANKGIROT", 0);
        BANKGIROT = gVar;
        g gVar2 = new g("BOLETO", 1);
        BOLETO = gVar2;
        g gVar3 = new g("BPAY", 2);
        BPAY = gVar3;
        g gVar4 = new g("DIAS_REFERENCE", 3);
        DIAS_REFERENCE = gVar4;
        g gVar5 = new g("F24", 4);
        F24 = gVar5;
        g gVar6 = new g("GIRO_HU_DIRECT_DEBIT", 5);
        GIRO_HU_DIRECT_DEBIT = gVar6;
        g gVar7 = new g("MASAV_IL_DIRECT_DEBIT", 6);
        MASAV_IL_DIRECT_DEBIT = gVar7;
        g gVar8 = new g("MBREF", 7);
        MBREF = gVar8;
        g gVar9 = new g("NZ_BILLS", 8);
        NZ_BILLS = gVar9;
        g gVar10 = new g("POSTAL_CHECK", 9);
        POSTAL_CHECK = gVar10;
        g gVar11 = new g("TAPI", 10);
        TAPI = gVar11;
        g gVar12 = new g("TAPI_CO", 11);
        TAPI_CO = gVar12;
        g gVar13 = new g("UAE_BILLS", 12);
        UAE_BILLS = gVar13;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar13};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}

package cel;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DIV_YLD_ANN;
    public static final a DIV_YLD_CONTRIBUTION_ANN;
    public static final a DPS_ANN_CALENDARISED;
    public static final a EPS_ANN;
    public static final a EPS_ANN_CALENDARISED;
    public static final a EPS_ANN_GROWTH;
    public static final a EPS_ANN_GROWTH_CALENDARISED;
    public static final a EPS_GROWTH_CONTRIBUTION_ANN;
    public static final a EPS_QTR;
    public static final a EPS_QTR_GROWTH;
    public static final a EPS_SURPRISE_BASIS_ANN;
    public static final a EPS_SURPRISE_BASIS_QTR;
    public static final a NET_INCOME_ANN;
    public static final a NET_INCOME_QTR;
    public static final a PE_RATIO_ANN;
    public static final a PE_RATIO_CONTRIBUTION_ANN;
    public static final a PROFIT_MARGIN_ANN;
    public static final a PROFIT_MARGIN_QTR;
    public static final a SALES_ANN;
    public static final a SALES_ANN_GROWTH;
    public static final a SALES_QTR;
    public static final a SALES_QTR_GROWTH;

    static {
        a aVar = new a("EPS_ANN_GROWTH", 0);
        EPS_ANN_GROWTH = aVar;
        a aVar2 = new a("EPS_QTR_GROWTH", 1);
        EPS_QTR_GROWTH = aVar2;
        a aVar3 = new a("EPS_ANN_CALENDARISED", 2);
        EPS_ANN_CALENDARISED = aVar3;
        a aVar4 = new a("EPS_ANN_GROWTH_CALENDARISED", 3);
        EPS_ANN_GROWTH_CALENDARISED = aVar4;
        a aVar5 = new a("EPS_GROWTH_CONTRIBUTION_ANN", 4);
        EPS_GROWTH_CONTRIBUTION_ANN = aVar5;
        a aVar6 = new a("PE_RATIO_ANN", 5);
        PE_RATIO_ANN = aVar6;
        a aVar7 = new a("PE_RATIO_CONTRIBUTION_ANN", 6);
        PE_RATIO_CONTRIBUTION_ANN = aVar7;
        a aVar8 = new a("DIV_YLD_ANN", 7);
        DIV_YLD_ANN = aVar8;
        a aVar9 = new a("DIV_YLD_CONTRIBUTION_ANN", 8);
        DIV_YLD_CONTRIBUTION_ANN = aVar9;
        a aVar10 = new a("DPS_ANN_CALENDARISED", 9);
        DPS_ANN_CALENDARISED = aVar10;
        a aVar11 = new a("SALES_ANN", 10);
        SALES_ANN = aVar11;
        a aVar12 = new a("NET_INCOME_ANN", 11);
        NET_INCOME_ANN = aVar12;
        a aVar13 = new a("PROFIT_MARGIN_ANN", 12);
        PROFIT_MARGIN_ANN = aVar13;
        a aVar14 = new a("SALES_ANN_GROWTH", 13);
        SALES_ANN_GROWTH = aVar14;
        a aVar15 = new a("SALES_QTR", 14);
        SALES_QTR = aVar15;
        a aVar16 = new a("NET_INCOME_QTR", 15);
        NET_INCOME_QTR = aVar16;
        a aVar17 = new a("PROFIT_MARGIN_QTR", 16);
        PROFIT_MARGIN_QTR = aVar17;
        a aVar18 = new a("SALES_QTR_GROWTH", 17);
        SALES_QTR_GROWTH = aVar18;
        a aVar19 = new a("EPS_SURPRISE_BASIS_ANN", 18);
        EPS_SURPRISE_BASIS_ANN = aVar19;
        a aVar20 = new a("EPS_ANN", 19);
        EPS_ANN = aVar20;
        a aVar21 = new a("EPS_SURPRISE_BASIS_QTR", 20);
        EPS_SURPRISE_BASIS_QTR = aVar21;
        a aVar22 = new a("EPS_QTR", 21);
        EPS_QTR = aVar22;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}

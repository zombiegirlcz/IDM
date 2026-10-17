package krk;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import kr.h2;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final a Companion;
    public static final b DIV_YLD_ANN;
    public static final b DIV_YLD_CONTRIBUTION_ANN;
    public static final b DPS_ANN_CALENDARISED;
    public static final b EPS_ANN;
    public static final b EPS_ANN_CALENDARISED;
    public static final b EPS_ANN_GROWTH;
    public static final b EPS_ANN_GROWTH_CALENDARISED;
    public static final b EPS_GROWTH_CONTRIBUTION_ANN;
    public static final b EPS_QTR;
    public static final b EPS_QTR_GROWTH;
    public static final b EPS_SURPRISE_BASIS_ANN;
    public static final b EPS_SURPRISE_BASIS_QTR;
    public static final b NET_INCOME_ANN;
    public static final b NET_INCOME_QTR;
    public static final b PE_RATIO_ANN;
    public static final b PE_RATIO_CONTRIBUTION_ANN;
    public static final b PROFIT_MARGIN_ANN;
    public static final b PROFIT_MARGIN_QTR;
    public static final b SALES_ANN;
    public static final b SALES_ANN_GROWTH;
    public static final b SALES_QTR;
    public static final b SALES_QTR_GROWTH;

    static {
        b bVar = new b("EPS_ANN_GROWTH", 0);
        EPS_ANN_GROWTH = bVar;
        b bVar2 = new b("EPS_ANN_CALENDARISED", 1);
        EPS_ANN_CALENDARISED = bVar2;
        b bVar3 = new b("EPS_ANN_GROWTH_CALENDARISED", 2);
        EPS_ANN_GROWTH_CALENDARISED = bVar3;
        b bVar4 = new b("EPS_QTR_GROWTH", 3);
        EPS_QTR_GROWTH = bVar4;
        b bVar5 = new b("EPS_GROWTH_CONTRIBUTION_ANN", 4);
        EPS_GROWTH_CONTRIBUTION_ANN = bVar5;
        b bVar6 = new b("PE_RATIO_ANN", 5);
        PE_RATIO_ANN = bVar6;
        b bVar7 = new b("PE_RATIO_CONTRIBUTION_ANN", 6);
        PE_RATIO_CONTRIBUTION_ANN = bVar7;
        b bVar8 = new b("DIV_YLD_ANN", 7);
        DIV_YLD_ANN = bVar8;
        b bVar9 = new b("DIV_YLD_CONTRIBUTION_ANN", 8);
        DIV_YLD_CONTRIBUTION_ANN = bVar9;
        b bVar10 = new b("DPS_ANN_CALENDARISED", 9);
        DPS_ANN_CALENDARISED = bVar10;
        b bVar11 = new b("SALES_ANN", 10);
        SALES_ANN = bVar11;
        b bVar12 = new b("NET_INCOME_ANN", 11);
        NET_INCOME_ANN = bVar12;
        b bVar13 = new b("PROFIT_MARGIN_ANN", 12);
        PROFIT_MARGIN_ANN = bVar13;
        b bVar14 = new b("SALES_ANN_GROWTH", 13);
        SALES_ANN_GROWTH = bVar14;
        b bVar15 = new b("SALES_QTR", 14);
        SALES_QTR = bVar15;
        b bVar16 = new b("NET_INCOME_QTR", 15);
        NET_INCOME_QTR = bVar16;
        b bVar17 = new b("PROFIT_MARGIN_QTR", 16);
        PROFIT_MARGIN_QTR = bVar17;
        b bVar18 = new b("SALES_QTR_GROWTH", 17);
        SALES_QTR_GROWTH = bVar18;
        b bVar19 = new b("EPS_SURPRISE_BASIS_ANN", 18);
        EPS_SURPRISE_BASIS_ANN = bVar19;
        b bVar20 = new b("EPS_ANN", 19);
        EPS_ANN = bVar20;
        b bVar21 = new b("EPS_SURPRISE_BASIS_QTR", 20);
        EPS_SURPRISE_BASIS_QTR = bVar21;
        b bVar22 = new b("EPS_QTR", 21);
        EPS_QTR = bVar22;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
        Companion = new a();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new h2(5));
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}

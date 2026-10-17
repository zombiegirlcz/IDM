package yoc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f AVERAGE_ANNUAL_RETURN;
    public static final f AVERAGE_DRAWDOWN;
    public static final f BEST_YEAR_RETURN;
    public static final f BETA;
    public static final f CAGR;
    public static final f DIVIDEND_YIELD;
    public static final f MAX_DRAWDOWN;
    public static final f MEDIAN_RETURN;
    public static final f SHARPE_RATIO;
    public static final f STANDARD_DEVIATION;
    public static final f VA_R;

    static {
        f fVar = new f("AVERAGE_ANNUAL_RETURN", 0);
        AVERAGE_ANNUAL_RETURN = fVar;
        f fVar2 = new f("STANDARD_DEVIATION", 1);
        STANDARD_DEVIATION = fVar2;
        f fVar3 = new f("MEDIAN_RETURN", 2);
        MEDIAN_RETURN = fVar3;
        f fVar4 = new f("BEST_YEAR_RETURN", 3);
        BEST_YEAR_RETURN = fVar4;
        f fVar5 = new f("MAX_DRAWDOWN", 4);
        MAX_DRAWDOWN = fVar5;
        f fVar6 = new f("AVERAGE_DRAWDOWN", 5);
        AVERAGE_DRAWDOWN = fVar6;
        f fVar7 = new f("BETA", 6);
        BETA = fVar7;
        f fVar8 = new f("SHARPE_RATIO", 7);
        SHARPE_RATIO = fVar8;
        f fVar9 = new f("VA_R", 8);
        VA_R = fVar9;
        f fVar10 = new f("DIVIDEND_YIELD", 9);
        DIVIDEND_YIELD = fVar10;
        f fVar11 = new f("CAGR", 10);
        CAGR = fVar11;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}

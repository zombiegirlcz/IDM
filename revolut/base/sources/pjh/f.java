package pjh;

import com.revolut.feature.wealth.ui.impl.R$string;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f Bonds;
    public static final f ETPs;
    public static final f Other;
    public static final f Stocks;
    public static final f Strategies;
    public static final f StructuredNotes;
    private final Integer titleResId;

    static {
        f fVar = new f(0, "Stocks", Integer.valueOf(R$string.wealth_invest_home_portfolio_group_by_products_section_stocks));
        Stocks = fVar;
        f fVar2 = new f(1, "Strategies", Integer.valueOf(R$string.wealth_invest_home_portfolio_strategies_header_title));
        Strategies = fVar2;
        f fVar3 = new f(2, "ETPs", Integer.valueOf(R$string.wealth_invest_home_portfolio_group_by_products_section_etps));
        ETPs = fVar3;
        f fVar4 = new f(3, "Bonds", Integer.valueOf(R$string.wealth_invest_home_portfolio_group_by_products_section_bonds));
        Bonds = fVar4;
        f fVar5 = new f(4, "StructuredNotes", Integer.valueOf(R$string.wealth_invest_home_portfolio_group_by_products_section_structured_notes));
        StructuredNotes = fVar5;
        f fVar6 = new f(5, "Other", null);
        Other = fVar6;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public f(int i, String str, Integer num) {
        this.titleResId = num;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final Integer b() {
        return this.titleResId;
    }
}

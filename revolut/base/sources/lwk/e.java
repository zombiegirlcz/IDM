package lwk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements iwk.g {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200465a;

    public e(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200465a = labelFormatter;
    }

    @Override // iwk.g
    public final List c(afl.q stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.j jVar = stats.d;
        if (jVar == null) {
            return zhm.f0.f322471a;
        }
        dj0.d dVar = jVar.f4604a;
        Double d = jVar.f4605b;
        o7.d dVar2 = this.f200465a;
        CellDetailsDelegate.Model[] elements = {dVar != null ? new CellDetailsDelegate.Model("STATS_DIVIDENDS_INCOME", new TextLocalisedClause(R$string.wealth_details_section_stats_glossary_income_dividend_title, null, null, 14), dVar2.v(dVar), 0, null, null, null, null, null, false, 0, 0, 32760) : null, d != null ? new CellDetailsDelegate.Model("STATS_DIVIDENDS_YIELD", new TextLocalisedClause(R$string.wealth_details_section_stats_dividend_yield, null, null, 14), ((x3h.a) dVar2.f222642b).a(d.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        iwk.g.d(listL);
        return listL;
    }
}

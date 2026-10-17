package lwk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 implements iwk.g {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200469a;

    public g0(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200469a = labelFormatter;
    }

    @Override // iwk.g
    public final List b(afl.f stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.e eVar = stats.d;
        BigDecimal bigDecimal = eVar.f4588a;
        o7.d dVar = this.f200469a;
        CellDetailsDelegate.Model model = bigDecimal != null ? new CellDetailsDelegate.Model("STATS_YIELD_RANGE_DAILY_OPEN_PRICE", new TextLocalisedClause(R$string.trading_bonds_stats_dictionary_yield_range_open, null, null, 14), dVar.s(bigDecimal), 0, null, null, null, null, null, false, 0, 0, 32760) : null;
        afl.h hVar = eVar.f4589b;
        CellDetailsDelegate.Model model2 = hVar != null ? new CellDetailsDelegate.Model("STATS_YIELD_RANGE_DAY_RANGE", new TextLocalisedClause(R$string.trading_bonds_stats_dictionary_yield_range_dayRange, null, null, 14), dVar.q(hVar), 0, null, null, null, null, null, false, 0, 0, 32760) : null;
        afl.h hVar2 = eVar.f4590c;
        CellDetailsDelegate.Model[] elements = {model, model2, hVar2 != null ? new CellDetailsDelegate.Model("STATS_YIELD_RANGE_FIFTY_TWO_WEEK_RANGE", new TextLocalisedClause(R$string.trading_bonds_stats_dictionary_yield_range_fiftyTwoWeekRange, null, null, 14), dVar.q(hVar2), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List list = (List) ue0.e.M(kotlin.collections.d.L(elements));
        if (list == null) {
            return zhm.f0.f322471a;
        }
        iwk.g.d(list);
        return list;
    }
}

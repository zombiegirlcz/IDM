package lwk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class t implements iwk.g {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200477a;

    public t(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200477a = labelFormatter;
    }

    @Override // iwk.g
    public final List b(afl.f stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.b bVar = stats.f4593b;
        ej0.b bVar2 = bVar.f4576a;
        o7.d dVar = this.f200477a;
        CellDetailsDelegate.Model model = bVar2 != null ? new CellDetailsDelegate.Model("STATS_PRICE_RANGE_DAILY_OPEN_PRICE", new TextLocalisedClause(R$string.trading_bonds_stats_dictionary_price_range_open, null, null, 14), dVar.t(bVar2), 0, null, null, null, null, null, false, 0, 0, 32760) : null;
        afl.g gVar = bVar.f4577b;
        CellDetailsDelegate.Model model2 = gVar != null ? new CellDetailsDelegate.Model("STATS_PRICE_RANGE_DAY_RANGE", new TextLocalisedClause(R$string.trading_bonds_stats_dictionary_price_range_dayRange, null, null, 14), dVar.u(gVar), 0, null, null, null, null, null, false, 0, 0, 32760) : null;
        afl.g gVar2 = bVar.f4578c;
        CellDetailsDelegate.Model[] elements = {model, model2, gVar2 != null ? new CellDetailsDelegate.Model("STATS_PRICE_RANGE_FIFTY_TWO_WEEK_RANGE", new TextLocalisedClause(R$string.trading_bonds_stats_dictionary_price_range_fiftyTwoWeekRange, null, null, 14), dVar.u(gVar2), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List list = (List) ue0.e.M(kotlin.collections.d.L(elements));
        if (list == null) {
            return zhm.f0.f322471a;
        }
        iwk.g.d(list);
        return list;
    }
}

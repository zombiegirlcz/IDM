package lwk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 implements iwk.g {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200471a;

    public i0(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200471a = labelFormatter;
    }

    @Override // iwk.g
    public final List b(afl.f stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.c cVar = stats.f4594c;
        BigDecimal bigDecimal = cVar.d;
        o7.d dVar = this.f200471a;
        CellDetailsDelegate.Model model = bigDecimal != null ? new CellDetailsDelegate.Model("STATS_YIELD_CURRENT_YIELD", new TextLocalisedClause(R$string.trading_bonds_stats_dictionary_yield_currentYield, null, null, 14), dVar.s(bigDecimal), 0, null, null, null, null, null, false, 0, 0, 32760) : null;
        BigDecimal bigDecimal2 = cVar.e;
        CellDetailsDelegate.Model[] elements = {model, bigDecimal2 != null ? new CellDetailsDelegate.Model("STATS_YIELD_YIELD_TO_MATURITY", new TextLocalisedClause(R$string.trading_bonds_stats_dictionary_yield_yieldToMaturity, null, null, 14), dVar.s(bigDecimal2), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List list = (List) ue0.e.M(kotlin.collections.d.L(elements));
        if (list == null) {
            return zhm.f0.f322471a;
        }
        iwk.g.d(list);
        return list;
    }
}

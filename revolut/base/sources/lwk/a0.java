package lwk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 implements iwk.g {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200461a;

    public a0(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200461a = labelFormatter;
    }

    @Override // iwk.g
    public final List b(afl.f stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.d dVar = stats.e;
        BigDecimal bigDecimal = dVar.f4584a;
        o7.d dVar2 = this.f200461a;
        CellDetailsDelegate.Model model = bigDecimal != null ? new CellDetailsDelegate.Model("STATS_RISK_MACAULAY_DURATION", new TextLocalisedClause(R$string.trading_bonds_stats_dictionary_risk_macaulayDuration, null, null, 14), dVar2.w(bigDecimal), 0, null, null, null, null, null, false, 0, 0, 32760) : null;
        BigDecimal bigDecimal2 = dVar.f4585b;
        CellDetailsDelegate.Model model2 = bigDecimal2 != null ? new CellDetailsDelegate.Model("STATS_RISK_MODIFIED_DURATION", new TextLocalisedClause(R$string.trading_bonds_stats_dictionary_risk_modifiedDuration, null, null, 14), dVar2.w(bigDecimal2), 0, null, null, null, null, null, false, 0, 0, 32760) : null;
        BigDecimal bigDecimal3 = dVar.f4586c;
        CellDetailsDelegate.Model[] elements = {model, model2, bigDecimal3 != null ? new CellDetailsDelegate.Model("STATS_RISK_CONVEXITY", new TextLocalisedClause(R$string.trading_bonds_stats_dictionary_risk_convexity, null, null, 14), dVar2.w(bigDecimal3), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List list = (List) ue0.e.M(kotlin.collections.d.L(elements));
        if (list == null) {
            return zhm.f0.f322471a;
        }
        iwk.g.d(list);
        return list;
    }
}

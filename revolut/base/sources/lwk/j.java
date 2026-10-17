package lwk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements iwk.g {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200472a;

    public j(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200472a = labelFormatter;
    }

    @Override // iwk.g
    public final List c(afl.q stats) {
        x3h.a aVar = (x3h.a) this.f200472a.f222642b;
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.k kVar = stats.e;
        if (kVar == null) {
            return zhm.f0.f322471a;
        }
        Double d = kVar.f4607a;
        Double d5 = kVar.f4608b;
        CellDetailsDelegate.Model[] elements = {d != null ? new CellDetailsDelegate.Model("EXPENSE_RATIOS_GROSS", new TextLocalisedClause(R$string.wealth_details_section_stats_glossary_gross_expense_ratio_title, null, null, 14), aVar.a(d.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null, d5 != null ? new CellDetailsDelegate.Model("EXPENSE_RATIOS_NET", new TextLocalisedClause(R$string.wealth_details_section_stats_glossary_net_expense_ratio_title, null, null, 14), aVar.a(d5.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        iwk.g.d(listL);
        return listL;
    }
}

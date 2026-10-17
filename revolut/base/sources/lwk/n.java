package lwk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements iwk.g {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200474a;

    public n(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200474a = labelFormatter;
    }

    @Override // iwk.g
    public final List c(afl.q stats) {
        x3h.a aVar = (x3h.a) this.f200474a.f222642b;
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.l lVar = stats.f;
        if (lVar == null) {
            return zhm.f0.f322471a;
        }
        Double d = lVar.f4611a;
        Double d5 = lVar.f4612b;
        CellDetailsDelegate.Model[] elements = {d != null ? new CellDetailsDelegate.Model("MANAGEMENT_FEES_GROSS", new TextLocalisedClause(R$string.wealth_details_section_stats_glossary_gross_management_fee_title, null, null, 14), aVar.a(d.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null, d5 != null ? new CellDetailsDelegate.Model("MANAGEMENT_FEES_NET", new TextLocalisedClause(R$string.wealth_details_section_stats_glossary_net_management_fee_title, null, null, 14), aVar.a(d5.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        iwk.g.d(listL);
        return listL;
    }
}

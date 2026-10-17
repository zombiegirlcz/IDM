package zph;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilter$Options;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerOption;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import ip0.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r {
    public r(q screenerFilterOptionsChipsMapper) {
        Intrinsics.checkNotNullParameter(screenerFilterOptionsChipsMapper, "screenerFilterOptionsChipsMapper");
    }

    public final z a(ScreenerFilter$Options filter, List unsavedFilters) {
        Object next;
        ActionsView.Item item;
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(unsavedFilters, "unsavedFilters");
        Iterator it8 = unsavedFilters.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((ScreenerSelectedFilter) next).getF105167a() == filter.f96154a) {
                break;
            }
        }
        ScreenerSelectedFilter.Options options = next instanceof ScreenerSelectedFilter.Options ? (ScreenerSelectedFilter.Options) next : null;
        ArrayList<ScreenerOption> arrayList = filter.e;
        zel.g metric = filter.f96154a;
        ArrayList arrayList2 = new ArrayList();
        for (ScreenerOption value : arrayList) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            Intrinsics.checkNotNullParameter(metric, "metric");
            Intrinsics.checkNotNullParameter(value, "value");
            boolean z = (options != null ? options.f105166b : null) != null && options.f105166b.contains(value.getF96152a());
            Clause clause = (Clause) filter.f.get(value);
            if (clause == null) {
                item = null;
            } else {
                Map map = filter.f96157g;
                item = new ActionsView.Item("options_chip_" + metric + "_" + value, z ? mx0.d.ACCENT : mx0.d.SEMIACCENT, false, null, null, clause, map != null ? (Image) map.get(value) : null, null, null, null, false, null, null, new yph.i(metric, value.getF96152a()), null, 23452);
            }
            if (item != null) {
                arrayList2.add(item);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        String str = "options_" + metric;
        mx0.l lVar = mx0.l.FLEXBOX;
        int i = R$attr.uikit_dp0;
        return new z(str, arrayList2, null, lVar, i, i, 68);
    }
}

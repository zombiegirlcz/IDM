package zph;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilter$Options;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerOption;
import ip0.qd0;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t {
    public static SelectableDelegate.Model a(ScreenerOption value, ScreenerFilter$Options filter, Set selectedOptions) throws Throwable {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        zel.g gVar = filter.f96154a;
        Clause clause = (Clause) filter.f.get(value);
        if (clause == null) {
            hx7.e.n(new IllegalStateException("There is no title for Screener option " + value));
            return null;
        }
        String str = "option_" + gVar + "_" + value.getF96152a();
        String str2 = "option_row_" + gVar + "_" + value.getF96152a();
        Map map = filter.f96157g;
        return new SelectableDelegate.Model(str, new RowDelegate.Model(str2, map != null ? (Image) map.get(value) : null, null, null, clause, null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741804), selectedOptions.contains(value.getF96152a()) ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, new yph.i(filter.f96154a, value.getF96152a()), null, false, 32504);
    }
}

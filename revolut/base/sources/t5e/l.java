package t5e;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.data.model.Data;
import com.revolut.feature.structured_note.details.impl.R$string;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.PerformanceTrackerFlowContract$Page;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f268056a;
        e eVar = data != null ? (e) iii.c.f(data, new t3b.g(24), new j(0), new sr8.a(7)) : null;
        List<PerformanceTrackerFlowContract$Page> list = domainState.f268057b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (PerformanceTrackerFlowContract$Page performanceTrackerFlowContract$Page : list) {
            String f103057c = performanceTrackerFlowContract$Page.getF94249a();
            int i2 = k.f268070a[performanceTrackerFlowContract$Page.ordinal()];
            if (i2 == 1) {
                i = R$string.trading_structured_notes_performance_tracker_underlying_assets_segment;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.trading_structured_notes_performance_tracker_terms_segment;
            }
            arrayList.add(new FixedTabs.Item(f103057c, new TextLocalisedClause(i, null, null, 14), (AnalyticsContext) null, 12));
        }
        return new f(eVar, arrayList, domainState.f268058c);
    }
}

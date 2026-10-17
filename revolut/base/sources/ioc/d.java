package ioc;

import aw0.cb;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import foc.h;
import hoc.f;
import hw0.x;
import hw0.z;
import hx7.e;
import ip0.vj0;
import java.util.List;
import jo0.g;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f163219a;

    public d(b commonPerformanceChartMapper) {
        Intrinsics.checkNotNullParameter(commonPerformanceChartMapper, "commonPerformanceChartMapper");
        this.f163219a = commonPerformanceChartMapper;
    }

    @Override // foc.h
    public final x c(hoc.d dVar) {
        hoc.b chart = (hoc.b) dVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        return b.b(chart);
    }

    @Override // foc.h
    public final Clause f(hoc.d dVar, hoc.h hVar) throws Throwable {
        hoc.b chart = (hoc.b) dVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        dj0.d dVar2 = chart.f154268b;
        if (dVar2 != null) {
            return new MoneyClause(dVar2, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12);
        }
        e.n(new IllegalStateException("Portfolio balance is null but simulated performance chart is shown"));
        Intrinsics.checkNotNullParameter(chart, "chart");
        return b.c((f) d0.m0(chart.a()));
    }

    @Override // foc.h
    public final vj0 g(hoc.d dVar, eoc.e chartSettingsState, hoc.h hVar) {
        hoc.b chart = (hoc.b) dVar;
        f fVar = (f) hVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(chartSettingsState, "chartSettingsState");
        if (fVar == null) {
            fVar = (f) d0.m0(chart.a());
        }
        CompositeClause compositeClauseC = b.c(fVar);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_wealth, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246);
        CompositeClause compositeClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.wealth_robo_portfolio_simulated_past_performance_title, null, null, 14), new DotDividerClause((Integer) null), compositeClauseC), null, null, null, 14);
        int i = R$attr.uikit_colorGreyTone20;
        return new vj0("total-value-chart-tag", new TagViewData(resourceImage, compositeClause, new Color.Solid(i), i, null, 1000), false, null, 0, 0, 0, 0, 508);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // foc.h
    public final cb j(hoc.d dVar) {
        hoc.b chart = (hoc.b) dVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        cb.Companion.getClass();
        return ((Boolean) g.F.getValue()).booleanValue() ? cb.f10267l : cb.f10265h;
    }

    @Override // foc.h
    public final Clause l(hoc.d dVar, pdh.c selectedTimeSpan, hoc.h hVar) {
        hoc.b chart = (hoc.b) dVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(selectedTimeSpan, "selectedTimeSpan");
        return this.f163219a.a(chart, selectedTimeSpan, (f) hVar);
    }

    @Override // foc.h
    public final List p(hoc.d dVar) {
        hoc.b chart = (hoc.b) dVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        return u.c(pdh.c.FIVE_YEARS);
    }

    @Override // foc.h
    public final z q(hoc.d dVar) {
        hoc.b chart = (hoc.b) dVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        return b.d(chart);
    }
}

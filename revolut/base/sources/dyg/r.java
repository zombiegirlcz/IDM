package dyg;

import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.R$string;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uyg.h f121126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fyg.a f121127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pyg.i f121128c;
    public final gte.a d;

    public r(uyg.h allocationsMapper, uyg.k categoryTabsMapper, fyg.a barChartMapper, pyg.i analyticsDisclaimersMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(allocationsMapper, "allocationsMapper");
        Intrinsics.checkNotNullParameter(categoryTabsMapper, "categoryTabsMapper");
        Intrinsics.checkNotNullParameter(barChartMapper, "barChartMapper");
        Intrinsics.checkNotNullParameter(analyticsDisclaimersMapper, "analyticsDisclaimersMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f121126a = allocationsMapper;
        this.f121127b = barChartMapper;
        this.f121128c = analyticsDisclaimersMapper;
        this.d = featureToggleInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        TabsDelegate.Model modelA;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.e;
        vyg.a aVar = domainState.d;
        List list = domainState.f121113h;
        i iVar = (i) iii.c.f(data, new dwi.f(this, 27), new dt4.p(13, domainState, this), new dbg.b(this, domainState, 15));
        aim.e eVarB = u.b();
        Data data2 = domainState.e;
        xi0.b baseCurrency = domainState.f;
        fyg.g gVar = (fyg.g) this.f121127b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(data2, "data");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        eVarB.addAll((List) iii.c.f(data2, new fpk.b(gVar, baseCurrency, 22), new fv1.a(gVar, 8), new fyg.b(gVar, baseCurrency, 0)));
        if (data2.getContent() != null || data2.getError() == null) {
            WealthAnalyticsApi$Toggles.AnalyticsUiImprovements analyticsUiImprovements = WealthAnalyticsApi$Toggles.AnalyticsUiImprovements.f94964c;
            gte.a aVar2 = this.d;
            if (((jte.d) aVar2).c(analyticsUiImprovements) && (modelA = uyg.k.a("ALLOCATION_CATEGORIES_LIST_ID", list, aVar)) != null) {
                eVarB.add(modelA);
            }
            WidgetisedAnalyticsType widgetisedAnalyticsType = domainState.f121109a;
            Data data3 = domainState.e;
            int i2 = q.f121125a[aVar.ordinal()];
            if (i2 == 1) {
                i = R$string.wealth_analytics_widgetised_allocation_allocation_by_asset_title;
            } else if (i2 == 2) {
                i = R$string.wealth_analytics_widgetised_allocation_allocation_by_sector_title;
            } else if (i2 == 3) {
                i = R$string.wealth_analytics_widgetised_allocation_allocation_by_positions_title;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.wealth_analytics_widgetised_allocation_allocation_by_product_title;
            }
            eVarB.addAll(this.f121126a.d(widgetisedAnalyticsType, data3, (!((jte.d) aVar2).c(analyticsUiImprovements) || list.size() <= 1) ? new TextLocalisedClause(i, null, null, 14) : null, !((jte.d) aVar2).c(analyticsUiImprovements) && list.size() > 1, uyg.g.ALLOCATION, new dug.a(domainState, 16)));
        }
        eVarB.addAll(this.f121128c.f(domainState.f121109a, domainState.f121110b, domainState.f121111c, domainState.i));
        return new k(u.a(eVarB), iVar);
    }
}

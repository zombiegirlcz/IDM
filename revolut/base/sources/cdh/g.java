package cdh;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.widgets.AvatarGridWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import op0.c2;
import xzg.n0;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f23250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f23252c;

    public g(j jVar, String str, n0 n0Var) {
        this.f23250a = jVar;
        this.f23251b = str;
        this.f23252c = n0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List performanceAssets = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(performanceAssets, "gainersLosers");
        j jVar = this.f23250a;
        c cVar = jVar.d;
        w0h.f widgetDataProvider = jVar.f23258b;
        String listId = this.f23251b;
        Intrinsics.checkNotNullParameter(listId, "listId");
        n0 filter = this.f23252c;
        Intrinsics.checkNotNullParameter(filter, "topMoversFilter");
        Intrinsics.checkNotNullParameter(performanceAssets, "performanceAssets");
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        List listK = v.k(new FixedTabs.Item("top_movers.tab_top_gainers", new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_moverType_topGainers, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("top_movers.tab_top_losers", new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_moverType_topLosers, null, null, 14), (AnalyticsContext) null, 12));
        Intrinsics.checkNotNullParameter(filter, "filter");
        c2 c2Var = new c2(listK, b.f23242a[filter.ordinal()] == 1 ? "top_movers.tab_top_losers" : "top_movers.tab_top_gainers");
        AvatarGridWidgetDelegate.Model.Companion companion = AvatarGridWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause textLocalisedClauseE = widgetDataProvider.e();
        List listV0 = d0.V0(performanceAssets, 8);
        ArrayList arrayList = new ArrayList(w.t(listV0, 10));
        int i = 0;
        for (Object obj5 : listV0) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            vel.f fVar = (vel.f) obj5;
            arrayList.add(j1h.b.b(cVar.f23243a, fVar, fVar, a0.d.n("TOP_MOVERS_GRID_DELEGATE_ID_", i), null, 8));
            i = i2;
        }
        return new go.g(AvatarGridWidgetDelegate.Model.Companion.b(companion, listId, textLocalisedClauseE, arrayList, c2Var, filter, 16), 2);
    }
}

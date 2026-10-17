package otk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.t;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.EtfDetailsFlowControllerContract$Page;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import njj.c1;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3h.a f229744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3d.f f229745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3h.c f229746c;

    public r(c3h.a assetDetailsHeaderMapper, q2d.a alertsQuickActionsMapper, o3d.f watchlistQuickActionsMapper, m3h.c actionsPanelMapper) {
        Intrinsics.checkNotNullParameter(assetDetailsHeaderMapper, "assetDetailsHeaderMapper");
        Intrinsics.checkNotNullParameter(alertsQuickActionsMapper, "alertsQuickActionsMapper");
        Intrinsics.checkNotNullParameter(watchlistQuickActionsMapper, "watchlistQuickActionsMapper");
        Intrinsics.checkNotNullParameter(actionsPanelMapper, "actionsPanelMapper");
        this.f229744a = assetDetailsHeaderMapper;
        this.f229745b = watchlistQuickActionsMapper;
        this.f229746c = actionsPanelMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        j jVar2 = (j) iii.c.f(domainState.f229727c, new os9.f(22), new oq3.e(20), new c1(this, domainState, 25));
        List<EtfDetailsFlowControllerContract$Page> list = domainState.f229726b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (EtfDetailsFlowControllerContract$Page etfDetailsFlowControllerContract$Page : list) {
            if (q.f229743a[etfDetailsFlowControllerContract$Page.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new com.revolut.core.ui_kit.views.q(etfDetailsFlowControllerContract$Page.getF94249a(), new t(new TextLocalisedClause(R$string.wealth_stock_details_tab_overview, null, null, 14)), 58));
        }
        return new k(jVar2, arrayList, domainState.f229725a, this.f229746c.a(domainState.f.f211545a));
    }
}

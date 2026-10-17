package bfh;

import au6.a3;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.private_companies.api.ui.details.PrivateCompanyDetailsContract$InputData;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.PrivateCompanyDetailsFlowContract$Page;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends oki.h implements a {
    public final ybl.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f15000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l1d.a f15001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u1d.a f15002r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n2h.a f15003s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f15004t;
    public final ali.b u;

    public o(ybl.b instrumentTickerInteractor, gte.a featureToggleInteractor, l1d.a alertsQuickActionsControllerModelExtension, u1d.a watchlistQuickActionsControllerModelExtension, n2h.a actionsPanelControllerModelExtension, ffh.b stateMapper, PrivateCompanyDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(alertsQuickActionsControllerModelExtension, "alertsQuickActionsControllerModelExtension");
        Intrinsics.checkNotNullParameter(watchlistQuickActionsControllerModelExtension, "watchlistQuickActionsControllerModelExtension");
        Intrinsics.checkNotNullParameter(actionsPanelControllerModelExtension, "actionsPanelControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = instrumentTickerInteractor;
        this.f15000p = featureToggleInteractor;
        this.f15001q = alertsQuickActionsControllerModelExtension;
        this.f15002r = watchlistQuickActionsControllerModelExtension;
        this.f15003s = actionsPanelControllerModelExtension;
        this.f15004t = mra.d.b(this, new c(PrivateCompanyDetailsFlowContract$Page.a(), PrivateCompanyDetailsFlowContract$Page.OVERVIEW.getF94249a(), inputData.f95721a.f95722a, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), (n2h.f) ((j2) ((m3h.a) actionsPanelControllerModelExtension).f202569p.f22677a).getValue()), stateMapper, null, false, 12);
        this.u = s.b(this, new b7d.c(inputData, 23));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.u;
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, q.Q(this.f15004t.B(new bek.a(2)), new a3((Continuation) null, this, 17)), null, null, new l(this, null, 2), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, boh.f.e(this.f15004t.B(new bek.a(1)), new b9i.f(this, 21)), null, new l(this, null, 1), 3);
        yji.l.b1(this, (j2) ((m3h.a) this.f15003s).f202569p.f22677a, null, new l(this, null, 0), 3);
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f15004t;
    }
}

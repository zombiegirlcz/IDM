package dnc;

import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreenContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends jki.g implements j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PortfolioAllocationsDetailsScreenContract$InputData f116272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.b f116273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jlc.u f116274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qmc.b f116275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f116276t;
    public final vii.c u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(jki.p stateMapper, PortfolioAllocationsDetailsScreenContract$InputData inputData, ybl.b instrumentTickerInteractor, jlc.u roboFooterDisclaimersWidgetProvider, qmc.b roboContextProvider) throws Throwable {
        String str;
        l lVar;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(roboFooterDisclaimersWidgetProvider, "roboFooterDisclaimersWidgetProvider");
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        this.f116272p = inputData;
        this.f116273q = instrumentTickerInteractor;
        this.f116274r = roboFooterDisclaimersWidgetProvider;
        this.f116275s = roboContextProvider;
        if (!((List) inputData.e.getValue()).isEmpty()) {
            lVar = l.STOCKS_TAB_ID;
        } else if (!((List) inputData.f.getValue()).isEmpty()) {
            lVar = l.BONDS_TAB_ID;
        } else if (!((List) inputData.f85154g.getValue()).isEmpty()) {
            lVar = l.COMMODITIES_TAB_ID;
        } else if (((List) inputData.f85155h.getValue()).isEmpty()) {
            int i = n.f116265a[inputData.d.ordinal()];
            if (i == 1) {
                str = "ACTUAL";
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "TARGET";
            }
            hx7.e.n(new IllegalStateException("No allocations provided; allocationType=".concat(str)));
            lVar = null;
        } else {
            lVar = l.CASH_TAB_ID;
        }
        this.f116276t = new d(lVar, null, null, null, null, null);
        this.u = new vii.c();
    }

    @Override // yji.l
    public final void I1() {
        i iVar = i.STOCKS;
        vii.c cVar = this.u;
        w4l.h hVar = w4l.h.f294642c;
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(cVar.a(iVar, hVar), new o(0, this, continuation)), null, null, new q(0, this, continuation), 3);
        yji.l.a1(this, vkm.q.Q(cVar.a(i.BONDS, hVar), new o(1, this, continuation)), null, null, new q(1, this, continuation), 3);
        yji.l.a1(this, vkm.q.Q(cVar.a(i.COMMODITIES, hVar), new o(2, this, continuation)), null, null, new q(2, this, continuation), 3);
        yji.l.a1(this, ((ppc.u) this.f116274r).a(jlc.t.PORTFOLIO_ALLOCATIONS), null, null, new q(3, this, continuation), 3);
        yji.l.a1(this, rd0.e.n(this.f116275s.a(), h0.f322473a), null, null, new q(4, this, continuation), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f116276t;
    }
}

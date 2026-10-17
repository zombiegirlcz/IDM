package g5b;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.cfd.impl.screens.exitstrategies.CfdExitStrategiesSetUpController;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import com.revolut.retail.wealth.resources.R$string;
import g4b.a0;
import java.math.BigDecimal;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o3b.y;
import qij.s;
import rp0.f1;
import vkm.j2;
import vkm.q;
import vkm.q0;
import vkm.z1;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t2b.d f140729l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t2b.a f140730m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w2b.a f140731n;
    public final z1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j2 f140732p;

    public j(t2b.d cfdRatesProvider, t2b.a cfdExitStrategiesProvider, w2b.a cfdExitStrategiesAvailabilityProvider) {
        Intrinsics.checkNotNullParameter(cfdRatesProvider, "cfdRatesProvider");
        Intrinsics.checkNotNullParameter(cfdExitStrategiesProvider, "cfdExitStrategiesProvider");
        Intrinsics.checkNotNullParameter(cfdExitStrategiesAvailabilityProvider, "cfdExitStrategiesAvailabilityProvider");
        this.f140729l = cfdRatesProvider;
        this.f140730m = cfdExitStrategiesProvider;
        this.f140731n = cfdExitStrategiesAvailabilityProvider;
        this.o = q.b(0, 6, null);
        this.f140732p = q.c(Boolean.FALSE);
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, q.Q(new a0(this.f140732p, 3), new f5h.b((Continuation) null, this, 27)), null, null, 7);
    }

    @Override // g5b.a
    public final Flow Z2(r2b.c exitStrategyTarget) {
        Flow flowQ;
        Intrinsics.checkNotNullParameter(exitStrategyTarget, "exitStrategyTarget");
        w2b.a aVar = this.f140731n;
        switch (aVar.f294008a) {
            case 0:
                t2b.c cVar = (t2b.c) aVar.f294010c;
                cVar.getClass();
                flowQ = q.Q(q.s(new s(cVar, 16), new w29.a(4), q.f290100b), new w2a.q((Continuation) null, aVar, 1));
                break;
            default:
                flowQ = boh.f.e(((ryc.a) aVar.d).i(), new z2.a(aVar, 4));
                break;
        }
        return boh.f.e(new q0(c8g.a.D(flowQ), new g(this, null, 1), 1), new g48.j(this, exitStrategyTarget, 7));
    }

    @Override // g5b.a
    public final void b3(CellDetailsActionDelegate.Model model) {
        e eVar;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.f51787l;
        b bVar = obj2 instanceof b ? (b) obj2 : null;
        if (bVar == null || (bigDecimal = (eVar = bVar.f140720a).f140723a) == null || (bigDecimal2 = eVar.f140724b) == null) {
            return;
        }
        TradingOrderExitStrategies tradingOrderExitStrategies = eVar.d;
        r2b.c cVar = eVar.e;
        if (cVar == null) {
            return;
        }
        N2(new CfdExitStrategiesSetUpController(new y(bVar.f140721b, bVar.f140722c, bigDecimal, bigDecimal2, bVar.d, cVar, tradingOrderExitStrategies != null ? tradingOrderExitStrategies.f104659a : null, tradingOrderExitStrategies != null ? tradingOrderExitStrategies.f104660b : null, tradingOrderExitStrategies != null ? tradingOrderExitStrategies.f104661c : null, eVar.f140725c)), ModalDestination.Style.POPUP.f98311a, new g48.j(this, bVar, 8));
    }

    public final void c3() {
        L2(new mii.f("shot-dialog-exit-strategies-updated", new TextLocalisedClause(R$string.wealth_trading_exit_strategy_setup_updated, null, null, 14), null, null, f1.ABOVE_ANCHOR_VIEW, null, 92));
    }
}

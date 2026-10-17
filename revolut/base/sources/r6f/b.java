package r6f;

import cfl.a0;
import cfl.f0;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.robo.api.model.RiskMetrics;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.info.fees.ManagedPortfolioFeesInfoController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.info.fees.ManagedPortfolioFeesInfoControllerContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ c u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a0 a0VarA;
        BigDecimal bigDecimal;
        RiskMetrics.ReturnBreakDown returnBreakDown;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) this.u.f251828g;
        vki.a aVar2 = lVar.f251837p;
        f0.a aVar3 = (f0.a) ((e) ((j2) aVar2.f22677a).getValue()).f251829a.getContent();
        if (aVar3 != null && (a0VarA = aVar3.a()) != null && (bigDecimal = a0VarA.f23728a.f23759a) != null) {
            RiskMetrics riskMetrics = (RiskMetrics) ((e) ((j2) aVar2.f22677a).getValue()).f251830b.getContent();
            n.P2(lVar, new ManagedPortfolioFeesInfoController(new ManagedPortfolioFeesInfoControllerContract$InputData(bigDecimal, (riskMetrics == null || (returnBreakDown = riskMetrics.f85041r) == null) ? null : returnBreakDown.f85046c)), ModalDestination.Style.POPUP.f98311a, null, 2);
        }
        return Unit.f186387a;
    }
}

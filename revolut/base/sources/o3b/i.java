package o3b;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.retail.cfd.impl.R$string;
import com.revolut.feature.retail.cfd.impl.screens.exitstrategies.CfdExitStrategiesSetUpController;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CfdExitStrategiesSetUpController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(CfdExitStrategiesSetUpController cfdExitStrategiesSetUpController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cfdExitStrategiesSetUpController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.v, continuation, 0);
            case 1:
                return new i(this.v, continuation, 1);
            default:
                return new i(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CfdExitStrategiesSetUpController cfdExitStrategiesSetUpController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n0) cfdExitStrategiesSetUpController.R2()).C2(a0.f221714a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0 n0Var = (n0) cfdExitStrategiesSetUpController.R2();
                j60.a aVar3 = n0Var.f221746p;
                n0Var.f221750t.getClass();
                rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.wealth_trading_exit_strategies_hint_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_exit_strategies_hint_description, null, null, 14), null, 28);
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("exit-strategy-info-dialog-got-it", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.wealth_trading_exit_strategies_hint_got_it, null, null, 14), false, null, null, n3b.a.f211977a, null, 744);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                aVar3.x(new rp0.y(zhm.u.c(model), tVar, null, null, null, null, 1020));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0 n0Var2 = (n0) cfdExitStrategiesSetUpController.R2();
                s sVar = ((t) ((j2) n0Var2.getState().f22677a).getValue()).i;
                TradingOrderExitStrategy tradingOrderExitStrategyL2 = sVar != null ? n0Var2.L2(k4l.n0.TAKE_PROFIT, sVar.f221761a, sVar.f221762b) : null;
                s sVar2 = ((t) ((j2) n0Var2.getState().f22677a).getValue()).f221769j;
                n0Var2.l2(new nya.i0(n0Var2, new TradingOrderExitStrategies(tradingOrderExitStrategyL2, sVar2 != null ? n0Var2.L2(k4l.n0.STOP_LOSS, sVar2.f221761a, sVar2.f221762b) : null, (k4l.m0) null, (List) null, 28), null, 6), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}

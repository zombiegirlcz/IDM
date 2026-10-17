package o3b;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.cfd.impl.R$string;
import com.revolut.feature.retail.cfd.impl.screens.exitstrategies.CfdExitStrategiesSetUpController;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CfdExitStrategiesSetUpController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CfdExitStrategiesSetUpController cfdExitStrategiesSetUpController, Continuation continuation) {
        super(2, continuation);
        this.v = cfdExitStrategiesSetUpController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        int i2;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.R2();
        Intrinsics.h(model);
        n0 n0Var = (n0) oVarE3;
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.P;
        w wVar = obj3 instanceof w ? (w) obj3 : null;
        if (wVar != null) {
            j60.a aVar2 = n0Var.f221746p;
            z zVar = n0Var.f221753y;
            k4l.n0 strategyType = wVar.f221774a;
            u selectedStrategyInputType = wVar.f221775b.f221761a;
            ((f0) zVar).getClass();
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            Intrinsics.checkNotNullParameter(selectedStrategyInputType, "selectedStrategyInputType");
            int[] iArr = e0.f221725a;
            int i3 = iArr[strategyType.ordinal()];
            if (i3 == 1) {
                i = R$string.wealth_trading_exit_strategies_type_selector_take_profit;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.wealth_trading_exit_strategies_type_selector_stop_loss;
            }
            rp0.t tVar = new rp0.t(new TextLocalisedClause(i, null, null, 14), null, null, 30);
            RowDelegate.Model modelB = f0.b(strategyType, u.PRICE, selectedStrategyInputType, R$drawable.uikit_icn_24_arrow_rates, R$string.wealth_trading_exit_strategies_type_selector_price_title, R$string.wealth_trading_exit_strategies_type_selector_price_description);
            u uVar = u.AMOUNT;
            int i5 = R$drawable.uikit_icn_24_pnl;
            int i6 = R$string.wealth_trading_exit_strategies_type_selector_amount_title;
            int i21 = iArr[strategyType.ordinal()];
            if (i21 == 1) {
                i2 = R$string.wealth_trading_exit_strategies_type_selector_amount_description;
            } else {
                if (i21 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$string.wealth_trading_exit_strategies_type_selector_amount_stop_loss_description;
            }
            List listK = zhm.v.k(modelB, f0.b(strategyType, uVar, selectedStrategyInputType, i5, i6, i2), f0.b(strategyType, u.DISTANCE, selectedStrategyInputType, R$drawable.uikit_icn_24_percent, R$string.wealth_trading_exit_strategies_type_selector_distance_title, R$string.wealth_trading_exit_strategies_type_selector_distance_description));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            aVar2.x(new rp0.y(listK, tVar, rp0.l.WINDOW, null, null, null, 1016));
        }
        return Unit.f186387a;
    }
}

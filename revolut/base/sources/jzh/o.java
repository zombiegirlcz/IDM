package jzh;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.feature_crypto_order_flow.api.navigation.AccountBalanceLimitBottomSheetControllerProvider$InputData;
import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreen;
import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OrderSummaryScreen f179842w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(OrderSummaryScreen orderSummaryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f179842w = orderSummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f179842w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(this.f179842w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            default:
                o oVar3 = new o(this.f179842w, continuation, 2);
                oVar3.v = obj2;
                return oVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Limit.UsageLimit usageLimitA;
        int i = this.u;
        OrderSummaryScreen orderSummaryScreen = this.f179842w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0VarR2 = orderSummaryScreen.R2();
                Intrinsics.h(clickData);
                com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar2 = (com.revolut.feature_crypto_order_flow.impl.order_summary.a) f0VarR2;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) aVar2.f96778p).d(clickData);
                if (cryptoFcaRisksDestinationD != null) {
                    aVar2.C1(cryptoFcaRisksDestinationD);
                }
                break;
            case 1:
                g6 selectedData = (g6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0VarR22 = orderSummaryScreen.R2();
                Intrinsics.h(selectedData);
                com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar4 = (com.revolut.feature_crypto_order_flow.impl.order_summary.a) f0VarR22;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(selectedData, "selectedData");
                cli.y yVar = aVar4.E;
                s sVar = ((r) ((j2) yVar.f22677a).getValue()).f179848b;
                h0 h0Var = sVar instanceof h0 ? (h0) sVar : null;
                if (h0Var != null) {
                    String str = selectedData.f54199a;
                    myh.j jVar = myh.j.TAKE_PROFIT;
                    if (!Intrinsics.f(str, jVar.getId())) {
                        jVar = myh.j.STOP_LOSS;
                    }
                    aVar4.H2(yVar, new jp3.b(h0Var, jVar, 28));
                }
                break;
            default:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0VarR23 = orderSummaryScreen.R2();
                Intrinsics.h(clickData2);
                com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar6 = (com.revolut.feature_crypto_order_flow.impl.order_summary.a) f0VarR23;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                if (Intrinsics.f(clickData2.f275445a, "ACCOUNT_LIMIT_LEARN_MORE_CLICK_ID") && (usageLimitA = ((r) ((j2) aVar6.E.f22677a).getValue()).f179848b.a()) != null) {
                    oki.h.v2(aVar6.F, new OrderSummaryScreenContract$ModalStep.AccountBalanceLimit(new AccountBalanceLimitBottomSheetControllerProvider$InputData(usageLimitA)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
        }
        return Unit.f186387a;
    }
}

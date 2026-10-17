package m2f;

import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.TradeRevPointsTransferScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.TradeRevPointsTransferScreenContract$ModalStep;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccountTransferLimit;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRate;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TradeRevPointsTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(TradeRevPointsTransferScreen tradeRevPointsTransferScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = tradeRevPointsTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            case 1:
                return new h(this.v, continuation, 1);
            case 2:
                return new h(this.v, continuation, 2);
            case 3:
                return new h(this.v, continuation, 3);
            case 4:
                return new h(this.v, continuation, 4);
            default:
                return new h(this.v, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((h) create((com.revolut.core.ui_kit.delegates.v) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        u2f.h hVar;
        TradeRevPointsRate tradeRevPointsRate;
        String str;
        TradeRevPointsRate tradeRevPointsRate2;
        TradeRevPointsAccountTransferLimit tradeRevPointsAccountTransferLimit;
        TradeRevPointsRate tradeRevPointsRate3;
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        TradeRevPointsTransferScreen tradeRevPointsTransferScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) tradeRevPointsTransferScreen.R2()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar3 = (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) tradeRevPointsTransferScreen.R2();
                cli.y yVar = aVar3.E;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                u2f.d dVar = (u2f.d) ((l) j2Var.getValue()).f201977b.getContent();
                if (dVar != null && (tradeRevPointsRate = (hVar = dVar.f276624m).f276642h) != null) {
                    TradeRevPointsAccountTransferLimit tradeRevPointsAccountTransferLimit2 = dVar.f276630t;
                    Continuation continuation = null;
                    if (tradeRevPointsAccountTransferLimit2 == null || ((l) j2Var2.getValue()).f201979g <= tradeRevPointsAccountTransferLimit2.f91186c) {
                        TradeRevPointsAccount tradeRevPointsAccount = (TradeRevPointsAccount) ((l) j2Var2.getValue()).f201978c.getContent();
                        if (tradeRevPointsAccount != null && (str = tradeRevPointsAccount.f91181a) != null) {
                            aVar3.v.Q();
                            aVar3.l2(new lr.l(11, aVar3, tradeRevPointsRate, str, continuation), new lul.d(aVar3, hVar, 12));
                        }
                    } else {
                        aVar3.C1(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.UpgradeToAnyPlan(xfa.b.REV_POINTS, null, 14))));
                    }
                }
                break;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar5 = (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) tradeRevPointsTransferScreen.R2();
                aVar5.H2(aVar5.E, new m18.n(24));
                break;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar7 = (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) tradeRevPointsTransferScreen.R2();
                aVar7.H2(aVar7.E, new m18.n(25));
                break;
            case 4:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar9 = (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) tradeRevPointsTransferScreen.R2();
                u2f.d dVar2 = (u2f.d) ((l) ((j2) aVar9.E.f22677a).getValue()).f201977b.getContent();
                if (dVar2 != null && (tradeRevPointsRate2 = dVar2.f276624m.f276642h) != null && (tradeRevPointsAccountTransferLimit = dVar2.f276630t) != null) {
                    oki.h.v2(aVar9.F, new TradeRevPointsTransferScreenContract$ModalStep.LimitInfo(tradeRevPointsAccountTransferLimit, tradeRevPointsRate2.f91192c), bottom_dialog);
                }
                break;
            default:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar11 = (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) tradeRevPointsTransferScreen.R2();
                u2f.d dVar3 = (u2f.d) ((l) ((j2) aVar11.E.f22677a).getValue()).f201977b.getContent();
                if (dVar3 != null && (tradeRevPointsRate3 = dVar3.f276624m.f276642h) != null) {
                    oki.h.v2(aVar11.F, new TradeRevPointsTransferScreenContract$ModalStep.Breakdown(tradeRevPointsRate3), bottom_dialog);
                }
                break;
        }
        return Unit.f186387a;
    }
}

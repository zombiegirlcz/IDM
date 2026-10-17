package nvk;

import com.revolut.feature.wealth.api.declaration.DisclosuresFeatureConfig;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.statement.models.StockFinancialsStatementItemExpandedState;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsController;
import k1h.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StockFinancialsStatementsController f219709w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(StockFinancialsStatementsController stockFinancialsStatementsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f219709w = stockFinancialsStatementsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f219709w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f219709w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f219709w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((esk.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((esk.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        StockFinancialsStatementsController stockFinancialsStatementsController = this.f219709w;
        switch (i) {
            case 0:
                esk.b subPeriod = (esk.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a aVar2 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a) stockFinancialsStatementsController.R2();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(subPeriod, "subPeriod");
                aVar2.H2(aVar2.u, new nrd.g(subPeriod, 15));
                break;
            case 1:
                esk.a aVar3 = (esk.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE3 = stockFinancialsStatementsController.R2();
                StockFinancialsStatementItemExpandedState item = new StockFinancialsStatementItemExpandedState(aVar3.f128993a.f282213a, ((k) ((j2) ((com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a) stockFinancialsStatementsController.R2()).u.f22677a).getValue()).f219715b);
                boolean z = !aVar3.f128994b;
                com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a aVar5 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a) jVarE3;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                aVar5.H2(aVar5.u, new l3d.f(item, z, 14));
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE32 = stockFinancialsStatementsController.R2();
                Intrinsics.h(clickData);
                com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a aVar7 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a) jVarE32;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                aii.u bridgeDestination = Intrinsics.f(obj3, o.a.f180271a) ? new BridgeDestination(new FeatureCommand(DisclosuresFeatureConfig.TradingDisclosuresFeatureConfig.f95197a)) : obj3 instanceof k1h.p ? new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(((k1h.p) obj3).f180272a, WebViewScreenTitleSource.Html.f98166a, false)), null, true) : null;
                if (bridgeDestination != null) {
                    aVar7.C1(bridgeDestination);
                }
                break;
        }
        return Unit.f186387a;
    }
}

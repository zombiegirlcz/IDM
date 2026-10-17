package bxg;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.PortfolioInsightsAssetIndicatorController;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PortfolioInsightsAssetIndicatorController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PortfolioInsightsAssetIndicatorController portfolioInsightsAssetIndicatorController, Continuation continuation) {
        super(2, continuation);
        this.v = portfolioInsightsAssetIndicatorController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a aVar2 = (com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a) fVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        pwg.b bVar = obj3 instanceof pwg.b ? (pwg.b) obj3 : null;
        if (bVar != null) {
            aVar2.C1(new AssetDetailsDestination(bVar.f240450a.e, null, false, null, null, null, 62));
        }
        return Unit.f186387a;
    }
}

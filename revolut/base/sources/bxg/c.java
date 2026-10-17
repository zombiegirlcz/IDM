package bxg;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.PortfolioInsightsAssetIndicatorController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PortfolioInsightsAssetIndicatorController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PortfolioInsightsAssetIndicatorController portfolioInsightsAssetIndicatorController, Continuation continuation) {
        super(2, continuation);
        this.v = portfolioInsightsAssetIndicatorController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        pwg.q qVar;
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a aVar2 = (com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a) fVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f52715m;
        k kVar = obj3 instanceof k ? (k) obj3 : null;
        if (kVar != null) {
            int i = p.f19698a[kVar.f19691a.ordinal()];
            if (i == 1) {
                qVar = pwg.q.LOWEST_FIRST;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                qVar = pwg.q.HIGHEST_FIRST;
            }
            aVar2.H2(aVar2.f95030t, new bq7.j(qVar, 24));
        }
        return Unit.f186387a;
    }
}

package ywg;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.wealth.analytics.insights.ui.dashboard.PortfolioInsightsDashboardController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PortfolioInsightsDashboardController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PortfolioInsightsDashboardController portfolioInsightsDashboardController, Continuation continuation) {
        super(2, continuation);
        this.v = portfolioInsightsDashboardController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        a aVar2 = (a) this.v.T.getValue();
        Intrinsics.h(model);
        l lVar = (l) aVar2;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.k instanceof e) {
            lVar.f317436q.a();
        }
        return Unit.f186387a;
    }
}

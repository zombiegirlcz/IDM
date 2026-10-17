package ywg;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.analytics.insights.ui.dashboard.PortfolioInsightsDashboardController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pwg.m;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PortfolioInsightsDashboardController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PortfolioInsightsDashboardController portfolioInsightsDashboardController, Continuation continuation) {
        super(2, continuation);
        this.v = portfolioInsightsDashboardController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        a aVar2 = (a) this.v.T.getValue();
        Intrinsics.h(model);
        l lVar = (l) aVar2;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        c cVar = obj3 instanceof c ? (c) obj3 : null;
        if (cVar != null) {
            m mVar = cVar.f317426a.e;
            int i = k.f317434a[mVar.d.ordinal()];
            if (i == 1) {
                lVar.C2(new d(lVar.o.f95019a, mVar.f240471a));
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.f186387a;
    }
}

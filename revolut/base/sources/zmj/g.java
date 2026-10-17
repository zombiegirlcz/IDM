package zmj;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimSubscriptionDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(EsimSubscriptionDetailsScreen esimSubscriptionDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimSubscriptionDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e0 e0VarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) e0VarE3;
        unj.c cVar = aVar2.f101430s;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51832a, "COVERAGE_ITEM")) {
            Object obj3 = model.o;
            EsimCoverage esimCoverage = obj3 instanceof EsimCoverage ? (EsimCoverage) obj3 : null;
            if (esimCoverage != null) {
                if (esimCoverage instanceof EsimCoverage.Regional) {
                    yji.l.g2(aVar2, cVar.b((EsimCoverage.Regional) esimCoverage), null, null, 3);
                } else if (esimCoverage instanceof EsimCoverage.Global) {
                    yji.l.g2(aVar2, cVar.a((EsimCoverage.Global) esimCoverage), null, null, 3);
                } else {
                    if (!(esimCoverage instanceof EsimCoverage.Country) && !(esimCoverage instanceof EsimCoverage.Undefined)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimSubscriptionDetailsScreenModel", "Coverage type is unsupported", null, h0Var);
                    Unit unit = Unit.f186387a;
                }
            }
        }
        return Unit.f186387a;
    }
}

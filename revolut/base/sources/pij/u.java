package pij;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimSubscriptionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(EsimSubscriptionsScreen esimSubscriptionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimSubscriptionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u uVar = new u(this.v, continuation);
        uVar.u = obj2;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        y yVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) yVarE3;
        unj.c cVar = bVar.C;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51832a, "COVERAGE_ITEM")) {
            Object obj3 = model.o;
            EsimCoverage esimCoverage = obj3 instanceof EsimCoverage ? (EsimCoverage) obj3 : null;
            if (esimCoverage != null) {
                if (esimCoverage instanceof EsimCoverage.Regional) {
                    yji.l.g2(bVar, cVar.b((EsimCoverage.Regional) esimCoverage), null, null, 3);
                } else if (esimCoverage instanceof EsimCoverage.Global) {
                    yji.l.g2(bVar, cVar.a((EsimCoverage.Global) esimCoverage), null, null, 3);
                } else {
                    if (!(esimCoverage instanceof EsimCoverage.Country) && !(esimCoverage instanceof EsimCoverage.Undefined)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimSubscriptionsScreenModel", "Coverage type is unsupported", null, h0Var);
                    Unit unit = Unit.f186387a;
                }
            }
        }
        return Unit.f186387a;
    }
}

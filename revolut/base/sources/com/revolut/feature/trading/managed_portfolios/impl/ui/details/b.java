package com.revolut.feature.trading.managed_portfolios.impl.ui.details;

import com.revolut.feature.trading.managed_portfolios.impl.domain.model.ManagedPortfolioReferenceData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import vkm.q;
import wkm.l;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            l lVarA = cVar.C.a(cVar.A.f91277a);
            this.u = 1;
            obj2 = q.x(lVarA, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        ManagedPortfolioReferenceData managedPortfolioReferenceData = (ManagedPortfolioReferenceData) obj2;
        String str = null;
        ManagedPortfolioReferenceData.Benchmark benchmark = managedPortfolioReferenceData instanceof ManagedPortfolioReferenceData.Benchmark ? (ManagedPortfolioReferenceData.Benchmark) managedPortfolioReferenceData : null;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = cVar.J;
        if (benchmark != null && benchmark.f91239a) {
            str = benchmark.f91240b;
        }
        h.v2(aVar2, new ManagedPortfolioDetailsControllerContract$ModalStep.BenchmarkChooser(str), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}

package aqd;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class d1 extends gim.i implements Function2 {
    public final /* synthetic */ IncomeSortersDetailsController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(IncomeSortersDetailsController incomeSortersDetailsController, Continuation continuation) {
        super(2, continuation);
        this.u = incomeSortersDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d1(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d1) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) this.u.d();
        cli.y yVar = eVar.f87766x;
        eVar.H2(yVar, new an4.f(((t) ((j2) yVar.f22677a).getValue()).f8403b, 29));
        return Unit.f186387a;
    }
}

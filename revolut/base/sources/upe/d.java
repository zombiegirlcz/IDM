package upe;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.tax_residency.impl.v2.ui.list.TaxResidencyListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ TaxResidencyListScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TaxResidencyListScreen taxResidencyListScreen, Continuation continuation) {
        super(2, continuation);
        this.u = taxResidencyListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.tax_residency.impl.v2.ui.list.a aVar2 = (com.revolut.feature.tax_residency.impl.v2.ui.list.a) this.u.R2();
        aVar2.getClass();
        aVar2.l2(new u83.f(aVar2, null, 20), new yi5.b(26));
        return Unit.f186387a;
    }
}

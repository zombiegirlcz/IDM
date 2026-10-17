package rx6;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.list.InvoiceListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ InvoiceListScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InvoiceListScreen invoiceListScreen, Continuation continuation) {
        super(2, continuation);
        this.u = invoiceListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.freelancer.impl.ui.invoice.list.a aVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.list.a) this.u.d();
        aVar2.H2(aVar2.f73878r, new ru6.r(26));
        return Unit.f186387a;
    }
}

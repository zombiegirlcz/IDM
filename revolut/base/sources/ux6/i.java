package ux6;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.InvoiceCustomerListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ InvoiceCustomerListScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InvoiceCustomerListScreen invoiceCustomerListScreen, Continuation continuation) {
        super(2, continuation);
        this.u = invoiceCustomerListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a aVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a) this.u.d();
        aVar2.H2(aVar2.v, new m(aVar2, 0));
        return Unit.f186387a;
    }
}

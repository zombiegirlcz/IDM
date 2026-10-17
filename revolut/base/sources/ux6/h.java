package ux6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.common.models.FreelancerCustomer;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.InvoiceCustomerListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceCustomerListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InvoiceCustomerListScreen invoiceCustomerListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceCustomerListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a aVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a) kVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (Intrinsics.f(model.f53228a, "ID_PERMISSIONS_ITEM")) {
            ((pn3.b) aVar2.f73886s).c(aVar2, new m(aVar2, 1));
        } else if (obj3 instanceof FreelancerCustomer) {
            aVar2.n2(new un8.j(aVar2, ((FreelancerCustomer) obj3).f73281a, null, 17), new whi.b(6));
        } else if (obj3 instanceof f5j.a) {
            aVar2.J2(new gw6.a((f5j.a) obj3));
        } else if (obj3 instanceof zm3.a) {
            aVar2.J2(new gw6.b((zm3.a) obj3));
        }
        return Unit.f186387a;
    }
}

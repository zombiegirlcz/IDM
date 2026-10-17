package ox6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.impl.ui.invoice.details.screen.InvoiceDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InvoiceDetailsScreen invoiceDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FreelancerInvoice freelancerInvoice;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.d();
        String listId = model.f53228a;
        com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a) lVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        j jVar = (j) ((i) ((j2) aVar2.f73872x.f22677a).getValue()).f230624a.getContent();
        if (jVar != null && (freelancerInvoice = jVar.f230625a) != null) {
            j60.a.v(aVar2.f73866p, false, new ky4.f(listId, 25, aVar2, freelancerInvoice), 1);
        }
        return Unit.f186387a;
    }
}

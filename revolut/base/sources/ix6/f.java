package ix6;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceCreateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InvoiceCreateScreen invoiceCreateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceCreateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FreelancerInvoice freelancerInvoiceJ2;
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarF3 = this.v.d();
        String listId = model.f52708a;
        com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) b0VarF3;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ITEM_ID_CUSTOMER_SUBHEADER") && (freelancerInvoiceJ2 = gVar.J2()) != null) {
            gVar.C2(new t(freelancerInvoiceJ2.f73374a));
        }
        return Unit.f186387a;
    }
}

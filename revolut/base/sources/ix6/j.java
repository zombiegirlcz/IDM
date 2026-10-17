package ix6;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceCreateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(InvoiceCreateScreen invoiceCreateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceCreateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarF3 = this.v.d();
        String listId = item.f58316a;
        com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) b0VarF3;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        FreelancerInvoice freelancerInvoiceJ2 = gVar.J2();
        if (freelancerInvoiceJ2 != null) {
            if (Intrinsics.f(listId, "ITEM_ID_DELETE_INVOICE")) {
                gVar.n2(new m0(gVar, freelancerInvoiceJ2, null, 3), new whi.b(6));
            } else if (Intrinsics.f(listId, "ITEM_ID_PREVIEW_INVOICE")) {
                oki.h.v2(gVar.A, new InvoiceCreateScreenContract$ModalStep.Preview(freelancerInvoiceJ2.f73374a), ModalDestination.Style.POPUP.f98311a);
            }
        }
        return Unit.f186387a;
    }
}

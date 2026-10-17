package ix6;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceItemPayload;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceCreateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InvoiceCreateScreen invoiceCreateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceCreateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        Object next;
        List list2;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarF3 = this.v.d();
        String listId = model.f52580a;
        com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) b0VarF3;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = gVar.A;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (kotlin.text.a0.H(listId, "ITEM_ID_ITEM", false)) {
            String strV0 = kotlin.text.d0.v0(listId, ":", listId);
            FreelancerInvoice freelancerInvoiceJ2 = gVar.J2();
            if (freelancerInvoiceJ2 != null && (list = freelancerInvoiceJ2.f73387t) != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (Intrinsics.f(((FreelancerInvoiceItemPayload) next).f73393a, strV0)) {
                        break;
                    }
                }
                FreelancerInvoiceItemPayload freelancerInvoiceItemPayload = (FreelancerInvoiceItemPayload) next;
                if (freelancerInvoiceItemPayload != null) {
                    boolean zH = kotlin.text.a0.H(listId, "ITEM_ID_ITEM_QUANTITY_UNIT", false);
                    ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                    if (zH) {
                        oki.h.v2(aVar2, new InvoiceCreateScreenContract$ModalStep.ItemUnit(freelancerInvoiceItemPayload), bottom_dialog);
                    } else if (kotlin.text.a0.H(listId, "ITEM_ID_ITEM_PRICE_TAX_RATE", false) && (list2 = (List) ((com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) ((j2) gVar.z.f22677a).getValue()).f73840g.getContent()) != null) {
                        oki.h.v2(aVar2, new InvoiceCreateScreenContract$ModalStep.ItemTaxRate(freelancerInvoiceItemPayload, list2), bottom_dialog);
                    }
                }
            }
        }
        return Unit.f186387a;
    }
}

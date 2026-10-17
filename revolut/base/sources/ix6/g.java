package ix6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.mappers.InvoiceCustomerIdPayload;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceCreateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InvoiceCreateScreen invoiceCreateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceCreateScreen;
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
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarF3 = this.v.d();
        String listId = model.f53228a;
        Object obj3 = model.u;
        com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) b0VarF3;
        cli.y yVar = gVar.z;
        Intrinsics.checkNotNullParameter(listId, "listId");
        FreelancerInvoice freelancerInvoiceJ2 = gVar.J2();
        if (freelancerInvoiceJ2 != null) {
            String str = freelancerInvoiceJ2.f73374a;
            if (obj3 instanceof InvoiceCustomerIdPayload) {
                gVar.C2(new r(((InvoiceCustomerIdPayload) obj3).f73764a));
            } else if (Intrinsics.f(listId, "ITEM_ID_CUSTOMER_PLACEHOLDER")) {
                gVar.C2(new t(str));
            } else if (Intrinsics.f(listId, "ITEM_ID_ADDITIONAL_OPTIONS_PAYMENT_METHODS")) {
                gVar.C2(new x(str));
            } else if (Intrinsics.f(listId, "ITEM_ID_ADDITIONAL_OPTIONS_TEMPLATE")) {
                gVar.L2(freelancerInvoiceJ2);
            } else if (Intrinsics.f(listId, "ITEM_ID_ADDITIONAL_OPTIONS_EMAIL_MESSAGE_SWITCH")) {
                gVar.H2(yVar, new iwk.b(5));
                a.C0490a c0490a = ((com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) ((j2) yVar.f22677a).getValue()).f73837a;
                String str2 = c0490a.f73841a;
                gVar.N2(FreelancerInvoice.a(freelancerInvoiceJ2, null, null, null, null, null, (str2 == null || !c0490a.f73842b) ? null : str2, null, null, 65011711));
            }
        }
        return Unit.f186387a;
    }
}

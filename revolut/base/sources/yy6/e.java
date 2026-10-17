package yy6;

import aw0.n6;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.details.InvoiceTemplateDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.details.InvoiceTemplateDetailsScreenContract$ModalStep;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplateCreatePayload;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InvoiceTemplateDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(InvoiceTemplateDetailsScreen invoiceTemplateDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = invoiceTemplateDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InvoiceTemplateDetailsScreen invoiceTemplateDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) invoiceTemplateDetailsScreen.d()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c cVar = (com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) invoiceTemplateDetailsScreen.d();
                InvoiceTemplateCreatePayload invoiceTemplateCreatePayloadC = ((l) ((j2) cVar.f73959s.f22677a).getValue()).c();
                if (invoiceTemplateCreatePayloadC != null) {
                    oki.h.v2(cVar.f73960t, new InvoiceTemplateDetailsScreenContract$ModalStep.Preview(invoiceTemplateCreatePayloadC), ModalDestination.Style.POPUP.f98311a);
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c cVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) invoiceTemplateDetailsScreen.d();
                cVar2.getClass();
                cVar2.n2(new yv1.k(cVar2, null, 7), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}

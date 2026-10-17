package ix6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InvoiceCreateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(InvoiceCreateScreen invoiceCreateScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = invoiceCreateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.v, continuation, 0);
            default:
                return new i(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InvoiceCreateScreen invoiceCreateScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) invoiceCreateScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) invoiceCreateScreen.d();
                FreelancerInvoice freelancerInvoiceJ2 = gVar.J2();
                if (freelancerInvoiceJ2 != null) {
                    if (mif.e0.v(freelancerInvoiceJ2)) {
                        gVar.n2(new m0(gVar, freelancerInvoiceJ2, null, 2), new whi.b(6));
                    } else {
                        gVar.H2(gVar.z, new iwk.b(6));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}

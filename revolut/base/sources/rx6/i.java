package rx6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.impl.ui.invoice.list.InvoiceListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InvoiceListScreen invoiceListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.d();
        Object obj3 = model.u;
        com.revolut.feature.freelancer.impl.ui.invoice.list.a aVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.list.a) oVarE3;
        aVar2.getClass();
        FreelancerInvoice freelancerInvoice = obj3 instanceof FreelancerInvoice ? (FreelancerInvoice) obj3 : null;
        if (freelancerInvoice != null) {
            aVar2.C1(new FreelancerBizFeatureConfig.InvoiceDetailsNavigationDestination(freelancerInvoice.f73374a));
        }
        return Unit.f186387a;
    }
}

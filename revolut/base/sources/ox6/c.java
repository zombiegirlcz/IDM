package ox6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.impl.ui.invoice.details.screen.InvoiceDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InvoiceDetailsScreen invoiceDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.d();
        Object obj3 = model.u;
        com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a) lVarE3;
        aVar2.getClass();
        if (obj3 instanceof FreelancerInvoice) {
            aVar2.C1(new FreelancerBizFeatureConfig.InvoiceDetailsNavigationDestination(((FreelancerInvoice) obj3).f73374a));
        }
        return Unit.f186387a;
    }
}

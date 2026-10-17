package dz6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.list.InvoiceTemplatesListScreen;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceTemplatesListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InvoiceTemplatesListScreen invoiceTemplatesListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceTemplatesListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarE3 = this.v.R2();
        Object obj3 = model.u;
        qVarE3.getClass();
        if (obj3 instanceof InvoiceTemplate) {
            qVarE3.n2(new o(qVarE3, obj3, null, 0), new whi.b(6));
        }
        return Unit.f186387a;
    }
}

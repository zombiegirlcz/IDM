package ix6;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceCreateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InvoiceCreateScreen invoiceCreateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceCreateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarF3 = this.v.d();
        com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) b0VarF3;
        gVar.K2(model.o, model.f51832a);
        return Unit.f186387a;
    }
}

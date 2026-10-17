package by6;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.InvoicePaymentMethodsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoicePaymentMethodsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InvoicePaymentMethodsScreen invoicePaymentMethodsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoicePaymentMethodsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVarE3 = this.v.R2();
        String listId = model.f52373a;
        kVarE3.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        kVarE3.f19756p.a();
        return Unit.f186387a;
    }
}

package yy6;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.details.InvoiceTemplateDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceTemplateDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InvoiceTemplateDetailsScreen invoiceTemplateDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceTemplateDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SmallActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SmallActionButtonDelegate.Model model = (SmallActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        String listId = model.f53337a;
        com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c cVar = (com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) nVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_CUSTOM_FIELDS_ADD_FIELD")) {
            cVar.H2(cVar.f73959s, new yv8.j(24));
        }
        return Unit.f186387a;
    }
}

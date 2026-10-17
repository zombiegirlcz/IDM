package yy6;

import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.details.InvoiceTemplateDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceTemplateDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InvoiceTemplateDetailsScreen invoiceTemplateDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceTemplateDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsNoteDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsNoteDelegate.Model model = (CellDetailsNoteDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        String listId = model.f51871a;
        Object obj3 = model.f51877l;
        com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c cVar = (com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) nVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_VAT_NUMBER")) {
            cVar.C2(m.f317849a);
        } else if (Intrinsics.f(listId, "LIST_ID_CUSTOM_FIELDS_FIELD_HEADER") && (obj3 instanceof az6.b)) {
            cVar.H2(cVar.f73959s, new sx4.b(obj3, 19));
        }
        return Unit.f186387a;
    }
}

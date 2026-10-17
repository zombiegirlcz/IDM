package fz6;

import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.override.InvoiceTemplateOverrideScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceTemplateOverrideScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InvoiceTemplateOverrideScreen invoiceTemplateOverrideScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceTemplateOverrideScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsNoteDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsNoteDelegate.Model model = (CellDetailsNoteDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.d();
        String listId = model.f51871a;
        Object obj3 = model.f51877l;
        com.revolut.feature.freelancer.impl.ui.invoice.templates.override.a aVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.templates.override.a) jVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_CUSTOM_FIELDS_FIELD_HEADER") && (obj3 instanceof az6.b)) {
            aVar2.H2(aVar2.o, new a5g.i(((az6.b) obj3).f11393a, 16));
        }
        return Unit.f186387a;
    }
}

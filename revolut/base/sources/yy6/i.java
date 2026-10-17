package yy6;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.details.InvoiceTemplateDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.details.InvoiceTemplateDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceTemplateDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InvoiceTemplateDetailsScreen invoiceTemplateDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceTemplateDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        Object obj3 = model.P;
        com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c cVar = (com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) nVarE3;
        if (obj3 instanceof u9d.b) {
            oki.h.v2(cVar.f73960t, new InvoiceTemplateDetailsScreenContract$ModalStep.LanguageSelector((u9d.b) obj3), ModalDestination.Style.POPUP.f98311a);
        } else {
            cVar.getClass();
        }
        return Unit.f186387a;
    }
}

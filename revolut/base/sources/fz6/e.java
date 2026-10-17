package fz6;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.override.InvoiceTemplateOverrideScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.override.InvoiceTemplateOverrideScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceTemplateOverrideScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InvoiceTemplateOverrideScreen invoiceTemplateOverrideScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceTemplateOverrideScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.d();
        Object obj3 = model.P;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = ((com.revolut.feature.freelancer.impl.ui.invoice.templates.override.a) jVarE3).f73973p;
        boolean z = obj3 instanceof s;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        if (z) {
            u9d.b bVar = ((s) obj3).f139131a;
            if (bVar != null) {
                oki.h.v2(aVar2, new InvoiceTemplateOverrideScreenContract$ModalStep.LanguageSelector(bVar), popup);
            }
        } else if (obj3 instanceof t) {
            oki.h.v2(aVar2, InvoiceTemplateOverrideScreenContract$ModalStep.TemplateSelector.f73972a, popup);
        }
        return Unit.f186387a;
    }
}

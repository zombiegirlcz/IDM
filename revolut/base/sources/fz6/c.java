package fz6;

import cli.y;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.override.InvoiceTemplateOverrideScreen;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplateOverride;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InvoiceTemplateOverrideScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(InvoiceTemplateOverrideScreen invoiceTemplateOverrideScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = invoiceTemplateOverrideScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InvoiceTemplateOverrideScreen invoiceTemplateOverrideScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.invoice.templates.override.a) invoiceTemplateOverrideScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.templates.override.a aVar3 = (com.revolut.feature.freelancer.impl.ui.invoice.templates.override.a) invoiceTemplateOverrideScreen.d();
                y yVar = aVar3.o;
                h hVar = (h) ((j2) yVar.f22677a).getValue();
                String str = hVar.f139113c;
                List list = hVar.d;
                if (str == null || d0.W(str)) {
                    aVar3.H2(yVar, new fwf.n(16));
                } else {
                    List<InvoiceTemplate.CustomField> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (InvoiceTemplate.CustomField customField : list2) {
                            if (d0.W(customField.f86403a) || d0.W(customField.f86404b)) {
                                aVar3.H2(yVar, new fwf.n(16));
                            }
                        }
                    }
                    InvoiceTemplate invoiceTemplate = hVar.f139111a;
                    String str2 = hVar.f;
                    String str3 = hVar.e;
                    u9d.b bVar = hVar.f139112b;
                    u9d.b bVar2 = invoiceTemplate.i != bVar ? bVar : null;
                    String str4 = hVar.f139113c;
                    aVar3.C2(new i(invoiceTemplate, new InvoiceTemplateOverride(bVar2, !Intrinsics.f(invoiceTemplate.d, str4) ? str4 : null, !invoiceTemplate.f86401h.equals(list) ? list : null, Intrinsics.f(invoiceTemplate.f86402j, str3) ? null : new InvoiceTemplateOverride.Value(str3 != null ? u9d.c.SET : u9d.c.UNSET, str3), Intrinsics.f(invoiceTemplate.k, str2) ? null : new InvoiceTemplateOverride.Value(str2 != null ? u9d.c.SET : u9d.c.UNSET, str2))));
                }
                break;
        }
        return Unit.f186387a;
    }
}

package yy6;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.details.InvoiceTemplateDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlin.text.z;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceTemplateDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(InvoiceTemplateDetailsScreen invoiceTemplateDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceTemplateDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        Intrinsics.h(textData);
        com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c cVar = (com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) nVarE3;
        y yVar = cVar.f73959s;
        y yVar2 = cVar.f73959s;
        Intrinsics.checkNotNullParameter(textData, "textData");
        String str = textData.f52597a;
        if (Intrinsics.f(str, "LIST_ID_TEMPLATE_NAME")) {
            cVar.H2(yVar, new vqc.l(textData, 4));
        } else if (Intrinsics.f(str, "LIST_ID_INVOICE_NAME")) {
            cVar.H2(yVar, new vqc.l(textData, 5));
        } else if (Intrinsics.f(str, "LIST_ID_HEADER")) {
            cVar.H2(yVar, new vqc.l(textData, 6));
        } else if (Intrinsics.f(str, "LIST_ID_FOOTER")) {
            cVar.H2(yVar, new vqc.l(textData, 7));
        } else if (a0.H(str, "LIST_ID_CUSTOM_FIELDS_FIELD_NAME", false)) {
            yw9.j jVar = new yw9.j(20);
            Integer numM = z.m(d0.x0(str, "_", ""));
            if (numM != null) {
                cVar.H2(yVar2, new fz6.n(numM.intValue(), jVar, textData, 1));
            }
        } else if (a0.H(str, "LIST_ID_CUSTOM_FIELDS_FIELD_VALUE", false)) {
            yw9.j jVar2 = new yw9.j(21);
            Integer numM2 = z.m(d0.x0(str, "_", ""));
            if (numM2 != null) {
                cVar.H2(yVar2, new fz6.n(numM2.intValue(), jVar2, textData, 1));
            }
        }
        return Unit.f186387a;
    }
}

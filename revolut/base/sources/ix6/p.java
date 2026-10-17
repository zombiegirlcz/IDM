package ix6;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceItemPayload;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceCreateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InvoiceCreateScreen invoiceCreateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceCreateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        final InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarF3 = this.v.d();
        Intrinsics.h(textData);
        com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) b0VarF3;
        w80.b bVar = gVar.o;
        cli.y yVar = gVar.z;
        Intrinsics.checkNotNullParameter(textData, "textData");
        FreelancerInvoice freelancerInvoiceJ2 = gVar.J2();
        if (freelancerInvoiceJ2 != null) {
            xi0.b bVar2 = freelancerInvoiceJ2.i;
            String str = textData.f52597a;
            CharSequence charSequence = textData.f52598b;
            final int i = 0;
            FreelancerInvoiceItemPayload freelancerInvoiceItemPayloadA = null;
            if (kotlin.text.a0.H(str, "ITEM_ID_ITEM", false)) {
                String strV0 = kotlin.text.d0.v0(str, ":", str);
                Iterator it8 = freelancerInvoiceJ2.f73387t.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (Intrinsics.f(((FreelancerInvoiceItemPayload) next).f73393a, strV0)) {
                        break;
                    }
                }
                final FreelancerInvoiceItemPayload freelancerInvoiceItemPayload = (FreelancerInvoiceItemPayload) next;
                if (freelancerInvoiceItemPayload != null) {
                    if (kotlin.text.a0.H(str, "ITEM_ID_ITEM_DESCRIPTION", false)) {
                        final int i2 = 1;
                        gVar.H2(yVar, new Function1() { // from class: ix6.f0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i3 = i2;
                                InputTextDelegate.TextData textData2 = textData;
                                FreelancerInvoiceItemPayload freelancerInvoiceItemPayload2 = freelancerInvoiceItemPayload;
                                switch (i3) {
                                    case 0:
                                        com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a update = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) obj3;
                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                        LinkedHashMap linkedHashMapZ = r0.z(update.d);
                                        String str2 = freelancerInvoiceItemPayload2.f73393a;
                                        a.c cVar = (a.c) linkedHashMapZ.get(str2);
                                        linkedHashMapZ.put(str2, cVar != null ? a.c.a(cVar, false, null, textData2.f52598b.toString(), null, 11) : new a.c((String) null, textData2.f52598b.toString(), (String) null, 11));
                                        Unit unit = Unit.f186387a;
                                        return com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a.a(update, null, null, null, linkedHashMapZ, null, null, LDSFile.EF_SOD_TAG);
                                    default:
                                        com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a update2 = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) obj3;
                                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                                        LinkedHashMap linkedHashMapZ2 = r0.z(update2.d);
                                        String str3 = freelancerInvoiceItemPayload2.f73393a;
                                        a.c cVar2 = (a.c) linkedHashMapZ2.get(str3);
                                        linkedHashMapZ2.put(str3, cVar2 != null ? a.c.a(cVar2, false, textData2.f52598b.toString(), null, null, 13) : new a.c(textData2.f52598b.toString(), (String) null, (String) null, 13));
                                        Unit unit2 = Unit.f186387a;
                                        return com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a.a(update2, null, null, null, linkedHashMapZ2, null, null, LDSFile.EF_SOD_TAG);
                                }
                            }
                        });
                        freelancerInvoiceItemPayloadA = FreelancerInvoiceItemPayload.a(freelancerInvoiceItemPayload, charSequence.toString(), null, 0.0d, null, null, 509);
                    } else if (kotlin.text.a0.H(str, "ITEM_ID_ITEM_QUANTITY_AMOUNT", false)) {
                        gVar.H2(yVar, new Function1() { // from class: ix6.f0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i3 = i;
                                InputTextDelegate.TextData textData2 = textData;
                                FreelancerInvoiceItemPayload freelancerInvoiceItemPayload2 = freelancerInvoiceItemPayload;
                                switch (i3) {
                                    case 0:
                                        com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a update = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) obj3;
                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                        LinkedHashMap linkedHashMapZ = r0.z(update.d);
                                        String str2 = freelancerInvoiceItemPayload2.f73393a;
                                        a.c cVar = (a.c) linkedHashMapZ.get(str2);
                                        linkedHashMapZ.put(str2, cVar != null ? a.c.a(cVar, false, null, textData2.f52598b.toString(), null, 11) : new a.c((String) null, textData2.f52598b.toString(), (String) null, 11));
                                        Unit unit = Unit.f186387a;
                                        return com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a.a(update, null, null, null, linkedHashMapZ, null, null, LDSFile.EF_SOD_TAG);
                                    default:
                                        com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a update2 = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) obj3;
                                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                                        LinkedHashMap linkedHashMapZ2 = r0.z(update2.d);
                                        String str3 = freelancerInvoiceItemPayload2.f73393a;
                                        a.c cVar2 = (a.c) linkedHashMapZ2.get(str3);
                                        linkedHashMapZ2.put(str3, cVar2 != null ? a.c.a(cVar2, false, textData2.f52598b.toString(), null, null, 13) : new a.c(textData2.f52598b.toString(), (String) null, (String) null, 13));
                                        Unit unit2 = Unit.f186387a;
                                        return com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a.a(update2, null, null, null, linkedHashMapZ2, null, null, LDSFile.EF_SOD_TAG);
                                }
                            }
                        });
                        Double dK = kotlin.text.y.k(charSequence.toString());
                        freelancerInvoiceItemPayloadA = FreelancerInvoiceItemPayload.a(freelancerInvoiceItemPayload, null, null, dK != null ? dK.doubleValue() : 0.0d, null, null, 503);
                    } else if (kotlin.text.a0.H(str, "ITEM_ID_ITEM_PRICE_PER_UNIT", false)) {
                        long jB = bVar.b(charSequence.toString(), bVar2.f306286a);
                        gVar.H2(yVar, new is6.t(freelancerInvoiceItemPayload, bVar.d(jB, bVar2.f306286a), 17));
                        freelancerInvoiceItemPayloadA = FreelancerInvoiceItemPayload.a(freelancerInvoiceItemPayload, null, null, 0.0d, dj0.d.c(freelancerInvoiceItemPayload.e, jB, null, 2), null, 495);
                    }
                    if (freelancerInvoiceItemPayloadA != null) {
                        gVar.O2(com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g.M2(gVar, freelancerInvoiceItemPayloadA));
                    }
                }
            } else if (str.equals("ITEM_ID_ADDITIONAL_OPTIONS_EMAIL_MESSAGE_INPUT")) {
                String string = charSequence.toString();
                String str2 = string.length() == 0 ? null : string;
                gVar.H2(yVar, new ik3.a(str2, 13));
                gVar.N2(FreelancerInvoice.a(freelancerInvoiceJ2, null, null, null, null, null, str2, null, null, 65011711));
            }
        }
        return Unit.f186387a;
    }
}

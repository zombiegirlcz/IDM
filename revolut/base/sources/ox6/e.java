package ox6;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceItemPayload;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTax;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTaxRate;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.invoice.details.screen.InvoiceDetailsScreen;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;
import vkm.j2;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ InvoiceDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InvoiceDetailsScreen invoiceDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = invoiceDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FreelancerInvoice invoice;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a) this.u.d();
        j jVar = (j) ((i) ((j2) aVar2.f73872x.f22677a).getValue()).f230624a.getContent();
        if (jVar != null && (invoice = jVar.f230625a) != null) {
            j60.a aVar3 = aVar2.f73866p;
            xy6.c cVar = aVar2.v;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(invoice, "invoice");
            ArrayList<FreelancerInvoiceTax> arrayList = invoice.f73386s;
            ArrayList<xy6.a> arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (FreelancerInvoiceTax freelancerInvoiceTax : arrayList) {
                List list = invoice.f73387t;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list) {
                    List list2 = ((FreelancerInvoiceItemPayload) obj3).i;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it8 = list2.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                break;
                            }
                            if (Intrinsics.f(((FreelancerInvoiceTax) it8.next()).f73416a.f73418a, freelancerInvoiceTax.f73416a.f73418a)) {
                                arrayList3.add(obj3);
                                break;
                            }
                        }
                    }
                }
                arrayList2.add(new xy6.a(freelancerInvoiceTax, arrayList3));
            }
            rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.freelancer_vat_breakdown, null, null, 14), null, null, 30);
            ArrayList arrayList4 = new ArrayList(w.t(arrayList2, 10));
            for (xy6.a aVar4 : arrayList2) {
                FreelancerInvoiceTaxRate freelancerInvoiceTaxRate = aVar4.f309617a.f73416a;
                String str = freelancerInvoiceTaxRate.f73418a;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_vat_value, u.c(cVar.f309619a.b(freelancerInvoiceTaxRate)), null, 12);
                int i = R$drawable.uikit_icn_16_info_outline;
                ArrayList arrayList5 = aVar4.f309618b;
                dj0.d.Companion.getClass();
                dj0.d dVarO = dj0.d.e;
                int i2 = 0;
                for (Object obj4 : arrayList5) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO = i2 == 0 ? ((FreelancerInvoiceItemPayload) obj4).f73397h : pyd.c.O(dVarO, ((FreelancerInvoiceItemPayload) obj4).f73397h);
                    i2 = i3;
                }
                arrayList4.add(new CellDetailsDelegate.Model(str, textLocalisedClause, new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), i, aVar4, null, null, null, null, false, 0, 0, 32736));
            }
            ArrayList arrayListF0 = d0.F0(new CellDetailsDelegate.Model("ITEM_ID_ITEMS_VAT_SUM_BOTTOM_DIALOG", new TextLocalisedClause(R$string.freelancer_vat_total, null, null, 14), new MoneyClause(invoice.f73380l, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), arrayList4);
            yp0.b.k(arrayListF0, 0, 0, 0, 0, 31);
            aVar3.x(new y(arrayListF0, tVar, rp0.l.WINDOW, null, null, null, "DELEGATES_KEY_CREATE_INVOICE", null, null, null, 3832));
        }
        return Unit.f186387a;
    }
}

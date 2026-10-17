package s57;

import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData;
import com.revolut.feature.pro.accounts.impl.R$plurals;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r10.v;
import sr6.n;
import yhm.o;
import yhm.r;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ m B;
    public final /* synthetic */ String C;
    public y57.e u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y57.d f260023w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f260024x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Set f260025y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, String str, Continuation continuation) {
        super(2, continuation);
        this.B = mVar;
        this.C = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.B, this.C, continuation);
        hVar.A = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y57.d salesDetails;
        Set availableSaleTypes;
        y57.e eVar;
        Object objU;
        List invoices;
        String widgetId;
        boolean z;
        int i;
        r rVar = (r) this.A;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.z;
        if (i2 == 0) {
            o.b(obj2);
            salesDetails = (y57.d) rVar.f314201a;
            List list = (List) rVar.f314202b;
            availableSaleTypes = (Set) rVar.f314203c;
            m mVar = this.B;
            eVar = mVar.f260037l;
            v vVar = mVar.i;
            cs6.a aVar2 = cs6.a.E_COMMERCE;
            this.A = null;
            this.u = eVar;
            String str = this.C;
            this.v = str;
            this.f260023w = salesDetails;
            this.f260024x = list;
            this.f260025y = availableSaleTypes;
            this.z = 1;
            objU = vVar.u(aVar2, this);
            if (objU == aVar) {
                return aVar;
            }
            invoices = list;
            widgetId = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            availableSaleTypes = this.f260025y;
            invoices = this.f260024x;
            salesDetails = this.f260023w;
            String str2 = this.v;
            y57.e eVar2 = this.u;
            o.b(obj2);
            widgetId = str2;
            eVar = eVar2;
            objU = obj2;
        }
        Boolean bool = (Boolean) objU;
        boolean zBooleanValue = bool.booleanValue();
        aia.c cVar = eVar.f311000a;
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(salesDetails, "salesDetails");
        Intrinsics.checkNotNullParameter(invoices, "invoices");
        Intrinsics.checkNotNullParameter(availableSaleTypes, "availableSaleTypes");
        Set<cs6.c> set = availableSaleTypes;
        if ((set instanceof Collection) && set.isEmpty()) {
            z = false;
        } else {
            for (cs6.c cVar2 : set) {
                cs6.c.Companion.getClass();
                if (cs6.c.inPersonSaleTypes.contains(cVar2)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        boolean zContains = availableSaleTypes.contains(cs6.c.PAYMENT_LINK);
        boolean zContains2 = availableSaleTypes.contains(cs6.c.INVOICE);
        List listK = zhm.v.k(Boolean.valueOf(z), Boolean.valueOf(zContains), Boolean.valueOf(zContains2), bool);
        if ((listK instanceof Collection) && listK.isEmpty()) {
            i = 0;
        } else {
            Iterator it8 = listK.iterator();
            i = 0;
            while (it8.hasNext()) {
                if (((Boolean) it8.next()).booleanValue() && (i = i + 1) < 0) {
                    zhm.v.r();
                    throw null;
                }
            }
        }
        boolean z3 = i >= 4;
        aim.e eVarB = u.b();
        if (z) {
            int i3 = salesDetails.f310998b;
            eVarB.add(y57.e.a("ITEM_LIST_ID_IN_PERSON_SALES", R$drawable.uikit_icn_24_card_terminal, z3 ? new TextLocalisedClause(R$string.freelancer_sales_widget_in_person_title_short, null, null, 14) : new TextLocalisedClause(com.revolut.feature.pro.accounts.impl.R$string.freelancer_sales_widget_in_person_title, null, null, 14), new TextLocalisedQuantityClause(R$plurals.freelancer_sales_widget_in_person_subtitle, Integer.valueOf(i3), u.c(Integer.valueOf(i3)), (Style) null, 24), FreelancerWidgetClickData.Sales.InPerson.f74456a));
        }
        if (zContains) {
            int i5 = salesDetails.f310999c;
            eVarB.add(y57.e.a("ITEM_LIST_ID_PAYMENT_LINK_SALES", R$drawable.uikit_icn_24_link, z3 ? new TextLocalisedClause(R$string.freelancer_sales_widget_payment_links_title_short, null, null, 14) : new TextLocalisedClause(com.revolut.feature.pro.accounts.impl.R$string.freelancer_sales_widget_payment_links_title, null, null, 14), new TextLocalisedQuantityClause(R$plurals.freelancer_sales_widget_payment_links_subtitle, Integer.valueOf(i5), u.c(Integer.valueOf(i5)), (Style) null, 24), FreelancerWidgetClickData.Sales.PaymentLinks.f74458a));
        }
        if (zContains2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : invoices) {
                if (((FreelancerInvoice) obj3).f73378h == n.PAID) {
                    arrayList.add(obj3);
                }
            }
            int size = arrayList.size();
            eVarB.add(y57.e.a("ITEM_LIST_ID_INVOICES_SALES", R$drawable.uikit_icn_24_document, z3 ? new TextLocalisedClause(R$string.freelancer_sales_widget_invoices_title_short, null, null, 14) : new TextLocalisedClause(com.revolut.feature.pro.accounts.impl.R$string.freelancer_sales_widget_invoices_title, null, null, 14), new TextLocalisedQuantityClause(R$plurals.freelancer_sales_widget_invoices_subtitle, Integer.valueOf(size), u.c(Integer.valueOf(size)), (Style) null, 24), FreelancerWidgetClickData.Sales.Invoices.f74457a));
        }
        if (zBooleanValue) {
            int i6 = salesDetails.f310997a;
            eVarB.add(y57.e.a("ITEM_LIST_ID_ECOMMERCE", R$drawable.uikit_icn_24_merchant, z3 ? new TextLocalisedClause(R$string.freelancer_sales_widget_ecommerce_title_short, null, null, 14) : new TextLocalisedClause(R$string.freelancer_sales_widget_ecommerce_title, null, null, 14), new TextLocalisedQuantityClause(R$plurals.freelancer_sales_widget_in_person_subtitle, Integer.valueOf(i6), u.c(Integer.valueOf(i6)), (Style) null, 24), FreelancerWidgetClickData.Sales.Ecommerce.f74455a));
        }
        return new ContactsWidgetDelegate.Model(widgetId, u.a(eVarB), new TextLocalisedClause(R$string.freelancer_widget_sales_header_title, null, null, 14), z3, null, null, 48);
    }
}

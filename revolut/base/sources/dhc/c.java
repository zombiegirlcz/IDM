package dhc;

import chc.b0;
import chc.v;
import chc.w;
import chc.x;
import chc.z;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static final RentAndBillsLinkedPayments.Category.LinkedPayment a(w wVar) {
        com.revolut.feature.rewards.api.model.rent_and_bills.a aVar;
        com.revolut.feature.rewards.api.model.rent_and_bills.b bVar;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        String str = wVar.f24180a;
        v vVar = wVar.f24181b;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        String str2 = vVar.f24178a;
        String str3 = vVar.f24179b;
        com.revolut.feature.rewards.api.model.rent_and_bills.b[] bVarArrValues = com.revolut.feature.rewards.api.model.rent_and_bills.b.values();
        int length = bVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            aVar = null;
            if (i2 >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i2];
            if (a0.z(bVar.name(), str3, true)) {
                break;
            }
            i2++;
        }
        if (bVar == null) {
            bVar = com.revolut.feature.rewards.api.model.rent_and_bills.b.UNKNOWN;
        }
        RentAndBillsLinkedPayments.Category.LinkedPayment.Payment payment = new RentAndBillsLinkedPayments.Category.LinkedPayment.Payment(str2, bVar);
        String str4 = wVar.f24182c;
        com.revolut.feature.rewards.api.model.rent_and_bills.a[] aVarArrValues = com.revolut.feature.rewards.api.model.rent_and_bills.a.values();
        int length2 = aVarArrValues.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            com.revolut.feature.rewards.api.model.rent_and_bills.a aVar2 = aVarArrValues[i];
            if (a0.z(aVar2.name(), str4, true)) {
                aVar = aVar2;
                break;
            }
            i++;
        }
        if (aVar == null) {
            aVar = com.revolut.feature.rewards.api.model.rent_and_bills.a.UNKNOWN;
        }
        return new RentAndBillsLinkedPayments.Category.LinkedPayment(str, payment, aVar, wVar.d, Instant.parse(wVar.e).toEpochMilli());
    }

    public static final RentAndBillsLinkedPayments.Category b(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        List list = xVar.f24184b;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(a((w) it8.next()));
        }
        List list2 = xVar.f24185c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            RentAndBillsLinkedPayments.FaqItem faqItemC = c((z) it9.next());
            if (faqItemC != null) {
                arrayList2.add(faqItemC);
            }
        }
        return new RentAndBillsLinkedPayments.Category(arrayList, arrayList2);
    }

    public static final RentAndBillsLinkedPayments.FaqItem c(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        if (zVar instanceof z.c) {
            return new RentAndBillsLinkedPayments.FaqItem.Topic(((z.c) zVar).f24191b);
        }
        if (zVar instanceof z.b) {
            z.b bVar = (z.b) zVar;
            return new RentAndBillsLinkedPayments.FaqItem.Deeplink(bVar.f24187b, bVar.f24188c);
        }
        if (zVar instanceof z.d) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final RentAndBillsLinkedPayments d(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        RentAndBillsLinkedPayments.Category categoryB = b(b0Var.f24150a);
        RentAndBillsLinkedPayments.Category categoryB2 = b(b0Var.f24151b);
        List list = b0Var.f24152c;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            RentAndBillsLinkedPayments.FaqItem faqItemC = c((z) it8.next());
            if (faqItemC != null) {
                arrayList.add(faqItemC);
            }
        }
        return new RentAndBillsLinkedPayments(categoryB, categoryB2, arrayList);
    }

    public static final x e(RentAndBillsLinkedPayments.Category category, String type) {
        Intrinsics.checkNotNullParameter(category, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList<RentAndBillsLinkedPayments.Category.LinkedPayment> arrayList = category.f84789a;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (RentAndBillsLinkedPayments.Category.LinkedPayment linkedPayment : arrayList) {
            Intrinsics.checkNotNullParameter(linkedPayment, "<this>");
            String str = linkedPayment.f84791a;
            RentAndBillsLinkedPayments.Category.LinkedPayment.Payment payment = linkedPayment.f84792b;
            Intrinsics.checkNotNullParameter(payment, "<this>");
            v vVar = new v(payment.f84794a, payment.f84795b.name());
            String strName = linkedPayment.f84793c.name();
            double d = linkedPayment.d;
            String string = Instant.ofEpochMilli(linkedPayment.e).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList2.add(new w(str, vVar, strName, d, string));
        }
        ArrayList arrayList3 = category.f84790b;
        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
        Iterator it8 = arrayList3.iterator();
        while (it8.hasNext()) {
            arrayList4.add(f((RentAndBillsLinkedPayments.FaqItem) it8.next()));
        }
        return new x(arrayList2, arrayList4, type);
    }

    public static final z f(RentAndBillsLinkedPayments.FaqItem faqItem) {
        Intrinsics.checkNotNullParameter(faqItem, "<this>");
        if (faqItem instanceof RentAndBillsLinkedPayments.FaqItem.Topic) {
            return new z.c(((RentAndBillsLinkedPayments.FaqItem.Topic) faqItem).f84798a);
        }
        if (!(faqItem instanceof RentAndBillsLinkedPayments.FaqItem.Deeplink)) {
            throw new NoWhenBranchMatchedException();
        }
        RentAndBillsLinkedPayments.FaqItem.Deeplink deeplink = (RentAndBillsLinkedPayments.FaqItem.Deeplink) faqItem;
        return new z.b(deeplink.f84796a, deeplink.f84797b);
    }
}

package bkc;

import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static final Set a(RentAndBillsLinkedPayments rentAndBillsLinkedPayments) {
        Intrinsics.checkNotNullParameter(rentAndBillsLinkedPayments, "<this>");
        ArrayList arrayListE0 = d0.E0(rentAndBillsLinkedPayments.f84787b.f84789a, rentAndBillsLinkedPayments.f84786a.f84789a);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : arrayListE0) {
            if (((RentAndBillsLinkedPayments.Category.LinkedPayment) obj2).f84793c == com.revolut.feature.rewards.api.model.rent_and_bills.a.LINKED) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((RentAndBillsLinkedPayments.Category.LinkedPayment) it8.next()).f84792b.f84794a);
        }
        return d0.i1(arrayList2);
    }

    public static final ArrayList b(RentAndBillsLinkedPayments rentAndBillsLinkedPayments, egc.a categoryType) {
        Intrinsics.checkNotNullParameter(rentAndBillsLinkedPayments, "<this>");
        Intrinsics.checkNotNullParameter(categoryType, "categoryType");
        List listC = c(rentAndBillsLinkedPayments, categoryType);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listC) {
            if (((RentAndBillsLinkedPayments.Category.LinkedPayment) obj2).f84793c == com.revolut.feature.rewards.api.model.rent_and_bills.a.LINKED) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final List c(RentAndBillsLinkedPayments rentAndBillsLinkedPayments, egc.a categoryType) {
        Intrinsics.checkNotNullParameter(rentAndBillsLinkedPayments, "<this>");
        Intrinsics.checkNotNullParameter(categoryType, "categoryType");
        int i = b.f16351a[categoryType.ordinal()];
        if (i == 1) {
            return rentAndBillsLinkedPayments.f84786a.f84789a;
        }
        if (i == 2) {
            return rentAndBillsLinkedPayments.f84787b.f84789a;
        }
        throw new NoWhenBranchMatchedException();
    }
}

package er9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q5g.c0;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f128555b;

    public /* synthetic */ a(List list, int i) {
        this.f128554a = i;
        this.f128555b = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f128554a) {
            case 0:
                Map contactsMap = (Map) obj2;
                Map revolutContactsMap = (Map) obj3;
                Intrinsics.checkNotNullParameter(contactsMap, "contactsMap");
                Intrinsics.checkNotNullParameter(revolutContactsMap, "revolutContactsMap");
                List<PaymentGroup> list = this.f128555b;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (PaymentGroup paymentGroup : list) {
                    List list2 = paymentGroup.d;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(r10.f.m0((oq9.o) it8.next(), contactsMap, revolutContactsMap));
                    }
                    arrayList.add(PaymentGroup.a(paymentGroup, arrayList2));
                }
                return arrayList;
            case 1:
                Map contactsMap2 = (Map) obj2;
                Map revolutContactsMap2 = (Map) obj3;
                Intrinsics.checkNotNullParameter(contactsMap2, "contactsMap");
                Intrinsics.checkNotNullParameter(revolutContactsMap2, "revolutContactsMap");
                List list3 = this.f128555b;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(r10.f.m0((oq9.o) it9.next(), contactsMap2, revolutContactsMap2));
                }
                return arrayList3;
            case 2:
                Function1 items = (Function1) obj3;
                Intrinsics.checkNotNullParameter(items, "items");
                List list4 = this.f128555b;
                yp0.b.k(list4, 0, 0, 0, 0, 31);
                return d0.E0((Iterable) items.invoke(new iii.d(10, null, true, false, "id_credit_card_statement_details_error_transactions")), list4);
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new c0(q4g.b.a(6, null, true), a.C0565a.f93309a, this.f128555b);
            case 4:
                Function1 defaultItemsFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultItemsFactory, "defaultItemsFactory");
                return new s43.k(this.f128555b, false, (List) defaultItemsFactory.invoke(new iii.d(12, null, true, true, null)));
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return this.f128555b;
        }
    }

    public /* synthetic */ a(List list, r10.f fVar, int i) {
        this.f128554a = i;
        this.f128555b = list;
    }
}

package mce;

import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import h9e.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    @NotNull
    public static final C1157a Companion = new C1157a();

    /* JADX INFO: renamed from: mce.a$a, reason: collision with other inner class name */
    public static final class C1157a {
        private C1157a() {
        }
    }

    public static RecurringPaymentFilter.Or a(String str) {
        return new RecurringPaymentFilter.Or(new RecurringPaymentFilter.BySourceCurrency(str), new RecurringPaymentFilter.And(new RecurringPaymentFilter.BySourceCurrency(null), new RecurringPaymentFilter.ByCurrency(str)));
    }

    public final RecurringPaymentFilter.And b(g source) {
        Intrinsics.checkNotNullParameter(source, "source");
        boolean z = source instanceof h9e.b;
        RecurringPaymentFilter.ByPendingRefund byPendingRefund = RecurringPaymentFilter.ByPendingRefund.f89330a;
        RecurringPaymentFilter.ByActiveFromNow byActiveFromNow = RecurringPaymentFilter.ByActiveFromNow.f89324a;
        if (z) {
            return new RecurringPaymentFilter.And(byActiveFromNow, new RecurringPaymentFilter.Or(new RecurringPaymentFilter.ByNextDateFromNow(3), byPendingRefund), a(((h9e.b) source).f150231a.f163147c));
        }
        if (source instanceof h9e.c) {
            h9e.c cVar = (h9e.c) source;
            List list = cVar.f150232a;
            fo3.c cVar2 = cVar.f150233b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                xi0.a aVar = xi0.b.Companion;
                String str = ((io3.d) obj2).f163147c;
                aVar.getClass();
                if (xi0.a.a(str).equals(cVar2.d)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((io3.d) it8.next()).f163145a);
            }
            return new RecurringPaymentFilter.And(byActiveFromNow, new RecurringPaymentFilter.Or(new RecurringPaymentFilter.ByNextDateFromNow(3), byPendingRefund), new RecurringPaymentFilter.Or(new RecurringPaymentFilter.BySourcePocketIdSet(d0.i1(arrayList2)), new RecurringPaymentFilter.BySourcePocketId(null)), a(cVar2.d.f306286a));
        }
        if (source instanceof h9e.d) {
            io3.d dVar = ((h9e.d) source).f150234a;
            return new RecurringPaymentFilter.And(byActiveFromNow, new RecurringPaymentFilter.Or(new RecurringPaymentFilter.ByNextDateFromNow(3), byPendingRefund), a(dVar.f163147c), new RecurringPaymentFilter.Or(new RecurringPaymentFilter.BySourcePocketId(dVar.f163145a), new RecurringPaymentFilter.BySourcePocketId(null)));
        }
        if (source instanceof h9e.a) {
            h9e.a aVar2 = (h9e.a) source;
            return new RecurringPaymentFilter.And(byActiveFromNow, new RecurringPaymentFilter.Or(new RecurringPaymentFilter.ByNextDateFromNow(7), byPendingRefund), new RecurringPaymentFilter.Or(new RecurringPaymentFilter.ByReceiverId(y0.b(aVar2.f150229a)), new RecurringPaymentFilter.BySourcePocketId(aVar2.f150230b)));
        }
        if (source instanceof h9e.e) {
            io3.d dVar2 = ((h9e.e) source).f150235a;
            return new RecurringPaymentFilter.And(byActiveFromNow, new RecurringPaymentFilter.Or(new RecurringPaymentFilter.ByNextDateFromNow(3), byPendingRefund), a(dVar2.f163147c), new RecurringPaymentFilter.BySourcePocketId(dVar2.f163145a));
        }
        if (!(source instanceof h9e.f)) {
            throw new NoWhenBranchMatchedException();
        }
        RecurringPaymentFilter.Or or10 = new RecurringPaymentFilter.Or(new RecurringPaymentFilter.ByNextDateFromNow(3), byPendingRefund);
        List list2 = ((h9e.f) source).f150236a;
        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList3.add(((io3.d) it9.next()).f163145a);
        }
        return new RecurringPaymentFilter.And(byActiveFromNow, or10, new RecurringPaymentFilter.BySourcePocketIdSet(d0.i1(arrayList3)));
    }
}

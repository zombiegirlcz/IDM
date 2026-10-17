package n1g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingTransaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nyb.m0;
import tof.s9;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m0 f211323l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final whf.b f211324m;

    public a0(m0 revPointsTransactionsInteractor, whf.b transactionsListContentProvider) {
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsListContentProvider, "transactionsListContentProvider");
        this.f211323l = revPointsTransactionsInteractor;
        this.f211324m = transactionsListContentProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    public final Flow Z2(TravelExperiencesBooking booking) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(booking, "booking");
        List list = booking.f92755p;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((TravelExperiencesBookingTransaction) obj2).d == iyf.f.CORE) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = new ArrayList(zhm.w.t(arrayList2, 10));
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((TravelExperiencesBookingTransaction) it8.next()).f92767a);
            }
        } else {
            arrayList = f0.f322471a;
        }
        if (arrayList.isEmpty()) {
            return new go.g(new Data(null, null, false, 7, null), 2);
        }
        return rd0.e.b(whf.b.a(this.f211324m, te0.w.h(new s9(d0.i1((Iterable) arrayList))), null, null, null, 14));
    }
}

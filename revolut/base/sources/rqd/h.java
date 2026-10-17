package rqd;

import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vkm.y;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppk.f f256529a;

    public h(ppk.f ratesInteractor) {
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f256529a = ratesInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3 A[PHI: r5
      0x00a3: PHI (r5v3 tof.a3) = (r5v2 tof.a3), (r5v7 tof.a3) binds: [B:21:0x008e, B:27:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final vkm.y a(java.util.List r10, java.util.List r11, java.util.List r12) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rqd.h.a(java.util.List, java.util.List, java.util.List):vkm.y");
    }

    public final y b(List destinations, List additionalCurrencies, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(additionalCurrencies, "additionalCurrencies");
        List list = destinations;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            v1.c.A(arrayList, targetCurrency, tpd.a.a((IncomeSorterDestinationInfo) it8.next()));
        }
        List list2 = additionalCurrencies;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            v1.c.A(arrayList2, targetCurrency, (xi0.b) it9.next());
        }
        return cj9.c.y(rd0.e.b(this.f256529a.b(d0.U(d0.E0(arrayList2, arrayList)), false)));
    }
}

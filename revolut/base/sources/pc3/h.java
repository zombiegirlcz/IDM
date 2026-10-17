package pc3;

import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ub3.e f234819a;

    public h(ub3.e commonMapper) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        this.f234819a = commonMapper;
    }

    @Override // jki.p
    public final m a(i iVar) {
        ArrayList arrayList;
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState.d) {
            arrayList = new ArrayList(20);
            for (int i = 0; i < 20; i++) {
                arrayList.add(new pb0(a0.d.n("loading_", i)));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        } else {
            List list = domainState.f234813c;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList2.add(this.f234819a.a((CashTopUpLocationInfo) it8.next()));
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            arrayList = arrayList2;
        }
        return new f(arrayList);
    }
}

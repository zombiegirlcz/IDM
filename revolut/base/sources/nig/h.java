package nig;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import fub.k;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pyb.s;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f216106a;

    public h(k revPointsTransactionMapper) {
        Intrinsics.checkNotNullParameter(revPointsTransactionMapper, "revPointsTransactionMapper");
        this.f216106a = revPointsTransactionMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        ArrayList arrayList;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<lk0.e> list = domainState.f216094a.f196174a;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        for (lk0.e eVar : list) {
            if (eVar.f196171a.isEmpty() && eVar.f196173c) {
                arrayList = new ArrayList(3);
                for (int i = 0; i < 3; i++) {
                    arrayList.add(new pb0(a0.d.n("LOADING_ITEM_ID_", i)));
                }
            } else {
                List list2 = eVar.f196171a;
                ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(((s) this.f216106a).e((RevPointsTransaction) it8.next(), new TimeClause.Format.Pretty(q0.DATETIME)));
                }
                arrayList = arrayList3;
            }
            arrayList2.add(arrayList);
        }
        ArrayList arrayListU = w.u(arrayList2);
        yp0.b.k(arrayListU, 0, 0, 0, 0, 31);
        return new c(domainState.f216095b, arrayListU, domainState.f216096c);
    }
}

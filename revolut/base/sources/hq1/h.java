package hq1;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements n {
    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f154583a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(gq1.b.a((Bill) it8.next()));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new e(arrayList);
    }
}

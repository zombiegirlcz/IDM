package glc;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ql6.s;
import zh9.u0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public interface a {
    static Flow a(a aVar, String portfolioId) {
        qmc.h hVar = (qmc.h) aVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new qc3.c(hVar, null, 25), rd0.e.b(hVar.f247801a.B(portfolioId, loadingStrategy)));
    }

    static j23.b b(qmc.h hVar, ArrayList portfolioIds) {
        Intrinsics.checkNotNullParameter(portfolioIds, "portfolioIds");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        ArrayList arrayList = new ArrayList(w.t(portfolioIds, 10));
        Iterator it8 = portfolioIds.iterator();
        while (it8.hasNext()) {
            arrayList.add(a(hVar, (String) it8.next()));
        }
        return u0.k(arrayList);
    }

    static Flow c(a aVar) {
        qmc.h hVar = (qmc.h) aVar;
        hVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new qmc.g(hVar, null), nim.a.v(ybl.k.k(hVar.f247803c, null, null, null, 7), new s(16)));
    }
}

package n0k;

import ael.k;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rzj.g;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f211053a;

    public f(ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f211053a = instrumentTickerInteractor;
    }

    public static ArrayList c(WealthNewsArticle wealthNewsArticle) {
        List list = wealthNewsArticle.f101802j;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            xi0.b bVar = new xi0.b(6, (String) obj2, null);
            if (!cp5.d.y(bVar) && !cp5.d.A(bVar) && !cp5.d.z(bVar)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // n0k.a
    public final boolean a(g assetType) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        return assetType == g.STOCKS;
    }

    @Override // n0k.a
    public final r b(List articles) {
        Intrinsics.checkNotNullParameter(articles, "articles");
        List list = articles;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(c((WealthNewsArticle) it8.next()));
        }
        List listN = c6d.b.N(d0.U(w.u(arrayList)));
        if (listN != null) {
            return nim.a.w(((k) this.f211053a).i(listN, n9l.b.SEC_3), new lsl.d(19, this, articles));
        }
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            arrayList2.add(new rzj.a((WealthNewsArticle) it9.next(), f0.f322471a));
        }
        return zi0.c.j(arrayList2);
    }
}

package n0k;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import n09.j0;
import rzj.g;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f211052a;

    public d(ImmutableSet performanceTransformers) {
        Intrinsics.checkNotNullParameter(performanceTransformers, "performanceTransformers");
        this.f211052a = performanceTransformers;
    }

    public static ArrayList b(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new rzj.a((WealthNewsArticle) it8.next(), f0.f322471a));
        }
        return arrayList;
    }

    public final r a(g assetType, List articles) {
        Object next;
        r rVarB;
        r rVarZ;
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(articles, "articles");
        if (articles.isEmpty()) {
            return zi0.c.j(f0.f322471a);
        }
        Iterator it8 = this.f211052a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((a) next).a(assetType)) {
                break;
            }
        }
        a aVar = (a) next;
        return (aVar == null || (rVarB = aVar.b(articles)) == null || (rVarZ = nim.a.z(rVarB, new j0(this, articles, 4))) == null) ? zi0.c.j(b(articles)) : rVarZ;
    }
}

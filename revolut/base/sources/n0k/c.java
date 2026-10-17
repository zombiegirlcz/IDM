package n0k;

import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import e7l.g;
import efm.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import mx0.v9;
import n09.j0;
import ufm.g;
import zhm.d0;
import zjh.i;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f211049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f211050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3.a f211051c;

    public c(g performanceInteractor, i currencyPairsDelegate, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(performanceInteractor, "performanceInteractor");
        Intrinsics.checkNotNullParameter(currencyPairsDelegate, "currencyPairsDelegate");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f211049a = performanceInteractor;
        this.f211050b = currencyPairsDelegate;
        this.f211051c = configurationInteractor;
    }

    public static List c(WealthNewsArticle wealthNewsArticle, Set set) {
        List list = wealthNewsArticle.f101802j;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            String str = (String) obj2;
            xi0.b bVar = new xi0.b(6, str, null);
            if (cp5.d.z(bVar) || cp5.d.y(bVar)) {
                if (set.contains(str)) {
                    arrayList.add(obj2);
                }
            }
        }
        return wealthNewsArticle.f101801h == rzj.g.CRYPTO ? arrayList : d0.V0(arrayList, 2);
    }

    @Override // n0k.a
    public final boolean a(rzj.g assetType) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        return assetType == rzj.g.CRYPTO || assetType == rzj.g.COMMODITIES;
    }

    @Override // n0k.a
    public final r b(List articles) {
        Intrinsics.checkNotNullParameter(articles, "articles");
        return pd.b.r(nim.a.w(((ik3.c) this.f211051c).k(g.b.f123407a), new v9(1, this, c.class, "getSupportedCurrencyCodes", "getSupportedCurrencyCodes(Lcom/revolut/shared/feature/configuration/api/models/Config;)Ljava/util/Set;", 0, 7)), new j0(articles, this, 3));
    }
}

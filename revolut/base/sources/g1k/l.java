package g1k;

import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsFilter;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.WealthAllNewsContract$InputData;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.DateTime;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends tzl.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WealthAllNewsContract$InputData f139702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m0k.e f139703h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(WealthAllNewsContract$InputData inputData, m0k.e wealthNewsInteractor) {
        super(0);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthNewsInteractor, "wealthNewsInteractor");
        this.f139702g = inputData;
        this.f139703h = wealthNewsInteractor;
    }

    @Override // tzl.l
    public final boolean b(Object obj2, Object obj3, Object obj4) {
        j key = (j) obj2;
        List list = (List) obj3;
        Intrinsics.checkNotNullParameter(key, "key");
        int size = list != null ? list.size() : 0;
        key.getClass();
        return size >= 50;
    }

    @Override // tzl.l
    public final Object c(Object obj2) {
        Set setA = (Set) obj2;
        if (setA == null) {
            setA = x.a(this.f139702g.f101859a);
        }
        return new j(setA, null);
    }

    @Override // tzl.l
    public final Object e(Object obj2, Object obj3) {
        rzj.f fVar;
        WealthNewsArticle wealthNewsArticleD;
        j currentKey = (j) obj2;
        List list = (List) obj3;
        Intrinsics.checkNotNullParameter(currentKey, "currentKey");
        DateTime dateTime = (list == null || (fVar = (rzj.f) d0.o0(list)) == null || (wealthNewsArticleD = fVar.d()) == null) ? null : wealthNewsArticleD.e;
        Set filters = currentKey.f139699a;
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new j(filters, dateTime);
    }

    @Override // tzl.l
    public final Flow g(Object obj2, Object obj3, Object obj4) {
        WealthNewsCategory markets;
        j key = (j) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        WealthAllNewsContract$InputData wealthAllNewsContract$InputData = this.f139702g;
        WealthNewsFilter wealthNewsFilter = wealthAllNewsContract$InputData.f101859a;
        if ((wealthNewsFilter instanceof WealthNewsFilter.ByAssetFilter) || (wealthNewsFilter instanceof WealthNewsFilter.ByRef)) {
            markets = WealthNewsCategory.Stocks.f101808b;
        } else {
            if (!(wealthNewsFilter instanceof WealthNewsFilter.ByMarket)) {
                throw new NoWhenBranchMatchedException();
            }
            markets = new WealthNewsCategory.Markets(((WealthNewsFilter.ByMarket) wealthNewsFilter).f101810a);
        }
        WealthNewsCategory wealthNewsCategory = markets;
        List listD1 = d0.d1(key.f139699a);
        boolean z = !key.f139699a.isEmpty();
        DateTime dateTime = key.f139700b;
        WealthNewsFilter wealthNewsFilter2 = wealthAllNewsContract$InputData.f101859a;
        WealthNewsFilter.ByRef byRef = wealthNewsFilter2 instanceof WealthNewsFilter.ByRef ? (WealthNewsFilter.ByRef) wealthNewsFilter2 : null;
        return nim.a.v(rd0.e.b(m0k.e.b(this.f139703h, wealthNewsCategory, z, byRef != null ? byRef.f101811a : null, listD1, dateTime, null, 50, true, 32)), new k(0));
    }
}

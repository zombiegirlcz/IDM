package x0k;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsFilter;
import com.revolut.retail.feature.marketnews.api.navigation.WealthNewsFeatureConfig;
import com.revolut.retail.feature.marketnews.api.navigation.destination.WealthAllNewsDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import qzj.b;
import qzj.e;
import v3e.t;
import vkm.d;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f301650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v0k.b f301651m;

    public a(e presentationModel, v0k.b wealthNewsOverviewCommandProvider) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(wealthNewsOverviewCommandProvider, "wealthNewsOverviewCommandProvider");
        this.f301650l = presentationModel;
        this.f301651m = wealthNewsOverviewCommandProvider;
    }

    @Override // qzj.b
    public final h Z2(WealthNewsCategory category, boolean z) {
        tzj.a aVar;
        FeatureCommand featureCommand;
        Intrinsics.checkNotNullParameter(category, "category");
        this.f301651m.getClass();
        Intrinsics.checkNotNullParameter(category, "category");
        if ((category instanceof WealthNewsCategory.Markets) && z) {
            featureCommand = u0.f(new WealthAllNewsDestination(new WealthNewsFilter.ByMarket(((WealthNewsCategory.Markets) category).f101807b)));
        } else {
            int i = v0k.a.f284916a[category.f101803a.ordinal()];
            if (i == 1) {
                aVar = tzj.a.TOP_STORIES;
            } else if (i == 2) {
                aVar = tzj.a.CRYPTO;
            } else {
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Can't launch news overview with unknown asset type");
                }
                aVar = tzj.a.COMMODITIES;
            }
            featureCommand = new FeatureCommand(new WealthNewsFeatureConfig.Overview(aVar, null));
        }
        h hVar = new h(new t(this, featureCommand, 24), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // qzj.b
    public final d b3(WealthNewsCategory category, String str) {
        Intrinsics.checkNotNullParameter(category, "category");
        v0k.e eVar = (v0k.e) this.f301650l;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(category, "category");
        return rd0.e.b(category instanceof WealthNewsCategory.Markets ? nim.a.w(m0k.e.b(eVar.f284919a, (WealthNewsCategory.Markets) category, false, str, null, null, null, 5, true, 56), new uyh.t(25)) : nim.a.w(m0k.e.b(eVar.f284919a, category, true, str, null, null, null, 5, true, 56), new uyh.t(26)));
    }

    @Override // qzj.b
    public final h c3(WealthNewsArticle article) {
        Intrinsics.checkNotNullParameter(article, "article");
        h hVar = new h(new t(this, new FeatureCommand(new WealthNewsFeatureConfig.Reader(article)), 24), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // qzj.b
    public final h d3(WealthNewsCategory newsCategory) {
        Intrinsics.checkNotNullParameter(newsCategory, "newsCategory");
        h hVar = new h(new t(this, newsCategory, 25), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}

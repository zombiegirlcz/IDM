package zkh;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.wealth.api.declaration.MostTradedAssetsFeatureConfig;
import com.revolut.feature.wealth_discovery.api.CollectionUIApi$Toggles$MostTradedKompotMigration;
import com.revolut.feature.wealth_discovery.api.declaration.collection.MostTradedAssetsDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class x implements z87.d {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q9h.c f323042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jbh.e f323043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f323044c;
    public final o97.r d;

    public x(q9h.c mostTradedWidgetPresentationModel, jbh.e performanceAssetMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(mostTradedWidgetPresentationModel, "mostTradedWidgetPresentationModel");
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f323042a = mostTradedWidgetPresentationModel;
        this.f323043b = performanceAssetMapper;
        this.f323044c = featureToggleInteractor;
        this.d = o97.r.WEALTH_INSTRUMENTS_MOST_TRADED;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!kotlin.text.d0.W(searchQuery)) {
            efm.r rVarJust = efm.r.just(zi0.c.P(zhm.u.c(new o97.e0(zhm.f0.f322471a)), false, null, 3));
            Intrinsics.h(rVarJust);
            return rVarJust;
        }
        q0h.h config = new q0h.h(q0h.e.STOCK);
        q9h.c cVar = this.f323042a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(config, "config");
        efm.r map = pd.b.r(cVar.a(new q0h.h(config.f241275a)), new q2g.h(cVar, config, 10)).map(new zii.e(new zhf.f(this, 15), 16));
        Intrinsics.h(map);
        return map;
    }

    @Override // z87.f
    public final o97.r h() {
        return this.d;
    }

    @Override // z87.f
    public final Object l(String str, o97.y yVar, Continuation continuation) {
        if (Intrinsics.f(str, "SEARCH_MOST_TRADED_ASSETS_LIST_ID")) {
            return new o97.l(new FeatureCommand(((jte.d) this.f323044c).c(CollectionUIApi$Toggles$MostTradedKompotMigration.f96090c) ? u0.d(new MostTradedAssetsDestination.Stocks(0)) : new MostTradedAssetsFeatureConfig.Trading(0)));
        }
        Object obj2 = yVar.f223136b;
        return obj2 instanceof c ? new o97.d(new AssetDetailsDestination(((c) obj2).f322983a.a(), null, false, "GlobalSearch", null, null, 54)) : o97.e.f223096a;
    }
}

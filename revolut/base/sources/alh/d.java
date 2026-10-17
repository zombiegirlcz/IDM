package alh;

import afa.q;
import ai0.j;
import clh.u;
import clh.v;
import com.revolut.data.model.Data;
import com.revolut.feature.global_markets.api.navigation.GlobalMarketsFeatureConfig$IndexDetailsDestination;
import com.revolut.feature.global_markets.domain.MarketAsset;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import o97.m;
import o97.r;
import o97.y;
import org.jetbrains.annotations.NotNull;
import te0.w;
import z87.e;
import zhm.f0;
import zsc.f;
import zsc.h;
import zsc.l;
import zsc.p;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jpf.a f6264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l77.a f6265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final clh.b f6266c;
    public final b4f.b d;
    public final r e;
    public final m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.b f6267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f6268h;

    public d(f01.c uikitResources, jpf.a marketAssetsInteractor, l77.a performanceTransformer, clh.b indexesSearchWidgetMapper, b4f.b temporaryInstrumentRefProvider) {
        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
        Intrinsics.checkNotNullParameter(marketAssetsInteractor, "marketAssetsInteractor");
        Intrinsics.checkNotNullParameter(performanceTransformer, "performanceTransformer");
        Intrinsics.checkNotNullParameter(indexesSearchWidgetMapper, "indexesSearchWidgetMapper");
        Intrinsics.checkNotNullParameter(temporaryInstrumentRefProvider, "temporaryInstrumentRefProvider");
        this.f6264a = marketAssetsInteractor;
        this.f6265b = performanceTransformer;
        this.f6266c = indexesSearchWidgetMapper;
        this.d = temporaryInstrumentRefProvider;
        this.e = r.WEALTH_INDEXES;
        this.f = m.INVEST;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f6267g = bVarE;
        a aVar = new a();
        p pVar = p.WORD_PREFIX;
        this.f6268h = new h(new Pair(aVar, pVar), new Pair(tz4.d.a(uikitResources, R$string.search_block_indexes_name), pVar));
    }

    @Override // z87.e
    public final m a() {
        return this.f;
    }

    @Override // z87.e
    public final efm.r e(String searchQuery, GlobalSearchContext context, efm.r remoteObservable) {
        efm.r rVarW;
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteObservable, "remoteObservable");
        zsc.m.Companion.getClass();
        f fVar = new f(this.f6268h, l.a(searchQuery));
        efm.r rVarC = rd0.e.c(this.f6264a.w(), g.f186406a);
        Intrinsics.checkNotNullParameter(remoteObservable, "<this>");
        b4f.b temporaryInstrumentRefProvider = this.d;
        Intrinsics.checkNotNullParameter(temporaryInstrumentRefProvider, "temporaryInstrumentRefProvider");
        m mVar = this.f;
        if (mVar == null) {
            rVarW = efm.r.just(new Data(f0.f322471a, null, false, 6, null));
            Intrinsics.h(rVarW);
        } else {
            rVarW = nim.a.w(remoteObservable, new zhf.f(mVar, temporaryInstrumentRefProvider));
        }
        efm.r map = w.l(this.f6267g, pd.b.r(mif.a.d(rVarC, rVarW), new acb.f(fVar, this, 28))).map(new j(new q(this, 24), 6));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // z87.f
    public final r h() {
        return this.e;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        Object obj2 = yVar.f223136b;
        v vVar = obj2 instanceof v ? (v) obj2 : null;
        if (vVar instanceof clh.r) {
            MarketAsset.Index index = ((clh.r) vVar).f25008a;
            return new o97.l(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new GlobalMarketsFeatureConfig$IndexDetailsDestination(index.f74573c, index.f74572b), false, (Integer) null, 0, 61)));
        }
        boolean z = vVar instanceof u;
        o97.e eVar = o97.e.f223096a;
        if (z) {
            this.f6267g.onNext(Boolean.valueOf(((u) vVar).f25012b));
        }
        return eVar;
    }
}

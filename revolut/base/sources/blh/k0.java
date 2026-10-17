package blh;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 implements z87.e {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f16667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f16668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tzg.m f16669c;
    public final ybl.b d;
    public final clh.h e;
    public final b4f.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zjh.f f16670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.b f16671h;
    public final clh.n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o97.r f16672j;
    public final o97.m k;

    public k0(f01.c uikitResources, gte.a featureToggleInteractor, tzg.m wealthAccountsInteractor, ybl.b instrumentTickerInteractor, clh.h mapper, b4f.b temporaryInstrumentRefProvider, zjh.f ipoInstrumentInteractor) {
        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(temporaryInstrumentRefProvider, "temporaryInstrumentRefProvider");
        Intrinsics.checkNotNullParameter(ipoInstrumentInteractor, "ipoInstrumentInteractor");
        this.f16667a = uikitResources;
        this.f16668b = featureToggleInteractor;
        this.f16669c = wealthAccountsInteractor;
        this.d = instrumentTickerInteractor;
        this.e = mapper;
        this.f = temporaryInstrumentRefProvider;
        this.f16670g = ipoInstrumentInteractor;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f16671h = bVarE;
        this.i = new clh.n(clh.w.IPOS);
        this.f16672j = o97.r.WEALTH_STOCKS_IPO;
        this.k = o97.m.INVEST;
    }

    @Override // z87.e
    public final o97.m a() {
        return this.k;
    }

    @Override // z87.e
    public final efm.r e(String searchQuery, GlobalSearchContext context, efm.r remoteObservable) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteObservable, "remoteObservable");
        if (this.f16668b.a(WealthUiApi$Toggles.StocksIpoListingV2.f95865c)) {
            return zi0.c.j(zhm.f0.f322471a);
        }
        efm.r rVarDistinctUntilChanged = ue0.e.p(rd0.e.c(tzg.m.c(this.f16669c, null, null, 3), kotlin.coroutines.g.f186406a), zhm.h0.f322473a).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        efm.r map = te0.w.l(this.f16671h, pd.b.r(rVarDistinctUntilChanged, new b4d.c(remoteObservable, this, searchQuery, 22))).map(new g0(new bhl.g(this, 8), 1));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // z87.f
    public final o97.r h() {
        return this.f16672j;
    }

    @Override // z87.f
    public final Object l(String str, o97.y yVar, Continuation continuation) {
        Object obj2 = yVar.f223136b;
        clh.v vVar = obj2 instanceof clh.v ? (clh.v) obj2 : null;
        if (vVar instanceof clh.s) {
            return new o97.d(new AssetDetailsDestination(((clh.s) vVar).f25009a.f214596b, null, false, "GlobalSearch", null, null, 54));
        }
        boolean z = vVar instanceof clh.u;
        o97.e eVar = o97.e.f223096a;
        if (z) {
            this.f16671h.onNext(Boolean.valueOf(((clh.u) vVar).f25012b));
        }
        return eVar;
    }
}

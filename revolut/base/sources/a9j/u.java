package a9j;

import com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends v {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CryptoAssetDetailsScreenContract$InputData f2709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w f2710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f2711n;
    public final o9j.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sd5.c f2712p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c9j.d f2713q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y8j.a f2714r;

    public u(CryptoAssetDetailsScreenContract$InputData inputData, w view, a assetDetailsChartInteractor, o9j.b chartMapper, sd5.c cryptoConfigInteractor, c9j.d cryptoPeggedPairInteractor, y8j.a cryptoAdvancedChartExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(assetDetailsChartInteractor, "assetDetailsChartInteractor");
        Intrinsics.checkNotNullParameter(chartMapper, "chartMapper");
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        Intrinsics.checkNotNullParameter(cryptoPeggedPairInteractor, "cryptoPeggedPairInteractor");
        Intrinsics.checkNotNullParameter(cryptoAdvancedChartExtension, "cryptoAdvancedChartExtension");
        this.f2709l = inputData;
        this.f2710m = view;
        this.f2711n = assetDetailsChartInteractor;
        this.o = chartMapper;
        this.f2712p = cryptoConfigInteractor;
        this.f2713q = cryptoPeggedPairInteractor;
        this.f2714r = cryptoAdvancedChartExtension;
    }

    @Override // yji.n
    public final void D2() {
        T2(new a1a.b(this, null), new yi5.b(27));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.n
    public final void H2() {
        Object obj2 = this.f2710m;
        BaseCryptoAssetDetailsScreen baseCryptoAssetDetailsScreen = (BaseCryptoAssetDetailsScreen) obj2;
        yji.n.l2(this, new a3i.i(baseCryptoAssetDetailsScreen.g3(), this, 5), null, new p(this, null, 1), 3);
        CryptoAssetDetailsScreen cryptoAssetDetailsScreen = (CryptoAssetDetailsScreen) obj2;
        efm.r map = ((FixedTabsDelegate) cryptoAssetDetailsScreen.N.getValue()).d.f121375b.map(new u3a.q(new u8c.c(4), 20));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        yji.n.l2(this, rd0.e.b(map), null, new a07.d(this, null, 14), 3);
        efm.r map2 = ((CandleStickGraphDelegate) cryptoAssetDetailsScreen.f0.getValue()).d.map(new u3a.q(new u8c.c(5), 21));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        yji.n.l2(this, rd0.e.b(map2), null, new p(this, null, 2), 3);
        yji.n.l2(this, rd0.e.b(((TabsDelegate) baseCryptoAssetDetailsScreen.O.getValue()).f.f121375b), null, new p(this, null, 0), 3);
    }

    @Override // a9j.v
    public final wkm.l Z2(xi0.b currency, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "pocketCurrency");
        g gVar = (g) this.f2711n;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "pocketCurrency");
        a8j.a aVar = gVar.f2680g;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        aVar.d.setValue(currency);
        return vkm.q.Q(rd0.e.b(te0.w.l(m70.a.g(nim.a.w(this.f2712p.a(false), new a94.q(3, currency)), null, null, 3), m70.a.g(gVar.a(), null, null, 3))), new m((Continuation) null, z, this, currency, 0));
    }

    @Override // a9j.v
    public final vkm.d b3(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "pocketCurrency");
        g gVar = (g) this.f2711n;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "pocketCurrency");
        a8j.a aVar = gVar.f2680g;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        aVar.d.setValue(currency);
        efm.r rVarDistinctUntilChanged = kli.a.h(nim.a.w(this.f2712p.a(false), new a94.q(3, currency)), gVar.a()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rd0.e.b(pd.b.r(rVarDistinctUntilChanged, new i(this, currency, 6)));
    }

    public final efm.r c3() {
        return te0.w.a0(rd0.e.c(((g) this.f2711n).f2680g.f2266b, kotlin.coroutines.g.f186406a), new a9h.b(6));
    }
}

package c2d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes13.dex */
public final class m implements u3d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f20717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f20718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vpk.p f20719c;
    public final t70.b d;
    public final ybl.l e;

    public m(xoj.a featuresInteractor, ppk.f ratesInteractor, vpk.p ratesPlotRepository, t70.b currenciesLocalization, ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(ratesPlotRepository, "ratesPlotRepository");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f20717a = featuresInteractor;
        this.f20718b = ratesInteractor;
        this.f20719c = ratesPlotRepository;
        this.d = currenciesLocalization;
        this.e = tradingConfigInteractor;
    }

    @Override // u3d.b
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.d;
    }

    @Override // u3d.b
    public final efm.r b(List favouritesAssetIdPairs, boolean z) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPairs, "favouritesAssetIdPairs");
        return d.c(this.f20718b, favouritesAssetIdPairs, z);
    }

    @Override // u3d.b
    public final List d() {
        return d.a();
    }

    @Override // u3d.b
    public final efm.r e(ArrayList favouritesAssetIdPairs) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPairs, "favouritesAssetIdPairs");
        return d.d(this.f20719c, ngd.a.ONE_DAY, favouritesAssetIdPairs);
    }

    @Override // u3d.b
    public final Flow f(Pair favouritesAssetIdPair, ngd.a range, ngd.b type) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPair, "favouritesAssetIdPair");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(type, "type");
        return d.b(this.f20719c, type, range, favouritesAssetIdPair);
    }

    @Override // u3d.b
    public final efm.r h() {
        efm.r map = rd0.e.c(ybl.l.d(this.e), kotlin.coroutines.g.f186406a).map(new c03.u(21, new c09.a(29)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // u3d.b
    public final efm.r i(List assetIds) {
        Intrinsics.checkNotNullParameter(assetIds, "assetIds");
        List<String> list = assetIds;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (String str : list) {
            arrayList.add(new u3d.a(24, null, str, str, this.d.b(str), null));
        }
        return zi0.c.j(arrayList);
    }

    @Override // u3d.b
    public final Flow isAvailable() {
        efm.r map = ((cpj.b) this.f20717a).k(yoj.c.COMMODITIES, yoj.d.DISABLED).map(new c03.u(20, new c09.a(28)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }
}

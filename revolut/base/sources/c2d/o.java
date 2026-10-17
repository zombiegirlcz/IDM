package c2d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes13.dex */
public final class o implements u3d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f20724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f20725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vpk.p f20726c;
    public final t70.b d;

    public o(xoj.a featuresInteractor, ppk.f ratesInteractor, vpk.p ratesPlotRepository, t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(ratesPlotRepository, "ratesPlotRepository");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        this.f20724a = featuresInteractor;
        this.f20725b = ratesInteractor;
        this.f20726c = ratesPlotRepository;
        this.d = currenciesLocalization;
    }

    @Override // u3d.b
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.f310359c;
    }

    @Override // u3d.b
    public final efm.r b(List favouritesAssetIdPairs, boolean z) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPairs, "favouritesAssetIdPairs");
        return d.c(this.f20725b, favouritesAssetIdPairs, z);
    }

    @Override // u3d.b
    public final List d() {
        return d.a();
    }

    @Override // u3d.b
    public final efm.r e(ArrayList favouritesAssetIdPairs) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPairs, "favouritesAssetIdPairs");
        return d.d(this.f20726c, ngd.a.ONE_DAY, favouritesAssetIdPairs);
    }

    @Override // u3d.b
    public final Flow f(Pair favouritesAssetIdPair, ngd.a range, ngd.b type) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPair, "favouritesAssetIdPair");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(type, "type");
        return d.b(this.f20726c, type, range, favouritesAssetIdPair);
    }

    @Override // u3d.b
    public final efm.r h() {
        return te0.w.h(lgd.b.FX);
    }

    @Override // u3d.b
    public final efm.r i(List assetIds) {
        Intrinsics.checkNotNullParameter(assetIds, "assetIds");
        List<String> list = assetIds;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (String str : list) {
            xi0.b.Companion.getClass();
            arrayList.add(new u3d.a(24, null, str, cp5.d.K(xi0.a.a(str)), this.d.b(str), null));
        }
        return zi0.c.j(arrayList);
    }

    @Override // u3d.b
    public final Flow isAvailable() {
        efm.r map = ((cpj.b) this.f20724a).k(yoj.c.CRYPTO, yoj.d.DISABLED).map(new c03.u(22, new n(0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }
}

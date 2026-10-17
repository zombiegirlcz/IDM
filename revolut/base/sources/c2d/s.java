package c2d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes13.dex */
public final class s implements u3d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppk.f f20735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vpk.p f20736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t70.b f20737c;

    public s(ppk.f ratesInteractor, vpk.p ratesPlotRepository, t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(ratesPlotRepository, "ratesPlotRepository");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        this.f20735a = ratesInteractor;
        this.f20736b = ratesPlotRepository;
        this.f20737c = currenciesLocalization;
    }

    @Override // u3d.b
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.f310358b;
    }

    @Override // u3d.b
    public final efm.r b(List favouritesAssetIdPairs, boolean z) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPairs, "favouritesAssetIdPairs");
        return d.c(this.f20735a, favouritesAssetIdPairs, z);
    }

    @Override // u3d.b
    public final List d() {
        return d.a();
    }

    @Override // u3d.b
    public final efm.r e(ArrayList favouritesAssetIdPairs) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPairs, "favouritesAssetIdPairs");
        return d.d(this.f20736b, ngd.a.ONE_DAY, favouritesAssetIdPairs);
    }

    @Override // u3d.b
    public final Flow f(Pair favouritesAssetIdPair, ngd.a range, ngd.b type) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPair, "favouritesAssetIdPair");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(type, "type");
        return d.b(this.f20736b, type, range, favouritesAssetIdPair);
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
            arrayList.add(new u3d.a(24, null, str, str, this.f20737c.b(str), null));
        }
        return zi0.c.j(arrayList);
    }

    @Override // u3d.b
    public final Flow isAvailable() {
        return new go.g(Boolean.TRUE, 2);
    }
}

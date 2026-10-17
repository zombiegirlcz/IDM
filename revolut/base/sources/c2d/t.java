package c2d;

import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements z1d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o76.d f20739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f20740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vpk.p f20741c;
    public final f01.c d;

    public t(o76.d derivativesEnabledStateChecker, ppk.f ratesInteractor, vpk.p ratesPlotRepository, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(derivativesEnabledStateChecker, "derivativesEnabledStateChecker");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(ratesPlotRepository, "ratesPlotRepository");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f20739a = derivativesEnabledStateChecker;
        this.f20740b = ratesInteractor;
        this.f20741c = ratesPlotRepository;
        this.d = uiKitResources;
    }

    @Override // u3d.b
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.k;
    }

    @Override // u3d.b
    public final efm.r b(List favouritesAssetIdPairs, boolean z) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPairs, "favouritesAssetIdPairs");
        return d.c(this.f20740b, favouritesAssetIdPairs, z);
    }

    @Override // u3d.b
    public final List d() {
        return d.a();
    }

    @Override // u3d.b
    public final efm.r e(ArrayList favouritesAssetIdPairs) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPairs, "favouritesAssetIdPairs");
        return d.d(this.f20741c, ngd.a.ONE_DAY, favouritesAssetIdPairs);
    }

    @Override // u3d.b
    public final Flow f(Pair favouritesAssetIdPair, ngd.a range, ngd.b type) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPair, "favouritesAssetIdPair");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(type, "type");
        return d.b(this.f20741c, type, range, favouritesAssetIdPair);
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
            xi0.b bVarA = xi0.a.a(str);
            String strK = cp5.d.K(bVarA);
            String string = this.d.b(new CurrencyClause(bVarA, null, null, 6)).toString();
            arrayList.add(new u3d.a(24, null, str, strK, !kotlin.text.d0.W(string) ? string : null, null));
        }
        return zi0.c.j(arrayList);
    }

    @Override // u3d.b
    public final Flow isAvailable() {
        return new v1(new btk.j(this, null, 12));
    }
}

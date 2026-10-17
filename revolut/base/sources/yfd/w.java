package yfd;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import le.u1;
import lfg.d0;
import zhm.f0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends jki.g implements q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SharedFavouritesAddAssetScreenContract$InputData f313231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m3d.d f313232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n3d.c f313233r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f313234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f313235t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(SharedFavouritesAddAssetScreenContract$InputData inputData, m3d.d watchlistAssetsProvider, n3d.c watchlistFooterDelegate, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(watchlistAssetsProvider, "watchlistAssetsProvider");
        Intrinsics.checkNotNullParameter(watchlistFooterDelegate, "watchlistFooterDelegate");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f313231p = inputData;
        this.f313232q = watchlistAssetsProvider;
        this.f313233r = watchlistFooterDelegate;
        Data data = new Data(null, null, true, 2, null);
        f0 f0Var = f0.f322471a;
        this.f313234s = new m(data, f0Var, inputData.d, "", false, f0Var);
        this.f313235t = new a();
    }

    @Override // yji.l
    public final void I1() {
        Object objB;
        Flow flowQ = vkm.q.q(new wyd.f(q2(), this, 27));
        SharedFavouritesAddAssetScreenContract$InputData sharedFavouritesAddAssetScreenContract$InputData = this.f313231p;
        FavouritesAssetTypeKey typeKey = sharedFavouritesAddAssetScreenContract$InputData.f86809a;
        xi0.b bVar = sharedFavouritesAddAssetScreenContract$InputData.f86810b;
        m3d.d dVar = this.f313232q;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
        x3d.a aVar = (x3d.a) dVar.f202368c.get(typeKey);
        if (aVar == null) {
            objB = new go.g(new Data(null, new IllegalStateException(j6.a.q("Provide WatchlistAssetItemsProvider for asset=", typeKey.f86866a)), false, 5, null), 2);
        } else {
            Flow flowC = aVar.c(bVar);
            y1d.b.Companion.getClass();
            if (Intrinsics.f(typeKey, y1d.a.d) || Intrinsics.f(typeKey, y1d.a.f310359c) || Intrinsics.f(typeKey, y1d.a.f310358b) || Intrinsics.f(typeKey, y1d.a.k)) {
                efm.r rVarSwitchMap = u1.d(rd0.e.c(flowC, kotlin.coroutines.g.f186406a), osg.b.e(dVar.f202366a, false, io3.l.CURRENT, null, io3.i.INTERNAL, io3.j.PERSONAL, qsg.a.RECENT_FIRST, null, 68)).switchMap(new m30.b(8, new m11.h(dVar, 9)));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                objB = rd0.e.b(rVarSwitchMap);
            } else {
                objB = new d0(flowC, 5);
            }
        }
        yji.l.a1(this, new t38.e(flowQ, 24, objB, new n8a.g(3, 2, null)), null, null, new v(this, null, 0), 3);
        yji.l.b1(this, this.f313233r.b(y0.b(sharedFavouritesAddAssetScreenContract$InputData.f86809a)), null, new v(this, null, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f313234s;
    }

    @Override // jki.g
    public final kki.a s2() {
        return this.f313235t;
    }
}

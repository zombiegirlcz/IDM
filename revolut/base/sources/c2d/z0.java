package c2d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class z0 implements x3d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jpf.a f20765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f20766b;

    public z0(jpf.a marketAssetInteractor, ecm.q indexDetailsInteractor) {
        Intrinsics.checkNotNullParameter(marketAssetInteractor, "marketAssetInteractor");
        Intrinsics.checkNotNullParameter(indexDetailsInteractor, "indexDetailsInteractor");
        this.f20765a = marketAssetInteractor;
        this.f20766b = indexDetailsInteractor;
    }

    @Override // x3d.a
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.f310362j;
    }

    @Override // x3d.a
    public final Flow b(int i, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return i > 0 ? new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2) : nim.a.v(nim.a.v(boh.f.e(this.f20765a.w(), new bzg.t(this, 7)), new n(16)), new bd2.b(query, 24));
    }

    @Override // x3d.a
    public final Flow c(xi0.b bVar) {
        return vkm.i.f290039a;
    }
}

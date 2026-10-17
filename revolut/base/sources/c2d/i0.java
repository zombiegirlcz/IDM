package c2d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 implements x3d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f20704a;

    public i0(ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f20704a = instrumentTickerInteractor;
    }

    @Override // x3d.a
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.i;
    }

    @Override // x3d.a
    public final Flow b(int i, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return i > 0 ? new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2) : nim.a.v(rd0.e.b(nim.a.w(ybl.b.c(this.f20704a), new n(12))), new bd2.b(query, 23));
    }

    @Override // x3d.a
    public final Flow c(xi0.b bVar) {
        return vkm.i.f290039a;
    }
}

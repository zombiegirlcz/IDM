package c2d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements x3d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2d.a f20698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f20699b;

    public g0(e2d.a tradingAssetsProvider) {
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        this.f20698a = tradingAssetsProvider;
        this.f20699b = yhm.j.b(new c0d.e(4));
    }

    @Override // x3d.a
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.f310361h;
    }

    @Override // x3d.a
    public final Flow b(int i, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (i > 0) {
            return new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2);
        }
        Set set = (Set) this.f20699b.getValue();
        y1d.b.Companion.getClass();
        return ((e2d.e) this.f20698a).a(query, i, set, y1d.a.f310361h);
    }

    @Override // x3d.a
    public final Flow c(xi0.b bVar) {
        return vkm.i.f290039a;
    }
}

package c2d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class a1 implements x3d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f20677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2d.a f20678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tzg.m f20679c;
    public final Set d;

    public a1(ybl.b instrumentTickerInteractor, e2d.a tradingAssetsProvider, tzg.m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f20677a = instrumentTickerInteractor;
        this.f20678b = tradingAssetsProvider;
        this.f20679c = wealthAccountsInteractor;
        nel.z[] elements = {nel.z.ADR, nel.z.ETF, nel.z.ETC, nel.z.ETN, nel.z.EQUITY, nel.z.WARRANT, nel.z.SPAC, nel.z.CFD};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d = kotlin.collections.d.y0(elements);
    }

    @Override // x3d.a
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.e;
    }

    @Override // x3d.a
    public final Flow b(int i, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (i > 0) {
            return new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2);
        }
        y1d.b.Companion.getClass();
        return ((e2d.e) this.f20678b).a(query, i, this.d, y1d.a.e);
    }

    @Override // x3d.a
    public final Flow c(xi0.b bVar) {
        return nim.a.v(zh9.u0.m(rd0.e.b(ybl.b.c(this.f20677a)), tzg.m.c(this.f20679c, null, null, 3)), new bzg.t(this, 9));
    }
}

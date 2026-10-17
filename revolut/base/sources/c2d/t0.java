package c2d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import e7l.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class t0 extends h implements x3d.a {
    public final fk3.a e;
    public final xv5.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d2d.c f20742g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(wsg.n walletInteractor, ppk.f ratesInteractor, td0.b currencySetsProvider, fk3.a configurationInteractor, xv5.c cryptoCommodityBaseCurrencyInteractor, d2d.c currencyPairsGenerator) {
        super(configurationInteractor, currencySetsProvider, ratesInteractor, walletInteractor);
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(currencySetsProvider, "currencySetsProvider");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(currencyPairsGenerator, "currencyPairsGenerator");
        this.e = configurationInteractor;
        this.f = cryptoCommodityBaseCurrencyInteractor;
        this.f20742g = currencyPairsGenerator;
    }

    @Override // x3d.a
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.f310359c;
    }

    @Override // x3d.a
    public final Flow b(int i, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new m0(f(new n(14), new a9j.f(new a9j.f(new p0(), 12), 11)), this, query, i, 1);
    }

    @Override // x3d.a
    public final Flow c(xi0.b bVar) {
        return rd0.e.b(nim.a.w(((ik3.c) this.e).k(g.b.f123407a), new a94.q(this, bVar, 13)));
    }

    @Override // c2d.h
    public final Flow g() {
        efm.r map = xv5.c.b(this.f).map(new a31.o(3, s0.f20738a));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }
}

package c2d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import e7l.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 extends h implements x3d.a {
    public final fk3.a e;
    public final x8h.k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d2d.c f20727g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(wsg.n walletInteractor, ppk.f ratesInteractor, td0.b currencySetsProvider, fk3.a configurationInteractor, x8h.k displayCurrencyInteractor, d2d.c currencyPairsGenerator) {
        super(configurationInteractor, currencySetsProvider, ratesInteractor, walletInteractor);
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(currencySetsProvider, "currencySetsProvider");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(currencyPairsGenerator, "currencyPairsGenerator");
        this.e = configurationInteractor;
        this.f = displayCurrencyInteractor;
        this.f20727g = currencyPairsGenerator;
    }

    @Override // x3d.a
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.d;
    }

    @Override // x3d.a
    public final Flow b(int i, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new m0(f(new n(13), new a9j.f(new a9j.f(new j0(), 10), 9)), this, query, i, 0);
    }

    @Override // x3d.a
    public final Flow c(xi0.b bVar) {
        return rd0.e.b(nim.a.w(((ik3.c) this.e).k(g.b.f123407a), new a94.q(this, bVar, 12)));
    }

    @Override // c2d.h
    public final Flow g() {
        return this.f.b();
    }
}

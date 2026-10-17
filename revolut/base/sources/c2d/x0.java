package c2d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import e7l.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class x0 extends h implements x3d.a {
    public final fk3.a e;
    public final td0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wsg.n f20756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d2d.c f20757h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ppk.f ratesInteractor, fk3.a configurationInteractor, td0.b currencySetsProvider, wsg.n walletInteractor, d2d.c currencyPairsGenerator) {
        super(configurationInteractor, currencySetsProvider, ratesInteractor, walletInteractor);
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(currencySetsProvider, "currencySetsProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(currencyPairsGenerator, "currencyPairsGenerator");
        this.e = configurationInteractor;
        this.f = currencySetsProvider;
        this.f20756g = walletInteractor;
        this.f20757h = currencyPairsGenerator;
    }

    @Override // x3d.a
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.f310358b;
    }

    @Override // x3d.a
    public final Flow b(int i, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return xam.a.h(new b96.d(this, query, i, (Continuation) null), g());
    }

    @Override // x3d.a
    public final Flow c(xi0.b bVar) {
        return rd0.e.b(nim.a.w(((ik3.c) this.e).k(g.b.f123407a), new byc.a(this, bVar, 15)));
    }

    @Override // c2d.h
    public final Flow g() {
        return rd0.e.b(osg.b.d(this.f20756g));
    }
}

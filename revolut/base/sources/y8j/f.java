package y8j;

import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreen;
import go.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tx0.z4;
import xo8.a0;
import y65.l;
import y7k.h;
import yji.n;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f311665l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f311666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xv5.c f311667n;
    public final a9j.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w8b.c f311668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c9j.d f311669q;

    public f(c view, b mapper, xv5.c baseCurrencyInteractor, a9j.a assetDetailsChartInteractor, w8b.c advanceChartsDestinationProvider, c9j.d cryptoPeggedPairInteractor) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(assetDetailsChartInteractor, "assetDetailsChartInteractor");
        Intrinsics.checkNotNullParameter(advanceChartsDestinationProvider, "advanceChartsDestinationProvider");
        Intrinsics.checkNotNullParameter(cryptoPeggedPairInteractor, "cryptoPeggedPairInteractor");
        this.f311665l = view;
        this.f311666m = mapper;
        this.f311667n = baseCurrencyInteractor;
        this.o = assetDetailsChartInteractor;
        this.f311668p = advanceChartsDestinationProvider;
        this.f311669q = cryptoPeggedPairInteractor;
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, new a0(rd0.e.b(((CryptoAssetDetailsScreen) this.f311665l).f99959s0.f53321c.f121375b), 20), null, new y83.d(this, (Continuation) null, 1), 3);
    }

    @Override // y8j.a
    public final jhi.b Z2(xi0.b pocketCurrency) {
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        h hVar = new h(1);
        xge.h hVar2 = new xge.h(this, 29);
        return mo3.a.g(nim.a.u(new z4(hVar, hVar2, pocketCurrency, null, 13), u0.m(rd0.e.b(this.f311667n.a()), nim.a.v(rd0.e.b(this.f311669q.f22478a.a(false)), new c8i.c(12)))), null, null, 3);
    }

    @Override // y8j.a
    public final g b3(xi0.b pocketCurrency) {
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        return new g(f0.f322471a, 2);
    }

    @Override // y8j.a
    public final void c3(xi0.b pocketCurrency) {
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        V2(new l(this, pocketCurrency, null, 3), new yi5.b(29));
    }
}

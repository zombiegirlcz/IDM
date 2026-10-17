package wzg;

import akg.n;
import boh.f;
import c9h.c;
import c9h.d;
import c9h.e;
import c9h.k;
import cfl.g;
import cfl.h;
import cfl.i;
import java.util.Set;
import kel.b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes9.dex */
public interface a {
    static n a(a aVar, b cashHolding, h hVar, int i) {
        i tradingAccountHolderIdFilter = hVar;
        if ((i & 2) != 0) {
            tradingAccountHolderIdFilter = g.f23742a;
        }
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(tradingAccountHolderIdFilter, "tradingAccountHolderIdFilter");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(((k) aVar).l(tradingAccountHolderIdFilter, loadingStrategy), new c(cashHolding, 1));
    }

    static Flow b(a aVar, String pocketId, String portfolioId) {
        k kVar = (k) aVar;
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return f.e(f.e(nim.a.v(kVar.n(new c9h.g(portfolioId), new szg.b(portfolioId), loadingStrategy), new c86.c(pocketId, 1)), new c9h.b(kVar, 0)), new c9h.b(kVar, 1));
    }

    static Flow c(a aVar, String portfolioId, n9l.b period, w4l.k portfolioLoadingStrategy) {
        k kVar = (k) aVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(period, "period");
        szg.a cashHoldingFilter = szg.a.f266811a;
        Intrinsics.checkNotNullParameter(cashHoldingFilter, "cashHoldingFilter");
        Intrinsics.checkNotNullParameter(portfolioLoadingStrategy, "portfolioLoadingStrategy");
        return f.e(kVar.m(new c9h.g(portfolioId), cashHoldingFilter, portfolioLoadingStrategy), new e(kVar, period, 1));
    }

    static Flow d(a aVar, Set accountIds, w4l.k portfolioLoadingStrategy) {
        k kVar = (k) aVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(accountIds, "accountIds");
        g tradingAccountHolderIdFilter = g.f23742a;
        Intrinsics.checkNotNullParameter(tradingAccountHolderIdFilter, "tradingAccountHolderIdFilter");
        Intrinsics.checkNotNullParameter(portfolioLoadingStrategy, "portfolioLoadingStrategy");
        return f.e(nim.a.v(kVar.l(tradingAccountHolderIdFilter, w4l.h.f294642c), new c7e.i(accountIds, kVar, 4)), new d(kVar, portfolioLoadingStrategy, 1));
    }

    static Flow e(a aVar, String portfolioId, xi0.b currency, w4l.k portfolioLoadingStrategy) {
        k kVar = (k) aVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        szg.a cashHoldingFilter = szg.a.f266811a;
        Intrinsics.checkNotNullParameter(cashHoldingFilter, "cashHoldingFilter");
        Intrinsics.checkNotNullParameter(portfolioLoadingStrategy, "portfolioLoadingStrategy");
        return f.e(kVar.n(new c9h.g(portfolioId), cashHoldingFilter, portfolioLoadingStrategy), new c7e.i(kVar, currency, 3));
    }
}

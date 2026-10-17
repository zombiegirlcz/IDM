package p2b;

import akg.n;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuoteParams;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import os9.t;
import qe0.o;
import vkm.q;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements y1b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3b.b f232192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f232193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3b.k f232194c;

    public b(g3b.b repository, ppk.f ratesInteractor, g3b.k marginQuoteRepository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(marginQuoteRepository, "marginQuoteRepository");
        this.f232192a = repository;
        this.f232193b = ratesInteractor;
        this.f232194c = marginQuoteRepository;
    }

    public static dj0.d b(dj0.d dVar, List list, xi0.b bVar) {
        Object next;
        if (bVar == null) {
            return dVar;
        }
        String str = bVar.f306286a;
        if (Intrinsics.f(dVar.f115083b.f306286a, str)) {
            return dVar;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((n9l.a) next).f213661a.f306286a, dVar.f115083b.f306286a)) {
                break;
            }
        }
        n9l.a aVar = (n9l.a) next;
        if (aVar != null) {
            return pyd.c.K(dVar, aVar.f213663c, bVar);
        }
        hx7.e.n(new IllegalStateException(v1.c.t(list.size(), "CfdInteractorImpl convertToTargetCurrency unsuccessful, rate not found, fallback to 0; targetCurrencyCode=", str, "; currencyRatesCount=")));
        return new dj0.d(0L, bVar);
    }

    public final vkm.d c(MarginQuoteParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        g3b.k kVar = this.f232194c;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        return o.a(kVar.d, params, 3L, w4l.i.f294643c, false, null, 24);
    }

    public final n d(String portfolioId, xi0.b bVar, n9l.b ratesUpdatePeriod) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(ratesUpdatePeriod, "ratesUpdatePeriod");
        g3b.g gVar = (g3b.g) this.f232192a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        o oVar = gVar.e;
        w4l.h hVar = w4l.h.f294642c;
        vkm.d dVarA = o.a(oVar, portfolioId, 2L, hVar, false, null, 24);
        gVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return nim.a.v(u0.m(dVarA, boh.f.e(q.q(nim.a.v(o.a(gVar.e, portfolioId, 2L, hVar, false, null, 24), new t(this, bVar, 20))), new t(this, ratesUpdatePeriod, 21))), new ou5.a(this, bVar, 2));
    }
}

package acb;

import a9d.p;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_market_data_api.navigation.ExchangeBreakdownFeatureConfig;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pcd.l0;
import vkm.q;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.b f3125a;

    public j(l4i.a amountConverter, o7.b orderQuoteInteractor) {
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f3125a = orderQuoteInteractor;
    }

    public static Asset a(xi0.b bVar) {
        return cp5.d.A(bVar) ? new Asset(f8l.c.FIAT, bVar.f306286a, bVar) : cp5.d.z(bVar) ? new Asset(f8l.c.CRYPTO, bVar.f306286a, bVar) : cp5.d.y(bVar) ? new Asset(f8l.c.COMMODITY, bVar.f306286a, bVar) : new Asset(f8l.c.UNDEFINED, bVar.f306286a, bVar);
    }

    public static boolean c(e eVar) {
        if (!(eVar instanceof d)) {
            return false;
        }
        d dVar = (d) eVar;
        return dVar.d == l0.SAVINGS && dVar.e != null;
    }

    public static b e(e eVar) {
        if (eVar instanceof c) {
            c cVar = (c) eVar;
            return new b(new dj0.d(cVar.f3111c, cVar.f3110b), null, null, false);
        }
        if (!(eVar instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        d dVar = (d) eVar;
        return new b(new dj0.d(dVar.f3114c, dVar.f3112a), null, null, false);
    }

    public static LegacyOrderQuoteParams f(e eVar) {
        if (eVar instanceof c) {
            c cVar = (c) eVar;
            xi0.b bVar = cVar.f3110b;
            Asset assetA = a(cVar.f3109a);
            Asset assetA2 = a(bVar);
            f8l.e eVar2 = f8l.e.MARKET;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(cVar.f3111c / cp5.d.k(bVar));
            f8l.b bVar2 = f8l.b.TO;
            return new LegacyOrderQuoteParams(assetA, assetA2, eVar2, bigDecimalValueOf, bVar2, bVar2, null, false, null, null, null, null, null, null, 16128);
        }
        if (!(eVar instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        d dVar = (d) eVar;
        Asset assetA3 = a(dVar.f3112a);
        Asset assetA4 = a(dVar.f3113b);
        f8l.e eVar3 = f8l.e.MARKET;
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(dVar.f3114c / cp5.d.k(r3));
        f8l.b bVar3 = f8l.b.FROM;
        return new LegacyOrderQuoteParams(assetA3, assetA4, eVar3, bigDecimalValueOf2, bVar3, bVar3, null, false, null, c(eVar) ? f8l.f.SAVINGS : null, c(eVar) ? dVar.e : null, null, null, null, 14592);
    }

    public final Object b(e eVar, c4i.a aVar, AnalyticsProduct analyticsProduct, gim.i iVar) {
        Object objX = q.x(new i(mo3.a.g(o7.b.s(this.f3125a, f(eVar)), null, new p(12), 1), this, eVar, aVar, analyticsProduct, 0), iVar);
        return objX == fim.a.COROUTINE_SUSPENDED ? objX : (ExchangeBreakdownFeatureConfig) objX;
    }

    public final jhi.b d(e transferParams) {
        Intrinsics.checkNotNullParameter(transferParams, "transferParams");
        boolean zF = Intrinsics.f(transferParams.b(), transferParams.a());
        o7.b bVar = this.f3125a;
        return mo3.a.g(!zF ? nim.a.v(o7.b.s(bVar, f(transferParams)), new a9h.b(this, 19)) : c(transferParams) ? nim.a.A(nim.a.v(o7.b.s(bVar, f(transferParams)), new a9h.b(this, 19)), new f(this, transferParams, 0)) : zi0.c.i(e(transferParams)), null, new p(11), 1);
    }
}

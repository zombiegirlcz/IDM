package t21;

import a68.f;
import cn0.g;
import com.revolut.data.network.models.exchange.ExchangeRateDto;
import com.revolut.data.network.models.exchange.Side;
import com.revolut.data.network.services.exchange.ExchangeRatesService;
import cp5.d;
import efm.d0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mm0.n;
import te0.w;
import ufm.i;
import xi0.b;
import zm0.c;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeRatesService f267405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f267406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b80.c f267407c;

    public a(ExchangeRatesService exchangeRatesService, c sessionProvider, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(exchangeRatesService, "exchangeRatesService");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f267405a = exchangeRatesService;
        this.f267406b = sessionProvider;
        this.f267407c = networkStateRepository;
    }

    public static d0 a(a aVar, String fromCcy, String toCcy, long j2) {
        Intrinsics.checkNotNullParameter(fromCcy, "fromCcy");
        Intrinsics.checkNotNullParameter(toCcy, "toCcy");
        if (!(((g) aVar.f267406b).d() instanceof n) || aVar.f267407c.a() == al0.a.OFFLINE) {
            ufm.c cVar = new ufm.c(new f(17), 1);
            Intrinsics.checkNotNullExpressionValue(cVar, "error(...)");
            return cVar;
        }
        Side side = Side.BUY;
        b.Companion.getClass();
        d0<ExchangeRateDto> conversion = aVar.f267405a.getConversion(d.d(new Pair(xi0.a.a(fromCcy), xi0.a.a(toCcy))), j2, side);
        sx4.c cVar2 = new sx4.c(new szb.g(23), 13);
        conversion.getClass();
        i iVar = new i(conversion, cVar2, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }
}

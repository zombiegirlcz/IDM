package s2i;

import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.exchange.models.ExchangeOrderInfo;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import hx7.q;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import z9h.n;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f259351b;

    public /* synthetic */ d(h hVar, int i) {
        this.f259350a = i;
        this.f259351b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LegacyOrderQuoteParams legacyOrderQuoteParams;
        switch (this.f259350a) {
            case 0:
                ExchangeOrder order = (ExchangeOrder) obj2;
                Intrinsics.checkNotNullParameter(order, "order");
                boolean zO = q.O(order.getF72134a());
                h hVar = this.f259351b;
                return (zO && q.L(order.getF72134a())) ? w.l(hVar.d.t(true), hVar.o2()).map(new s08.g(24, new e(hVar, order, 1))) : hVar.d();
            case 1:
                String breakdownId = (String) obj2;
                Intrinsics.checkNotNullParameter(breakdownId, "breakdownId");
                return this.f259351b.f259359h.e(breakdownId);
            case 2:
                ExchangeOrder order2 = (ExchangeOrder) obj2;
                Intrinsics.checkNotNullParameter(order2, "order");
                ExchangeOrderInfo f72134a = order2.getF72134a();
                if (!q.O(f72134a) || !q.L(f72134a)) {
                    return n.f(null, null, false, 7, null);
                }
                o7.b bVar = this.f259351b.f259358g;
                dj0.d dVar = f72134a.f72140g;
                double d = f72134a.f72141h;
                xi0.b bVar2 = f72134a.f;
                xi0.b bVar3 = f72134a.e;
                boolean z = cp5.d.z(dVar.f115083b) && Intrinsics.f(dVar.f115083b, bVar3);
                f8l.e eVar = f72134a.f72139c == wd6.h.LIMIT ? f8l.e.LIMIT : f8l.e.STOP;
                int i = f.f259354a[f72134a.d.ordinal()];
                if (i == 1) {
                    legacyOrderQuoteParams = new LegacyOrderQuoteParams(l4i.a.c(bVar2), l4i.a.c(bVar3), eVar, l4i.a.e(dVar).f104717a, z ? f8l.b.TO : f8l.b.FROM, f8l.b.TO, new BigDecimal(String.valueOf(d)), false, null, null, null, null, null, null, 16128);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    legacyOrderQuoteParams = new LegacyOrderQuoteParams(l4i.a.c(bVar3), l4i.a.c(bVar2), eVar, l4i.a.e(dVar).f104717a, z ? f8l.b.FROM : f8l.b.TO, f8l.b.FROM, new BigDecimal(String.valueOf(d)), false, null, null, null, null, null, null, 16128);
                }
                return rd0.e.c(o7.b.s(bVar, legacyOrderQuoteParams), kotlin.coroutines.g.f186406a);
            default:
                ExchangeOrder order3 = (ExchangeOrder) obj2;
                Intrinsics.checkNotNullParameter(order3, "order");
                h hVar2 = this.f259351b;
                kgm.c cVar = hVar2.f259359h;
                Pair currencyPair = new Pair(order3.getF72134a().e, order3.getF72134a().f);
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                i4i.g gVar = (i4i.g) ((n4i.a) cVar.f184018b);
                gVar.getClass();
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                return nim.a.w(gVar.f158504g.f(currencyPair, true), new e(hVar2, order3, 0));
        }
    }
}

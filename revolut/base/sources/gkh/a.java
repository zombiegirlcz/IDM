package gkh;

import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static InvestOrdersParams.OrdersByCurrency a(kel.b cashHolding) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        kel.a aVar = cashHolding.f183148a;
        String str = aVar.f183146b;
        xi0.a aVar2 = xi0.b.Companion;
        String str2 = aVar.e;
        aVar2.getClass();
        return new InvestOrdersParams.OrdersByCurrency(xi0.a.a(str2), null, str, 6);
    }
}

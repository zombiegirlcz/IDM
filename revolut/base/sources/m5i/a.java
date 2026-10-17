package m5i;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import f8l.c;
import kotlin.jvm.internal.Intrinsics;
import mga.d0;
import mga.i;
import mga.j;
import mga.n;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static d0 a(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        String value = orderQuote.f104765t;
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
        } else {
            value = null;
        }
        if (e1.x(orderQuote)) {
            return j.f205208a;
        }
        if (e1.w(orderQuote)) {
            return new i(value);
        }
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        c cVar = e1.k(orderQuote).f104719a;
        c cVar2 = c.FIAT;
        if (cVar == cVar2 || e1.t(orderQuote).f104719a == cVar2) {
            return new n(value);
        }
        return null;
    }
}

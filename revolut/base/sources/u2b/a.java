package u2b;

import bfl.g;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuoteParams;
import f8l.e;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static MarginQuoteParams a(e orderType, n instrument, BigDecimal quantity, g tradeSide, BigDecimal openLongQty, BigDecimal openShortQty, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(openLongQty, "openLongQty");
        Intrinsics.checkNotNullParameter(openShortQty, "openShortQty");
        BigDecimal bigDecimal3 = bigDecimal == null ? t2b.g.f267535a : bigDecimal;
        xi0.b bVar = instrument.i;
        xi0.a aVar = xi0.b.Companion;
        String str = instrument.f214596b;
        aVar.getClass();
        return new MarginQuoteParams(orderType, tradeSide, bigDecimal3, bVar, xi0.a.a(str), quantity, openLongQty, openShortQty, bigDecimal2);
    }
}

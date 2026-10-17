package a4b;

import com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdOpenPositionsDelegate$OpenPositions;
import d9.e1;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {
    public static g a(CfdOpenPositionsDelegate$OpenPositions openPositions, bfl.g tradeSide, BigDecimal orderQuantity) {
        Intrinsics.checkNotNullParameter(openPositions, "openPositions");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderQuantity, "orderQuantity");
        BigDecimal bigDecimal = openPositions.f82237a;
        BigDecimal bigDecimal2 = openPositions.f82238b;
        if (!e1.G(bigDecimal)) {
            bigDecimal = null;
        }
        if (bigDecimal == null) {
            bigDecimal = bigDecimal2;
        }
        if (tradeSide == bfl.g.BUY && e1.G(openPositions.f82237a)) {
            return g.OPEN_POSITION;
        }
        if ((tradeSide != bfl.g.SELL || !e1.G(bigDecimal2)) && !e1.I(bigDecimal)) {
            return orderQuantity.compareTo(bigDecimal) == 0 ? g.CLOSE_POSITIONS : orderQuantity.compareTo(bigDecimal) > 0 ? g.CHANGE_POSITION_SIDE : g.REDUCE_POSITIONS;
        }
        return g.OPEN_POSITION;
    }
}

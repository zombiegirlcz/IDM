package tsl;

import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.retail.trading.core.domain.orders.InvestFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMarginOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMutualFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOptionOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class g {
    public static final String a(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (jVar instanceof i) {
            return com.revolut.retail.trading.core.domain.orders.a.j(((i) jVar).f274177a);
        }
        if (jVar instanceof h) {
            return com.revolut.retail.trading.core.domain.orders.a.h(((h) jVar).f274176a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final f b(InvestOrder investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "<this>");
        if (investOrder instanceof InvestOrder.InvestSecuritiesOrder) {
            return io3.h.o(investOrder.getD()) ? new d((InvestOrder.InvestSecuritiesOrder) investOrder) : new i((InvestOrder.InvestSecuritiesOrder) investOrder);
        }
        if (investOrder instanceof InvestMarginOrder) {
            return new h((InvestMarginOrder) investOrder);
        }
        if (investOrder instanceof InvestCommodityOrder) {
            return new a((InvestCommodityOrder) investOrder);
        }
        if (investOrder instanceof InvestFundOrder) {
            return new b((InvestFundOrder) investOrder);
        }
        if (investOrder instanceof InvestMutualFundOrder) {
            return new c((InvestMutualFundOrder) investOrder);
        }
        if (investOrder instanceof InvestOptionOrder) {
            return new e((InvestOptionOrder) investOrder);
        }
        throw new NoWhenBranchMatchedException();
    }
}

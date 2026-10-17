package zkh;

import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.retail.trading.core.domain.orders.InvestFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMarginOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMutualFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOptionOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrderExtended;
import com.revolut.retail.trading.core.domain.orders.InvestStockOrder;
import com.revolut.retail.trading.core.domain.orders.InvestTaaOrder;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f323019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f323020b;

    public n(f01.c uikitResources) {
        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
        this.f323019a = uikitResources;
        this.f323020b = yhm.j.b(new zh0.b(this, 7));
    }

    public final boolean a(String searchQuery, InvestOrderExtended orderExtended) {
        String str;
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(orderExtended, "orderExtended");
        xi0.b bVar = (xi0.b) orderExtended.getOrder().getK().f186385a;
        boolean zH = jli.g.h(bVar.f306286a, searchQuery);
        boolean zH2 = jli.g.h(this.f323019a.b(new CurrencyClause(bVar, null, null, 6)).toString(), searchQuery);
        boolean zA = zsc.p.WORD_PREFIX.a(searchQuery, zhm.u.c((String) this.f323020b.getValue()));
        InvestOrder order = orderExtended.getOrder();
        if (order instanceof InvestCommodityOrder) {
            str = null;
        } else if (order instanceof InvestFundOrder) {
            str = ((InvestFundOrder) order).f104537s;
        } else if (order instanceof InvestMutualFundOrder) {
            str = ((InvestMutualFundOrder) order).f104579s;
        } else if (order instanceof InvestOptionOrder) {
            str = ((InvestOptionOrder) order).f104600s;
        } else if (order instanceof InvestMarginOrder) {
            str = ((InvestMarginOrder) order).z;
        } else if (order instanceof InvestStockOrder) {
            str = ((InvestStockOrder) order).f104623q;
        } else {
            if (!(order instanceof InvestTaaOrder)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((InvestTaaOrder) order).f104640q;
        }
        if (zA || zH || zH2) {
            return true;
        }
        return pd.b.j(str != null ? Boolean.valueOf(jli.g.h(str, searchQuery)) : null);
    }
}

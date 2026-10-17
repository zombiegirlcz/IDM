package r1i;

import com.revolut.feature.exchange.models.ExchangeLinkedOrderSpec;
import com.revolut.feature.exchange.models.ExchangeOrderSpec;
import com.revolut.feature.exchange.models.TakeProfitStopLoss;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.MoneyDetails;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d {
    public static final Limit.LowerRestrictionLimit a(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof Limit.LowerRestrictionLimit) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Limit.LowerRestrictionLimit) next).f104743a, "brl_usd_min_order")) {
                break;
            }
        }
        return (Limit.LowerRestrictionLimit) next;
    }

    public static final Limit.UpperRestrictionLimit b(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof Limit.UpperRestrictionLimit) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Limit.UpperRestrictionLimit) next).f104746a, "brl_usd_max_order")) {
                break;
            }
        }
        return (Limit.UpperRestrictionLimit) next;
    }

    public static final Limit.UsageLimit c(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof Limit.UsageLimit) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Limit.UsageLimit) next).f104749a, "brl_usd_annual_fx_limit")) {
                break;
            }
        }
        return (Limit.UsageLimit) next;
    }

    public static final Limit.LowerRestrictionLimit d(ExchangeOrderDraft exchangeOrderDraft) {
        Object next;
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        List list = exchangeOrderDraft.f96889q;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof Limit.LowerRestrictionLimit) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Limit.LowerRestrictionLimit) next).f104743a, "commodity_order_min_size")) {
                break;
            }
        }
        return (Limit.LowerRestrictionLimit) next;
    }

    public static final Limit.LowerRestrictionLimit e(ExchangeOrderDraft exchangeOrderDraft) {
        Object next;
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        List list = exchangeOrderDraft.f96889q;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof Limit.LowerRestrictionLimit) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Limit.LowerRestrictionLimit) next).f104743a, "crypto_order_min_size")) {
                break;
            }
        }
        return (Limit.LowerRestrictionLimit) next;
    }

    public static final Limit.UpperRestrictionLimit f(ExchangeOrderDraft exchangeOrderDraft) {
        Object next;
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        List list = exchangeOrderDraft.f96889q;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof Limit.UpperRestrictionLimit) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Limit.UpperRestrictionLimit) next).f104746a, "crypto_order_max_size")) {
                break;
            }
        }
        return (Limit.UpperRestrictionLimit) next;
    }

    public static final MoneyDetails g(ExchangeOrderDraft exchangeOrderDraft, h inputPosition) {
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        int i = c.f251011a[inputPosition.ordinal()];
        if (i == 1) {
            return exchangeOrderDraft.f96879a;
        }
        if (i == 2) {
            return exchangeOrderDraft.f96880b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Limit.UsageLimit h(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof Limit.UsageLimit) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Limit.UsageLimit) next).f104749a, "mx_fcy_balance_limit")) {
                break;
            }
        }
        return (Limit.UsageLimit) next;
    }

    public static final boolean i(ExchangeOrderDraft exchangeOrderDraft) {
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        return cp5.d.y(exchangeOrderDraft.f96879a.f96897a) || cp5.d.y(exchangeOrderDraft.f96880b.f96897a);
    }

    public static final boolean j(ExchangeOrderDraft exchangeOrderDraft) {
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        return cp5.d.z(exchangeOrderDraft.f96879a.f96897a) || cp5.d.z(exchangeOrderDraft.f96880b.f96897a);
    }

    public static final ExchangeOrderSpec k(ExchangeOrderDraft exchangeOrderDraft) {
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        wd6.h hVar = exchangeOrderDraft.e;
        double d = exchangeOrderDraft.f96885l;
        BigDecimal bigDecimal = exchangeOrderDraft.f96883h;
        if (bigDecimal == null) {
            throw new IllegalArgumentException("Current rate should be present");
        }
        double dDoubleValue = bigDecimal.doubleValue();
        wd6.e eVar = exchangeOrderDraft.f96881c;
        MoneyDetails moneyDetails = exchangeOrderDraft.f96879a;
        xi0.b bVar = moneyDetails.f96897a;
        MoneyDetails moneyDetails2 = exchangeOrderDraft.f96880b;
        return new ExchangeOrderSpec(hVar, d, dDoubleValue, eVar, new Pair(bVar, moneyDetails2.f96897a), exchangeOrderDraft.f96882g == h.TOP ? yh5.b.T(moneyDetails) : yh5.b.T(moneyDetails2));
    }

    public static final ExchangeLinkedOrderSpec l(ExchangeOrderDraft exchangeOrderDraft) {
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        BigDecimal bigDecimal = exchangeOrderDraft.f96883h;
        if (bigDecimal == null) {
            throw new IllegalArgumentException("Current rate should be present");
        }
        double dDoubleValue = bigDecimal.doubleValue();
        wd6.e eVar = exchangeOrderDraft.f96881c;
        MoneyDetails moneyDetails = exchangeOrderDraft.f96879a;
        xi0.b bVar = moneyDetails.f96897a;
        MoneyDetails moneyDetails2 = exchangeOrderDraft.f96880b;
        Pair pair = new Pair(bVar, moneyDetails2.f96897a);
        dj0.d dVarT = exchangeOrderDraft.f96882g == h.TOP ? yh5.b.T(moneyDetails) : yh5.b.T(moneyDetails2);
        TakeProfitStopLoss takeProfitStopLoss = exchangeOrderDraft.f;
        return new ExchangeLinkedOrderSpec(dDoubleValue, eVar, pair, dVarT, takeProfitStopLoss != null ? takeProfitStopLoss.f72160b : null, takeProfitStopLoss != null ? takeProfitStopLoss.f72161c : null);
    }
}

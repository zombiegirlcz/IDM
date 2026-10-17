package i7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e {
    public static final Limit.LowerRestrictionLimit a(ExchangeOrderDraft exchangeOrderDraft) {
        Object next;
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        List list = exchangeOrderDraft.f99896r;
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

    public static final Limit.LowerRestrictionLimit b(ExchangeOrderDraft exchangeOrderDraft) {
        Object next;
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        List list = exchangeOrderDraft.f99896r;
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

    public static final Limit.UpperRestrictionLimit c(ExchangeOrderDraft exchangeOrderDraft) {
        Object next;
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        List list = exchangeOrderDraft.f99896r;
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

    public static final MoneyDetails d(ExchangeOrderDraft exchangeOrderDraft) {
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        return e(exchangeOrderDraft, exchangeOrderDraft.f);
    }

    public static final MoneyDetails e(ExchangeOrderDraft exchangeOrderDraft, j inputPosition) {
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        int i = d.f159327a[inputPosition.ordinal()];
        if (i == 1) {
            return exchangeOrderDraft.f99885a;
        }
        if (i == 2) {
            return exchangeOrderDraft.f99886b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final MoneyDetails f(ExchangeOrderDraft exchangeOrderDraft) {
        j jVar;
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        int i = d.f159327a[exchangeOrderDraft.f.ordinal()];
        if (i == 1) {
            jVar = j.BOTTOM;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = j.TOP;
        }
        return e(exchangeOrderDraft, jVar);
    }
}

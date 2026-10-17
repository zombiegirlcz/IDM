package kyh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class k {
    public static final Limit.UsageLimit a(List list) {
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
            if (Intrinsics.f(((Limit.UsageLimit) next).f104749a, "aed_balance_limit")) {
                break;
            }
        }
        return (Limit.UsageLimit) next;
    }

    public static final Limit.LowerRestrictionLimit b(CryptoOrderDraft cryptoOrderDraft) {
        Object next;
        Intrinsics.checkNotNullParameter(cryptoOrderDraft, "<this>");
        List list = cryptoOrderDraft.i;
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

    public static final Limit.UpperRestrictionLimit c(CryptoOrderDraft cryptoOrderDraft) {
        Object next;
        Intrinsics.checkNotNullParameter(cryptoOrderDraft, "<this>");
        List list = cryptoOrderDraft.i;
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

    public static final CryptoExchangeContract$MoneyDetails d(CryptoOrderDraft cryptoOrderDraft) {
        Intrinsics.checkNotNullParameter(cryptoOrderDraft, "<this>");
        return e(cryptoOrderDraft, cryptoOrderDraft.d);
    }

    public static final CryptoExchangeContract$MoneyDetails e(CryptoOrderDraft cryptoOrderDraft, g inputPosition) {
        Intrinsics.checkNotNullParameter(cryptoOrderDraft, "<this>");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        int i = j.f190908a[inputPosition.ordinal()];
        if (i == 1) {
            return cryptoOrderDraft.f96689a;
        }
        if (i == 2) {
            return cryptoOrderDraft.f96690b;
        }
        throw new NoWhenBranchMatchedException();
    }
}

package x8h;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2f.a f303372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oc.f f303373b;

    public q(y2f.a tradingTransactionsInteractor, oc.f transactionsDependenciesProvider) {
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsDependenciesProvider, "transactionsDependenciesProvider");
        this.f303372a = tradingTransactionsInteractor;
        this.f303373b = transactionsDependenciesProvider;
    }

    public final Flow a(List trades) {
        Intrinsics.checkNotNullParameter(trades, "trades");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : trades) {
            WealthAccountType wealthAccountTypeB = ((dfl.i0) obj2).b();
            Object arrayList = linkedHashMap.get(wealthAccountTypeB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(wealthAccountTypeB, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            WealthAccountType accountType = (WealthAccountType) entry.getKey();
            List list = (List) entry.getValue();
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            arrayList2.add(nim.a.A(com.revolut.data.database.models.openbanking.d.x("InvestTransactionsInteractorImpl", "transactionsFlow", this.f303373b.a(accountType).b().a(list)), new h(2)));
        }
        return arrayList2.isEmpty() ? new go.g(zi0.c.P(zhm.f0.f322471a, false, null, 3), 2) : nim.a.v(zh9.u0.k(arrayList2), new x5f.m(trades, 4));
    }

    public final Flow b(z2f.g params, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new x64.b(this, null, 5), ((d4f.p) this.f303372a).j(params, loadingStrategy));
    }
}

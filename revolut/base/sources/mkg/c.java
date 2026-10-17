package mkg;

import ahe.i;
import androidx.sqlite.db.SimpleSQLiteQuery;
import com.revolut.data.model.Data;
import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter;
import d4f.p;
import go.g;
import java.io.IOException;
import java.util.List;
import jhi.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.y;
import x8h.q;
import xni.h;
import y3f.v;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements ikg.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2f.a f206288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f206289b;

    public c(y2f.a tradingTransactionsInteractor, q investTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        Intrinsics.checkNotNullParameter(investTransactionsInteractor, "investTransactionsInteractor");
        this.f206288a = tradingTransactionsInteractor;
        this.f206289b = investTransactionsInteractor;
    }

    @Override // ikg.f
    public final Flow a(ikg.e params) {
        k kVarA;
        Intrinsics.checkNotNullParameter(params, "params");
        InvestTransactionsFilter investTransactionsFilter = params.d.f94568b;
        if (investTransactionsFilter == null) {
            return new g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        TradingTransactionsFilter.TradingTransactionsFilterImpl tradingTransactionsFilterImplA = com.revolut.shared.feature.wealth.models.transaction.a.a(investTransactionsFilter);
        ikg.d dVar = params.f161968a;
        boolean zEquals = dVar.equals(ikg.c.f161967a);
        y2f.a aVar = this.f206288a;
        if (zEquals) {
            kVarA = y2f.a.c(aVar, tradingTransactionsFilterImplA, params.f161970c, params.f161969b, 8);
        } else if (dVar instanceof ikg.a) {
            String str = params.f161970c;
            ikg.a aVar2 = (ikg.a) dVar;
            skg.c cVar = aVar2.f161964b;
            skg.a aVar3 = cVar instanceof skg.a ? (skg.a) cVar : null;
            kVarA = y2f.a.b(aVar, tradingTransactionsFilterImplA, str, aVar3 != null ? aVar3.f263946a : null, aVar2.f161963a, params.f161969b, 32);
        } else {
            if (!(dVar instanceof ikg.b)) {
                throw new NoWhenBranchMatchedException();
            }
            String str2 = params.f161970c;
            ikg.b bVar = (ikg.b) dVar;
            skg.c cVar2 = bVar.f161966b;
            skg.a aVar4 = cVar2 instanceof skg.a ? (skg.a) cVar2 : null;
            kVarA = y2f.a.a(aVar, tradingTransactionsFilterImplA, str2, aVar4 != null ? aVar4.f263946a : null, bVar.f161965a, params.f161969b, 64);
        }
        return xam.a.h(new b(this, null), kVarA);
    }

    @Override // ikg.f
    public final Flow b(UnifiedTransactionsFilter filter) throws IOException {
        Intrinsics.checkNotNullParameter(filter, "filter");
        InvestTransactionsFilter investTransactionsFilter = filter.f94568b;
        if (investTransactionsFilter == null) {
            return new g(f0.f322471a, 2);
        }
        TradingTransactionsFilter.TradingTransactionsFilterImpl filter2 = com.revolut.shared.feature.wealth.models.transaction.a.a(investTransactionsFilter);
        p pVar = (p) this.f206288a;
        Intrinsics.checkNotNullParameter(filter2, "filter");
        v vVar = (v) pVar.f111300a;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(filter2, "filter");
        j3f.f fVar = vVar.e;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(filter2, "filter");
        Pair pairJ = j3f.f.j(filter2);
        List list = (List) pairJ.f186385a;
        List list2 = (List) pairJ.f186386b;
        StringBuilder sb6 = new StringBuilder("SELECT DISTINCT COALESCE(completed_at, updated_at, created_at) AS sorting_date FROM trading_trades");
        if (!list.isEmpty()) {
            sb6.append(" WHERE " + d0.k0(list, " AND ", null, null, 0, null, 62));
        }
        sb6.append(" ORDER BY sorting_date ASC");
        return new i(new y(new h(vVar, null, 24), fVar.g(new SimpleSQLiteQuery(sb6.toString(), list2.toArray(new Object[0])))), 6);
    }
}

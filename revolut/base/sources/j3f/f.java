package j3f;

import androidx.sqlite.db.SimpleSQLiteQuery;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import y20.a1;
import y3f.t;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public abstract class f {

    @NotNull
    public static final a Companion = new a(0);

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a {
        private a() {
        }

        public a(int i) {
        }
    }

    public static SimpleSQLiteQuery a(TradingTransactionsFilter tradingTransactionsFilter, String str, long j2, int i, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb6 = new StringBuilder("SELECT * FROM trading_trades");
        ArrayList arrayList2 = new ArrayList();
        Pair pairJ = j(tradingTransactionsFilter);
        List list = (List) pairJ.f186385a;
        List list2 = (List) pairJ.f186386b;
        arrayList2.addAll(list);
        arrayList.addAll(list2);
        if (str == null) {
            arrayList2.add("COALESCE(completed_at, updated_at, created_at) " + (z ? "<=" : "<") + " ?");
            arrayList.add(Long.valueOf(j2));
        } else {
            arrayList2.add("(COALESCE(completed_at, updated_at, created_at) < ? OR (COALESCE(completed_at, updated_at, created_at) = ? AND trade_id " + (z ? "<=" : "<") + " ?))");
            arrayList.add(Long.valueOf(j2));
            arrayList.add(Long.valueOf(j2));
            arrayList.add(str);
        }
        sb6.append(i(arrayList2));
        sb6.append(" ORDER BY COALESCE(completed_at, updated_at, created_at) DESC, trade_id DESC LIMIT ?");
        arrayList.add(Integer.valueOf(i));
        return new SimpleSQLiteQuery(sb6.toString(), arrayList.toArray(new Object[0]));
    }

    public static SimpleSQLiteQuery b(TradingTransactionsFilter tradingTransactionsFilter, String str, long j2, int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb6 = new StringBuilder("SELECT * FROM trading_trades");
        ArrayList arrayList2 = new ArrayList();
        Pair pairJ = j(tradingTransactionsFilter);
        List list = (List) pairJ.f186385a;
        List list2 = (List) pairJ.f186386b;
        arrayList2.addAll(list);
        arrayList.addAll(list2);
        if (str == null) {
            arrayList2.add("COALESCE(completed_at, updated_at, created_at) > ?");
            arrayList.add(Long.valueOf(j2));
        } else {
            arrayList2.add("(COALESCE(completed_at, updated_at, created_at) > ? OR (COALESCE(completed_at, updated_at, created_at) = ? AND trade_id > ?))");
            arrayList.add(Long.valueOf(j2));
            arrayList.add(Long.valueOf(j2));
            arrayList.add(str);
        }
        sb6.append(i(arrayList2));
        sb6.append(" ORDER BY COALESCE(completed_at, updated_at, created_at) ASC, trade_id ASC LIMIT ?");
        arrayList.add(Integer.valueOf(i));
        return new SimpleSQLiteQuery(sb6.toString(), arrayList.toArray(new Object[0]));
    }

    public static SimpleSQLiteQuery c(TradingTransactionsFilter.TradingTransactionsFilterImpl tradingTransactionsFilterImpl, Long l2, Long l3, int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb6 = new StringBuilder("SELECT * FROM trading_trades");
        ArrayList arrayList2 = new ArrayList();
        Pair pairJ = j(tradingTransactionsFilterImpl);
        List list = (List) pairJ.f186385a;
        List list2 = (List) pairJ.f186386b;
        arrayList2.addAll(list);
        arrayList.addAll(list2);
        if (l2 != null) {
            arrayList2.add("COALESCE(completed_at, updated_at, created_at) >= ?");
            arrayList.add(l2);
        }
        if (l3 != null) {
            arrayList2.add("COALESCE(completed_at, updated_at, created_at) < ?");
            arrayList.add(l3);
        }
        sb6.append(i(arrayList2));
        sb6.append(" ORDER BY COALESCE(completed_at, updated_at, created_at) DESC, trade_id DESC LIMIT ?");
        arrayList.add(Integer.valueOf(i));
        return new SimpleSQLiteQuery(sb6.toString(), arrayList.toArray(new Object[0]));
    }

    public static String i(ArrayList arrayList) {
        return arrayList.isEmpty() ? "" : d0.k0(arrayList, " AND ", " WHERE ", null, 0, null, 60);
    }

    public static Pair j(TradingTransactionsFilter tradingTransactionsFilter) throws IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TradingTransactionsFilter.TradingTransactionsFilterImpl tradingTransactionsFilterImpl = (TradingTransactionsFilter.TradingTransactionsFilterImpl) tradingTransactionsFilter;
        Set f105347a = tradingTransactionsFilterImpl.getF105347a();
        ArrayList arrayList3 = new ArrayList(w.t(f105347a, 10));
        Iterator it8 = f105347a.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((WealthAccountType) it8.next()).getRawValue());
        }
        ArrayList arrayList4 = !arrayList3.isEmpty() ? arrayList3 : null;
        if (arrayList4 != null) {
            arrayList.add("account_type IN (" + d0.k0(arrayList4, ",", null, null, 0, new d(1), 30) + ")");
            arrayList2.addAll(arrayList4);
        }
        Set f105348b = tradingTransactionsFilterImpl.getF105348b();
        ArrayList arrayList5 = new ArrayList(w.t(f105348b, 10));
        Iterator it9 = f105348b.iterator();
        while (it9.hasNext()) {
            arrayList5.add(((xi0.b) it9.next()).f306286a);
        }
        ArrayList arrayList6 = !arrayList5.isEmpty() ? arrayList5 : null;
        if (arrayList6 != null) {
            String strK0 = d0.k0(arrayList6, ",", null, null, 0, new d(2), 30);
            arrayList.add(j6.a.w(v0.a.m("(base_instrument_currency IN (", strK0, ") OR counter_instrument_currency IN (", strK0, ") OR currency_pair_first IN ("), strK0, ") OR currency_pair_second IN (", strK0, "))"));
            arrayList2.addAll(arrayList6);
            arrayList2.addAll(arrayList6);
            arrayList2.addAll(arrayList6);
            arrayList2.addAll(arrayList6);
        }
        if (tradingTransactionsFilterImpl.getD() != null) {
            arrayList.add("client_order_id = ?");
            String d = tradingTransactionsFilterImpl.getD();
            if (d == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList2.add(d);
        }
        if (tradingTransactionsFilterImpl.getE() != null) {
            arrayList.add("standing_order_id = ?");
            String e = tradingTransactionsFilterImpl.getE();
            if (e == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList2.add(e);
        }
        if (tradingTransactionsFilterImpl.getF105349c() != null) {
            arrayList.add("portfolio_id = ?");
            String f105349c = tradingTransactionsFilterImpl.getF105349c();
            if (f105349c == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList2.add(f105349c);
        }
        if (tradingTransactionsFilterImpl.getF() != null) {
            arrayList.add("transfer_request_id = ?");
            String f = tradingTransactionsFilterImpl.getF();
            if (f == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList2.add(f);
        }
        if (tradingTransactionsFilterImpl.getF105350g() != null) {
            arrayList.add("awaiting_settlement = ?");
            Boolean f105350g = tradingTransactionsFilterImpl.getF105350g();
            if (f105350g == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList2.add(f105350g);
        }
        return new Pair(arrayList, arrayList2);
    }

    public abstract Object d(List list, a1 a1Var);

    public abstract Object e(String str, t tVar);

    public abstract Object f(SimpleSQLiteQuery simpleSQLiteQuery, gim.i iVar);

    public abstract Flow g(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract Flow h(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract Object k(List list, gim.c cVar);
}

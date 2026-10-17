package ybl;

import ael.k0;
import ael.q0;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public interface k {
    static Object a(k kVar, TradingAccountType tradingAccountType, String str, gim.c cVar, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        return ((q0) kVar).m(tradingAccountType, str, null, cVar);
    }

    static akg.n b(k kVar, TradingAccountType accountType, int i) {
        q0 q0Var = (q0) kVar;
        q0Var.getClass();
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        cfl.m accountHolderTypeFilter = cfl.m.f23746a;
        Intrinsics.checkNotNullParameter(accountHolderTypeFilter, "accountHolderTypeFilter");
        return nim.a.v(k(q0Var, loadingStrategy, null, accountHolderTypeFilter, 2), new k0(accountType, 0));
    }

    static akg.n d(k kVar, String accountId) {
        q0 q0Var = (q0) kVar;
        q0Var.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(k(q0Var, loadingStrategy, null, cfl.k.f23744a, 2), new a31.g(accountId, 17));
    }

    static akg.n f(k kVar, Set set, int i) {
        if ((i & 1) != 0) {
            set = null;
        }
        cfl.n accountHolderTypeFilter = (i & 4) != 0 ? cfl.m.f23746a : cfl.k.f23744a;
        q0 q0Var = (q0) kVar;
        q0Var.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(accountHolderTypeFilter, "accountHolderTypeFilter");
        return nim.a.v(k(q0Var, loadingStrategy, null, accountHolderTypeFilter, 2), new acb.f(q0Var, set, 14));
    }

    static Flow g(k kVar, Function1 predicate) {
        q0 q0Var = (q0) kVar;
        q0Var.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return vkm.q.q(nim.a.v(k(q0Var, null, null, cfl.m.f23746a, 3), new a31.k(3, predicate)));
    }

    static akg.n h(k kVar, TradingAccountType accountType, w4l.k loadingStrategy, int i) {
        if ((i & 2) != 0) {
            loadingStrategy = w4l.h.f294642c;
        }
        cfl.n accountHolderTypeFilter = (i & 4) != 0 ? cfl.m.f23746a : cfl.k.f23744a;
        q0 q0Var = (q0) kVar;
        q0Var.getClass();
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(accountHolderTypeFilter, "accountHolderTypeFilter");
        return nim.a.v(q0Var.n(y0.b(accountType), loadingStrategy, accountHolderTypeFilter), new aed.a(24));
    }

    static akg.n j(k kVar) {
        q0 q0Var = (q0) kVar;
        q0Var.getClass();
        TradingAccountType.Gia accountType = TradingAccountType.Gia.f105270a;
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        cfl.m accountHolderTypeFilter = cfl.m.f23746a;
        Intrinsics.checkNotNullParameter(accountHolderTypeFilter, "accountHolderTypeFilter");
        return nim.a.v(k(q0Var, loadingStrategy, null, accountHolderTypeFilter, 2), new aed.a(23));
    }

    static Flow k(k kVar, w4l.k loadingStrategy, cfl.i tradingAccountHolderIdFilter, cfl.n accountHolderTypeFilter, int i) {
        if ((i & 1) != 0) {
            loadingStrategy = w4l.h.f294642c;
        }
        if ((i & 2) != 0) {
            tradingAccountHolderIdFilter = cfl.g.f23742a;
        }
        if ((i & 4) != 0) {
            accountHolderTypeFilter = cfl.m.f23746a;
        }
        q0 q0Var = (q0) kVar;
        q0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(tradingAccountHolderIdFilter, "tradingAccountHolderIdFilter");
        Intrinsics.checkNotNullParameter(accountHolderTypeFilter, "accountHolderTypeFilter");
        return q0Var.p(loadingStrategy, tradingAccountHolderIdFilter, accountHolderTypeFilter);
    }

    static vkm.d l(k kVar, UUID id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vdl.y0 y0Var = ((q0) kVar).f3647a;
        y0Var.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return y0Var.f288069a.b(id10, loadingStrategy);
    }
}

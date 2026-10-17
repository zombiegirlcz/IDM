package tzg;

import akg.n;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.jvm.internal.Intrinsics;
import x8h.v0;

/* JADX INFO: loaded from: classes9.dex */
public interface m {
    static n a(m mVar, WealthAccountType accountType) {
        v0 v0Var = (v0) mVar;
        v0Var.getClass();
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(c(v0Var, loadingStrategy, null, 2), new n28.a(accountType, 2));
    }

    static n b(m mVar, String portfolioId) {
        v0 v0Var = (v0) mVar;
        v0Var.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(ybl.k.k(v0Var.f303396c, null, null, cfl.k.f23744a, 3), new x52.a(portfolioId, v0Var, 12));
    }

    static /* synthetic */ n c(m mVar, w4l.k kVar, cfl.n nVar, int i) {
        if ((i & 1) != 0) {
            kVar = w4l.h.f294642c;
        }
        if ((i & 2) != 0) {
            nVar = cfl.m.f23746a;
        }
        return ((v0) mVar).e(kVar, nVar);
    }

    static n d(m mVar, WealthAccountType accountType, cfl.n accountHolderTypeFilter, int i) {
        w4l.k loadingStrategy = (i & 2) != 0 ? w4l.h.f294642c : w4l.i.f294643c;
        if ((i & 4) != 0) {
            accountHolderTypeFilter = cfl.m.f23746a;
        }
        v0 v0Var = (v0) mVar;
        v0Var.getClass();
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(accountHolderTypeFilter, "accountHolderTypeFilter");
        return nim.a.v(v0Var.e(loadingStrategy, accountHolderTypeFilter), new n28.a(accountType, 1));
    }
}

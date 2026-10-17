package anf;

import com.revolut.core.model.account.AccountId;
import grl.r2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements whf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nhf.a f7749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f7750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f7751c;
    public final d3j.b d;
    public final y45.h e;
    public final ar3.c f;

    public r(nhf.a unitedWalletInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, b sumCalculator, d3j.b beneficiariesInteractor, y45.h loanProductFeatureTogglesInteractor, ar3.c multiCurrencyMoneyInteractor) {
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(sumCalculator, "sumCalculator");
        Intrinsics.checkNotNullParameter(beneficiariesInteractor, "beneficiariesInteractor");
        Intrinsics.checkNotNullParameter(loanProductFeatureTogglesInteractor, "loanProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(multiCurrencyMoneyInteractor, "multiCurrencyMoneyInteractor");
        this.f7749a = unitedWalletInteractor;
        this.f7750b = transactionsInteractor;
        this.f7751c = sumCalculator;
        this.d = beneficiariesInteractor;
        this.e = loanProductFeatureTogglesInteractor;
        this.f = multiCurrencyMoneyInteractor;
    }

    public final efm.r b(AccountId accountId) {
        efm.r map;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        boolean z = accountId instanceof AccountId.Personal;
        d3j.b bVar = this.d;
        nhf.a aVar = this.f7749a;
        if (z) {
            efm.r rVarF = ((njf.j) aVar).f();
            efm.r rVarG = m70.a.g(rd0.e.c(this.e.e(r2.UNRECOGNIZED), kotlin.coroutines.g.f186406a), null, new an4.g(8), 1);
            amf.i iVar = new amf.i(26);
            h0 h0Var = h0.f322473a;
            efm.r rVarSwitchMap = ue0.e.H(rVarG, h0Var, iVar).switchMap(new ai0.j(new an4.f(this, 11), 23));
            Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
            efm.r rVarDistinctUntilChanged = ue0.e.H(rVarSwitchMap, h0Var, new amf.i(27)).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
            map = te0.w.m(rVarF, rVarDistinctUntilChanged, ue0.e.H(m70.a.e(w2j.a.d(bVar, null, false, null, 5), new an4.g(9), new an4.g(10)), h0Var, new p(3))).map(new ai0.j(new amf.i(23), 20));
        } else {
            if (!(accountId instanceof AccountId.Joint)) {
                throw new NoWhenBranchMatchedException();
            }
            map = te0.w.l(((njf.j) aVar).b(accountId), ue0.e.H(m70.a.e(w2j.a.d(bVar, null, false, null, 5), new an4.g(6), new an4.g(7)), h0.f322473a, new amf.i(24))).map(new ai0.j(new amf.i(25), 21));
        }
        Intrinsics.h(map);
        return ue0.e.H(map, h0.f322473a, new p(2));
    }
}

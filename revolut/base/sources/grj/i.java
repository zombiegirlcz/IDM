package grj;

import a5k.s;
import com.revolut.core.model.account.AccountId;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import pfm.r;
import pfm.t;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements pzi.b {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final krj.d f146036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f146037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ge3.e f146038c;
    public final o d;

    public i(krj.d budgetingRepository, wsg.n walletInteractor, ge3.e transactionCategorisationInteractor) {
        Intrinsics.checkNotNullParameter(budgetingRepository, "budgetingRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transactionCategorisationInteractor, "transactionCategorisationInteractor");
        this.f146036a = budgetingRepository;
        this.f146037b = walletInteractor;
        this.f146038c = transactionCategorisationInteractor;
        b.Companion companion = kotlin.time.b.INSTANCE;
        this.d = new o(kotlin.time.c.g(3, pkm.e.SECONDS), new gmk.j(this, 14));
    }

    public final ufm.i a(AccountId accountId, dj0.d amount, String budgetingCategory) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(budgetingCategory, "budgetingCategory");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ufm.i iVar = new ufm.i(c(accountId), new gqk.b(new a9j.n(this, 4, amount, budgetingCategory), 11), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final r b(qzi.a budget) {
        Intrinsics.checkNotNullParameter(budget, "budget");
        krj.d dVar = this.f146036a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(budget, "budget");
        t tVarL = dVar.f188880a.deleteWalletBudget(budget.f250646a, budget.f250647b).l(new hc7.a(dVar, budget, 20));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return w.g0(tVarL);
    }

    public final ufm.i c(AccountId accountId) {
        d0 d0VarE;
        if (accountId instanceof AccountId.Joint) {
            d0VarE = d0.m(((AccountId.Joint) accountId).f51413b);
        } else {
            if (!(accountId instanceof AccountId.Personal)) {
                throw new NoWhenBranchMatchedException();
            }
            d0VarE = this.f146037b.E(accountId);
        }
        h function = h.f146035a;
        Intrinsics.checkNotNullParameter(function, "function");
        ufm.i iVar = new ufm.i(d0VarE, new p96.a(14), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final efm.r d(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        o oVar = this.d;
        oVar.getClass();
        efm.r rVarDefer = efm.r.defer(new fag.g(oVar, accountId, 7));
        Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
        efm.r rVarDistinctUntilChanged = m70.a.g(rVarDefer, null, new gp3.n(18), 1).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final pfm.h e(AccountId accountId, boolean z) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        pfm.h hVar = new pfm.h(new a6j.b(this, accountId, z, 6), 1);
        Intrinsics.checkNotNullExpressionValue(hVar, "defer(...)");
        return hVar;
    }

    public final ufm.i f(dj0.d amount, String budgetId, String budgetingCategory, AccountId accountId) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(budgetId, "budgetId");
        Intrinsics.checkNotNullParameter(budgetingCategory, "budgetingCategory");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ufm.i iVar = new ufm.i(c(accountId), new gqk.b(new s(this, amount, budgetId, budgetingCategory, 3), 12), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}

package y45;

import com.revolut.feature.credit.loan.api.models.LoanRepaymentDayChangeTerms;
import com.revolut.feature.credit.loan.impl.network.LoanService;
import efm.d0;
import efm.r;
import i55.c0;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import o55.f0;
import o55.z;
import p35.p0;
import p35.u0;
import q35.g0;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements l35.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f310794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f310795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f310796c;
    public final g d;
    public final y51.a e;
    public final ang.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wsg.n f310797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f310798h;
    public final zj4.a i;

    public f(z loanRepository, f0 loanRepositoryLegacy, com.revolut.domain.interactors.transactions.a transactionsInteractor, i loanProductInteractor, g loanInteractorLegacy, y51.a externalCardsInteractor, ang.f userInteractor, wsg.n walletInteractor, j loanRepaymentsInteractor, zj4.a externalLinkedAccountsInteractor) {
        Intrinsics.checkNotNullParameter(loanRepository, "loanRepository");
        Intrinsics.checkNotNullParameter(loanRepositoryLegacy, "loanRepositoryLegacy");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanInteractorLegacy, "loanInteractorLegacy");
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(loanRepaymentsInteractor, "loanRepaymentsInteractor");
        Intrinsics.checkNotNullParameter(externalLinkedAccountsInteractor, "externalLinkedAccountsInteractor");
        this.f310794a = loanRepository;
        this.f310795b = loanRepositoryLegacy;
        this.f310796c = loanProductInteractor;
        this.d = loanInteractorLegacy;
        this.e = externalCardsInteractor;
        this.f = userInteractor;
        this.f310797g = walletInteractor;
        this.f310798h = loanRepaymentsInteractor;
        this.i = externalLinkedAccountsInteractor;
    }

    public final pfm.a g(String loanId, String cardId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        z zVar = this.f310794a;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        pfm.a aVarE = w.g0(zVar.f222381a.linkCardToLoanManagement(loanId, new l55.a(cardId))).e(r(loanId));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final pfm.a h(String loanId, int i, LoanRepaymentDayChangeTerms newScheduleInfo) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(newScheduleInfo, "newScheduleInfo");
        z zVar = this.f310794a;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(newScheduleInfo, "newScheduleInfo");
        LoanService loanService = zVar.f222381a;
        jo3.a aVarP = mo3.a.p(newScheduleInfo.getF70078c());
        String string = newScheduleInfo.getF70077b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        jo3.a aVarP2 = mo3.a.p(newScheduleInfo.getF70076a());
        String string2 = newScheduleInfo.getE().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        pfm.a aVarE = w.g0(loanService.changeRepaymentDay(loanId, new l55.e(i, aVarP, string, aVarP2, string2, newScheduleInfo.getF70079g()))).e(r(loanId));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final ufm.n i(String loanId, Long l2, g0 g0Var) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        j jVar = this.f310798h;
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        o55.w wVar = jVar.f310804a;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        d0<i55.f0> loanRepaymentTerms = wVar.f222374a.getLoanRepaymentTerms(loanId, l2, g0Var != null ? g0Var.toString() : null);
        o4a.e eVar = new o4a.e(10, new o5.b(16));
        loanRepaymentTerms.getClass();
        ufm.i iVar = new ufm.i(loanRepaymentTerms, eVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }

    public final ufm.n j(int i, String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        z zVar = this.f310794a;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        d0<c0> newChangeDayTerms = zVar.f222381a.getNewChangeDayTerms(loanId, i);
        o4a.e eVar = new o4a.e(22, new o5.b(22));
        newChangeDayTerms.getClass();
        ufm.i iVar = new ufm.i(newChangeDayTerms, eVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }

    public final r k(String loanId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return pd.b.r(nim.a.w(this.d.b(loanId, loadingStrategy), new y25.d(11)), new xwd.o(this, 6, loanId, loadingStrategy));
    }

    public final r l(String loanId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return pd.b.r(this.f310796c.b(loanId, loadingStrategy), new y1.a(this, 10));
    }

    public final r m(String loanId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.d.b(loanId, loadingStrategy);
    }

    public final efm.b n(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        z zVar = this.f310794a;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        efm.b bVarG = zVar.f222384g.g(new o55.a(loanId), false);
        zVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        efm.b bVarS = bVarG.s(zVar.f222385h.g(new o55.f(loanId), false));
        Intrinsics.checkNotNullExpressionValue(bVarS, "mergeWith(...)");
        return bVarS;
    }

    public final pfm.a o(String loanId, String repaymentToken, long j2, g0 g0Var, String str) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(repaymentToken, "repaymentToken");
        pfm.a aVarE = this.f310798h.a(loanId, repaymentToken, j2, g0Var, str).e(r(loanId));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final pfm.a p(String loanId, String bankIdentifier, String accountNumber) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(bankIdentifier, "bankIdentifier");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        z zVar = this.f310794a;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(bankIdentifier, "bankIdentifier");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        pfm.a aVarE = w.g0(zVar.f222381a.setDirectDebitAccount(loanId, new l55.g(bankIdentifier, accountNumber))).e(r(loanId));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final pfm.a q(String loanId, u0 repaymentMethod, p0 newState, String str) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(repaymentMethod, "repaymentMethod");
        Intrinsics.checkNotNullParameter(newState, "newState");
        z zVar = this.f310794a;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(repaymentMethod, "repaymentMethod");
        Intrinsics.checkNotNullParameter(newState, "newState");
        pfm.a aVarE = w.g0(zVar.f222381a.setRepaymentMethodState(loanId, u1.g(repaymentMethod, f55.e.a()), new l55.f(u1.g(newState, f55.e.b()), str))).e(r(loanId));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final pfm.a r(String loanId) {
        f0 f0Var = this.f310795b;
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        efm.b bVarG = f0Var.f.g(loanId, false);
        efm.b bVarG2 = f0Var.f222337g.g("", false);
        i iVar = this.f310796c;
        efm.b bVarG3 = ((o55.q) iVar.f310803a).f222362g.g(o55.g.f222339a, false);
        efm.b bVarG4 = iVar.g(loanId);
        j jVar = this.f310798h;
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        o55.w wVar = jVar.f310804a;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        d0 d0VarK = wVar.f.k(loanId);
        d0VarK.getClass();
        pfm.h hVar = new pfm.h(d0VarK, 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        pfm.d dVarQ = efm.b.q(bVarG, bVarG2, bVarG3, bVarG4, w.g0(hVar));
        Intrinsics.checkNotNullExpressionValue(dVarQ, "mergeArrayDelayError(...)");
        return ue0.e.v(dVarQ);
    }
}

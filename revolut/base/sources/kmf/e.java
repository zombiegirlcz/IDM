package kmf;

import cmf.p;
import go.g;
import hmf.k0;
import kkf.d0;
import kkf.k7;
import kkf.o1;
import kkf.y0;
import klf.h0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import okf.m;
import okf.o;
import okf.r;
import vkm.q;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends hmf.a {
    public final h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.c f185831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k7 f185832h;
    public final d0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final okf.f f185833j;
    public final r k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f185834l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o1 f185835m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y0 f185836n;
    public final clf.a o;

    public e(h0 commonDataSource, jt0.b commonHeaderProvider, amf.c hideTransactionMenuOptionProvider, k7 statusBlockProvider, d0 confirmationBlockProvider, okf.f creditCardExplainerBlockProvider, r creditInterestRelatedTransactionsBlockProvider, o creditInterestRelatedStatementBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(creditCardExplainerBlockProvider, "creditCardExplainerBlockProvider");
        Intrinsics.checkNotNullParameter(creditInterestRelatedTransactionsBlockProvider, "creditInterestRelatedTransactionsBlockProvider");
        Intrinsics.checkNotNullParameter(creditInterestRelatedStatementBlockProvider, "creditInterestRelatedStatementBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f185831g = hideTransactionMenuOptionProvider;
        this.f185832h = statusBlockProvider;
        this.i = confirmationBlockProvider;
        this.f185833j = creditCardExplainerBlockProvider;
        this.k = creditInterestRelatedTransactionsBlockProvider;
        this.f185834l = creditInterestRelatedStatementBlockProvider;
        this.f185835m = getHelpBlockProvider;
        this.f185836n = equivalentBlockProvider;
        this.o = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.o.Z2();
        p pVarA = this.f185836n.a();
        p pVarA2 = k0.a(this.f185832h.a(), this.i.a());
        p pVarA3 = this.f185833j.a();
        r rVar = this.k;
        p pVar = new p(q.Q(rVar.f226029a.c(), new m((Continuation) null, rVar, 1)), new ok7.b(7), u.c(rVar.d), "CreditInterestRelatedTransactions");
        o oVar = this.f185834l;
        return h(v.k(pVarZ2, pVarA, pVarA2, pVarA3, pVar, new p(q.Q(oVar.f226025a.c(), new m((Continuation) null, oVar, 0)), new ok7.b(6), u.c(oVar.d), "CreditInterestRelatedStatement"), this.f185835m.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return new g(f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(u.c(this.f185831g.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}

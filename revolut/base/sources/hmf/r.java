package hmf;

import kkf.a3;
import kkf.d3;
import kkf.k7;
import kkf.o1;
import kkf.x2;
import kkf.y0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends a {
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.c f153900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k7 f153901h;
    public final kkf.d0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d3 f153902j;
    public final a3 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x2 f153903l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o1 f153904m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y0 f153905n;
    public final clf.a o;

    public r(klf.h0 commonDataSource, jt0.b commonHeaderProvider, amf.c hideTransactionMenuOptionProvider, k7 statusBlockProvider, kkf.d0 confirmationBlockProvider, d3 loanDisbursalMortgageBlockProvider, a3 loanDisbursalKarmaBlockProvider, x2 loanDisbursalExternalBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(loanDisbursalMortgageBlockProvider, "loanDisbursalMortgageBlockProvider");
        Intrinsics.checkNotNullParameter(loanDisbursalKarmaBlockProvider, "loanDisbursalKarmaBlockProvider");
        Intrinsics.checkNotNullParameter(loanDisbursalExternalBlockProvider, "loanDisbursalExternalBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153900g = hideTransactionMenuOptionProvider;
        this.f153901h = statusBlockProvider;
        this.i = confirmationBlockProvider;
        this.f153902j = loanDisbursalMortgageBlockProvider;
        this.k = loanDisbursalKarmaBlockProvider;
        this.f153903l = loanDisbursalExternalBlockProvider;
        this.f153904m = getHelpBlockProvider;
        this.f153905n = equivalentBlockProvider;
        this.o = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.o.Z2();
        cmf.p pVarA = this.f153905n.a();
        cmf.p pVarA2 = k0.a(this.f153901h.a(), this.i.a());
        d3 d3Var = this.f153902j;
        klf.h0 h0Var = d3Var.f184638a;
        wkm.l lVarQ = vkm.q.Q(yh5.b.d(h0Var.d(), h0Var.c()), new jy6.l((Continuation) null, d3Var, 23));
        zhm.f0 f0Var = zhm.f0.f322471a;
        cmf.p pVar = new cmf.p(lVarQ, new chc.c0(23), f0Var, "Loan mortgage disbursal");
        a3 a3Var = this.k;
        klf.h0 h0Var2 = a3Var.f184591a;
        cmf.p pVar2 = new cmf.p(vkm.q.Q(yh5.b.d(h0Var2.d(), h0Var2.c()), new jy6.l((Continuation) null, a3Var, 22)), new chc.c0(23), f0Var, "Karma loan disbursal");
        x2 x2Var = this.f153903l;
        klf.h0 h0Var3 = x2Var.f185008a;
        return h(zhm.v.k(pVarZ2, pVarA, pVarA2, pVar, pVar2, new cmf.p(vkm.q.Q(yh5.b.d(h0Var3.d(), h0Var3.c()), new jy6.l((Continuation) null, x2Var, 21)), new chc.c0(23), f0Var, "External loan disbursal"), this.f153904m.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return new go.g(zhm.f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.u.c(this.f153900g.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}

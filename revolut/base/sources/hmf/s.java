package hmf;

import kkf.h3;
import kkf.k1;
import kkf.k7;
import kkf.l3;
import kkf.n3;
import kkf.o1;
import kkf.p3;
import kkf.y0;
import kkf.y1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends a {
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.c f153906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k7 f153907h;
    public final kkf.d0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l3 f153908j;
    public final k1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n3 f153909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p3 f153910m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h3 f153911n;
    public final y1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o1 f153912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y0 f153913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final clf.a f153914r;

    public s(klf.h0 commonDataSource, jt0.b commonHeaderProvider, amf.c hideTransactionMenuOptionProvider, k7 statusBlockProvider, kkf.d0 confirmationBlockProvider, l3 loanPaymentModeBlockProvider, k1 fromBlockProvider, n3 loanSepaAccountBlockProvider, p3 loanTransferTypeBlockProvider, h3 loanInfoBlockProvider, y1 initiatorBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(loanPaymentModeBlockProvider, "loanPaymentModeBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(loanSepaAccountBlockProvider, "loanSepaAccountBlockProvider");
        Intrinsics.checkNotNullParameter(loanTransferTypeBlockProvider, "loanTransferTypeBlockProvider");
        Intrinsics.checkNotNullParameter(loanInfoBlockProvider, "loanInfoBlockProvider");
        Intrinsics.checkNotNullParameter(initiatorBlockProvider, "initiatorBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153906g = hideTransactionMenuOptionProvider;
        this.f153907h = statusBlockProvider;
        this.i = confirmationBlockProvider;
        this.f153908j = loanPaymentModeBlockProvider;
        this.k = fromBlockProvider;
        this.f153909l = loanSepaAccountBlockProvider;
        this.f153910m = loanTransferTypeBlockProvider;
        this.f153911n = loanInfoBlockProvider;
        this.o = initiatorBlockProvider;
        this.f153912p = getHelpBlockProvider;
        this.f153913q = equivalentBlockProvider;
        this.f153914r = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.f153914r.Z2();
        cmf.p pVarA = this.f153913q.a();
        cmf.p pVarA2 = k0.a(this.f153907h.a(), this.i.a());
        cmf.p pVarZ22 = this.k.Z2();
        n3 n3Var = this.f153909l;
        wkm.l lVarQ = vkm.q.Q((Flow) n3Var.f184841b.f185548c.getValue(), new jy6.l((Continuation) null, n3Var, 24));
        zhm.f0 f0Var = zhm.f0.f322471a;
        cmf.p pVar = new cmf.p(lVarQ, new chc.c0(23), f0Var, "Loan sepa account");
        p3 p3Var = this.f153910m;
        cmf.p pVarA3 = k0.a(pVarZ22, pVar, new cmf.p(vkm.q.Q((Flow) p3Var.f184882b.f185548c.getValue(), new jy6.l((Continuation) null, p3Var, 25)), new chc.c0(23), f0Var, "Loan transfer type"), this.o.a());
        h3 h3Var = this.f153911n;
        cmf.p pVar2 = new cmf.p(new kh4.f(h3Var.f184718a.d(), h3Var, 17), new chc.c0(23), f0Var, "Loan info");
        l3 l3Var = this.f153908j;
        return h(zhm.v.k(pVarZ2, pVarA, pVarA2, pVarA3, pVar2, new cmf.p(new kh4.f(l3Var.f184805a.d(), l3Var, 18), new chc.c0(23), f0Var, "Loan payment"), this.f153912p.a()));
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
        return g(zhm.u.c(this.f153906g.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}

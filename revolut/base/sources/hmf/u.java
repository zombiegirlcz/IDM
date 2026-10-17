package hmf;

import akf.p0;
import akf.s1;
import kkf.k1;
import kkf.k7;
import kkf.n7;
import kkf.o1;
import kkf.o2;
import kkf.q4;
import kkf.y0;
import kkf.y1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends a {
    public final klf.h0 e;
    public final s1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jt0.b f153929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.c f153930h;
    public final kkf.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n7 f153931j;
    public final kkf.d0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k7 f153932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y1 f153933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k1 f153934n;
    public final o1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q4 f153935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p0 f153936q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0 f153937r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o2 f153938s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final clf.a f153939t;

    public u(klf.h0 commonDataSource, s1 splitBillActionProvider, jt0.b commonHeaderProvider, amf.c hideTransactionMenuOptionProvider, kkf.e analyticsBlockProvider, n7 statusWithNoticeBlockProvider, kkf.d0 confirmationBlockProvider, k7 statusBlockProvider, y1 initiatorBlockProvider, k1 fromBlockProvider, o1 getHelpBlockProvider, q4 payToBlockProvider, p0 deactivatePaymentAuthorisationActionProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(splitBillActionProvider, "splitBillActionProvider");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(initiatorBlockProvider, "initiatorBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(payToBlockProvider, "payToBlockProvider");
        Intrinsics.checkNotNullParameter(deactivatePaymentAuthorisationActionProvider, "deactivatePaymentAuthorisationActionProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = splitBillActionProvider;
        this.f153929g = commonHeaderProvider;
        this.f153930h = hideTransactionMenuOptionProvider;
        this.i = analyticsBlockProvider;
        this.f153931j = statusWithNoticeBlockProvider;
        this.k = confirmationBlockProvider;
        this.f153932l = statusBlockProvider;
        this.f153933m = initiatorBlockProvider;
        this.f153934n = fromBlockProvider;
        this.o = getHelpBlockProvider;
        this.f153935p = payToBlockProvider;
        this.f153936q = deactivatePaymentAuthorisationActionProvider;
        this.f153937r = equivalentBlockProvider;
        this.f153938s = limitExceededBlockProvider;
        this.f153939t = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.f153939t.Z2();
        cmf.p pVarZ22 = this.f153938s.Z2();
        cmf.p pVarA = this.f153937r.a();
        cmf.p pVarA2 = this.f153931j.a(false);
        cmf.p pVarA3 = k0.a(this.f153932l.a(), this.f153933m.a(), this.f153934n.Z2(), this.k.a());
        cmf.p pVarZ23 = this.i.Z2();
        q4 q4Var = this.f153935p;
        return h(zhm.v.k(pVarZ2, pVarZ22, pVarA, pVarA2, pVarA3, pVarZ23, new cmf.p(vkm.q.Q(yh5.b.d(q4Var.f184906a.d(), q4Var.f184907b.a()), new jy6.l((Continuation) null, q4Var, 27)), new kkf.i0(23), zhm.u.c(q4Var.d), "PayToBlock"), this.o.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f153929g.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(zhm.v.k(this.f.Z2(), this.f153936q.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.u.c(this.f153930h.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}

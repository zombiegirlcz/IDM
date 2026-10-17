package hmf;

import akf.x0;
import kkf.a5;
import kkf.i9;
import kkf.k1;
import kkf.k7;
import kkf.l8;
import kkf.n7;
import kkf.o1;
import kkf.y0;
import kkf.y1;
import kkf.z3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 extends a {
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final olf.c f153823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.o f153824h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k7 f153825j;
    public final n7 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y1 f153826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k1 f153827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l8 f153828n;
    public final kkf.d0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kkf.x f153829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a5 f153830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i9 f153831r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kkf.e f153832s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o1 f153833t;
    public final y0 u;
    public final z3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final clf.a f153834w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x0 f153835x;

    public l0(klf.h0 commonDataSource, jt0.b commonHeaderProvider, olf.c arrowTitleHeaderDecorator, amf.o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, y1 initiatorBlockProvider, k1 fromBlockProvider, l8 toAccountBlockProvider, kkf.d0 confirmationBlockProvider, kkf.x chargesBlockProvider, a5 recurringTransferBlockProvider, i9 userCommentBlockProvider, kkf.e analyticsBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, z3 originalTransactionBlockProvider, clf.a slotBlockProvider, x0 moveAgainActionsProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(arrowTitleHeaderDecorator, "arrowTitleHeaderDecorator");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(initiatorBlockProvider, "initiatorBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(chargesBlockProvider, "chargesBlockProvider");
        Intrinsics.checkNotNullParameter(recurringTransferBlockProvider, "recurringTransferBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(originalTransactionBlockProvider, "originalTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(moveAgainActionsProvider, "moveAgainActionsProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153823g = arrowTitleHeaderDecorator;
        this.f153824h = userCommentMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f153825j = statusBlockProvider;
        this.k = statusWithNoticeBlockProvider;
        this.f153826l = initiatorBlockProvider;
        this.f153827m = fromBlockProvider;
        this.f153828n = toAccountBlockProvider;
        this.o = confirmationBlockProvider;
        this.f153829p = chargesBlockProvider;
        this.f153830q = recurringTransferBlockProvider;
        this.f153831r = userCommentBlockProvider;
        this.f153832s = analyticsBlockProvider;
        this.f153833t = getHelpBlockProvider;
        this.u = equivalentBlockProvider;
        this.v = originalTransactionBlockProvider;
        this.f153834w = slotBlockProvider;
        this.f153835x = moveAgainActionsProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        return h(zhm.v.k(this.f153834w.Z2(), this.u.a(), k0.a(this.f153825j.a(), this.k.a(false), this.f153826l.a(), this.f153827m.Z2(), this.f153828n.Z2(), this.o.a()), this.f153829p.d(new kjk.x(7)), this.v.c3(new kjk.x(15)), this.f153830q.a(), this.f153832s.Z2(), this.f153831r.a(), this.f153833t.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f153823g.c(this.f.A0(false));
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(zhm.u.c(this.f153835x.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.f153824h.a(new ah1.p(29)), this.i.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}

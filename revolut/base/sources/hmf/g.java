package hmf;

import elf.p0;
import elf.s0;
import kkf.i9;
import kkf.n7;
import kkf.o1;
import kkf.s7;
import kkf.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends a {
    public final klf.h0 e;
    public final olf.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.e f153742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.o f153743h;
    public final amf.l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final amf.c f153744j;
    public final akf.x k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kkf.i f153745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n7 f153746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o1 f153747n;
    public final i9 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y0 f153748p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s7 f153749q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kkf.q f153750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final clf.a f153751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p0 f153752t;

    public g(klf.h0 commonDataSource, olf.f cardAuthHeaderProvider, amf.e improveMerchantInfoMenuOptionProvider, amf.o userCommentMenuOptionProvider, amf.l uploadReceiptMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, akf.x blockFuturePaymentsActionProvider, kkf.i cardBlockProvider, n7 statusWithNoticeBlockProvider, o1 getHelpBlockProvider, i9 userCommentBlockProvider, y0 equivalentBlockProvider, s7 suspiciousTransactionBlockProvider, kkf.q chargebackBlockProvider, clf.a slotBlockProvider, p0 improveMerchantInfoClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(cardAuthHeaderProvider, "cardAuthHeaderProvider");
        Intrinsics.checkNotNullParameter(improveMerchantInfoMenuOptionProvider, "improveMerchantInfoMenuOptionProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(uploadReceiptMenuOptionProvider, "uploadReceiptMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(blockFuturePaymentsActionProvider, "blockFuturePaymentsActionProvider");
        Intrinsics.checkNotNullParameter(cardBlockProvider, "cardBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(suspiciousTransactionBlockProvider, "suspiciousTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(chargebackBlockProvider, "chargebackBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(improveMerchantInfoClickHandler, "improveMerchantInfoClickHandler");
        this.e = commonDataSource;
        this.f = cardAuthHeaderProvider;
        this.f153742g = improveMerchantInfoMenuOptionProvider;
        this.f153743h = userCommentMenuOptionProvider;
        this.i = uploadReceiptMenuOptionProvider;
        this.f153744j = hideTransactionMenuOptionProvider;
        this.k = blockFuturePaymentsActionProvider;
        this.f153745l = cardBlockProvider;
        this.f153746m = statusWithNoticeBlockProvider;
        this.f153747n = getHelpBlockProvider;
        this.o = userCommentBlockProvider;
        this.f153748p = equivalentBlockProvider;
        this.f153749q = suspiciousTransactionBlockProvider;
        this.f153750r = chargebackBlockProvider;
        this.f153751s = slotBlockProvider;
        this.f153752t = improveMerchantInfoClickHandler;
    }

    @Override // hmf.b0
    public final Flow a() {
        return h(zhm.v.k(this.f153751s.Z2(), this.f153750r.Z2(), this.f153749q.Z2(), this.o.a(), this.f153748p.a(), k0.a(this.f153746m.a(false), this.f153745l.Z2()), this.f153747n.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return new olf.e(this.f.f226388a.A0(true), 0);
    }

    @Override // hmf.b0
    public final s0 c() {
        return this.f153752t;
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(zhm.u.c(this.k.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.i.a(new amf.i(0)), this.f153743h.a(new ah1.p(29)), this.f153742g.a(), this.f153744j.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}

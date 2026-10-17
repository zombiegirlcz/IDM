package imf;

import akf.s1;
import cmf.p;
import eki.f;
import hmf.k0;
import kkf.d0;
import kkf.i9;
import kkf.k1;
import kkf.k7;
import kkf.l8;
import kkf.n7;
import kkf.o1;
import kkf.o2;
import kkf.x;
import kkf.y0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lkf.c0;
import lkf.e0;
import lkf.f0;
import lkf.l0;
import lkf.v;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends hmf.a {
    public final h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.a f162414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.c f162415h;
    public final s1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lkf.h0 f162416j;
    public final c0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e0 f162417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k7 f162418m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n7 f162419n;
    public final k1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l8 f162420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d0 f162421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f162422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e84.e f162423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final kkf.e f162424t;
    public final i9 u;
    public final o1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y0 f162425w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o2 f162426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final clf.a f162427y;
    public final l0 z;

    public d(h0 commonDataSource, jt0.b commonHeaderProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, s1 splitBillActionProvider, lkf.h0 billTransferBlockProvider, c0 billDetailBlockProvider, e0 billF24BlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, k1 fromBlockProvider, l8 toAccountBlockProvider, d0 confirmationBlockProvider, x chargesBlockProvider, e84.e groupBillBlockProvider, kkf.e analyticsBlockProvider, i9 userCommentBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, clf.a slotBlockProvider, l0 taxInvoiceBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(splitBillActionProvider, "splitBillActionProvider");
        Intrinsics.checkNotNullParameter(billTransferBlockProvider, "billTransferBlockProvider");
        Intrinsics.checkNotNullParameter(billDetailBlockProvider, "billDetailBlockProvider");
        Intrinsics.checkNotNullParameter(billF24BlockProvider, "billF24BlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(chargesBlockProvider, "chargesBlockProvider");
        Intrinsics.checkNotNullParameter(groupBillBlockProvider, "groupBillBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(taxInvoiceBlockProvider, "taxInvoiceBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f162414g = adjustForAnalyticsMenuOptionProvider;
        this.f162415h = hideTransactionMenuOptionProvider;
        this.i = splitBillActionProvider;
        this.f162416j = billTransferBlockProvider;
        this.k = billDetailBlockProvider;
        this.f162417l = billF24BlockProvider;
        this.f162418m = statusBlockProvider;
        this.f162419n = statusWithNoticeBlockProvider;
        this.o = fromBlockProvider;
        this.f162420p = toAccountBlockProvider;
        this.f162421q = confirmationBlockProvider;
        this.f162422r = chargesBlockProvider;
        this.f162423s = groupBillBlockProvider;
        this.f162424t = analyticsBlockProvider;
        this.u = userCommentBlockProvider;
        this.v = getHelpBlockProvider;
        this.f162425w = equivalentBlockProvider;
        this.f162426x = limitExceededBlockProvider;
        this.f162427y = slotBlockProvider;
        this.z = taxInvoiceBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.f162427y.Z2();
        p pVarZ22 = this.f162426x.Z2();
        p pVarA = this.f162425w.a();
        p pVarA2 = k0.a(this.f162418m.a(), this.f162419n.a(false));
        p pVarZ23 = this.o.Z2();
        p pVarZ24 = this.f162420p.Z2();
        p pVarA3 = this.f162421q.a();
        l0 l0Var = this.z;
        p pVarA4 = k0.a(pVarZ23, pVarZ24, pVarA3, new p(new v(l0Var.f196391l.c(), l0Var, 4), new f0(1), u.c(l0Var), "TaxInvoice"));
        lkf.h0 h0Var = this.f162416j;
        v vVar = new v(h0Var.f196384a.c(), h0Var, 3);
        f0 f0Var = new f0(0);
        zhm.f0 f0Var2 = zhm.f0.f322471a;
        p pVar = new p(vVar, f0Var, f0Var2, "BillTransferBlock");
        c0 c0Var = this.k;
        p pVar2 = new p(new v(c0Var.f196369l.c(), c0Var, 2), new lh9.b(28), f0Var2, "BillDetailsBlock");
        e0 e0Var = this.f162417l;
        h0 h0Var2 = e0Var.f196373l;
        return h(zhm.v.k(pVarZ2, pVarZ22, pVarA, pVarA2, pVarA4, pVar, k0.a(pVar2, new p(new t38.e(h0Var2.d(), 24, h0Var2.c(), new f(3, e0Var, e0.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3)), new lh9.b(29), u.c(e0Var), "BillF24Block")), this.f162422r.d(new kjk.x(7)), this.f162423s.c(true), this.f162424t.Z2(), this.u.a(), this.v.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(u.c(this.i.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.f162414g.a(), this.f162415h.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}

package hmf;

import akf.j1;
import akf.s1;
import kkf.e7;
import kkf.j8;
import kkf.k1;
import kkf.k7;
import kkf.l8;
import kkf.n7;
import kkf.o1;
import kkf.o2;
import kkf.o8;
import kkf.y0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import xkf.a1;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends a {
    public final kkf.e A;
    public final o1 B;
    public final mkf.l C;
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.c f153915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j1 f153916h;
    public final s1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final clf.a f153917j;
    public final o2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0 f153918l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j8 f153919m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lkf.d f153920n;
    public final lkf.m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n7 f153921p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k7 f153922q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k1 f153923r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l8 f153924s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lkf.w f153925t;
    public final kkf.d0 u;
    public final lkf.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o8 f153926w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a1 f153927x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e7 f153928y;
    public final e84.e z;

    public t(klf.h0 commonDataSource, jt0.b commonHeaderProvider, amf.c hideTransactionMenuOptionProvider, j1 retryPaymentActionProvider, s1 splitBillActionProvider, clf.a slotBlockProvider, o2 limitExceededBlockProvider, y0 equivalentBlockProvider, j8 ticketBlockProvider, lkf.d apmChargebackBlockProvider, lkf.m apmNoteBlockProvider, n7 statusWithNoticeBlockProvider, k7 statusBlockProvider, k1 fromBlockProvider, l8 toAccountBlockProvider, lkf.w apmPaymentMethodBlockProvider, kkf.d0 confirmationBlockProvider, lkf.k apmMerchantBlockProvider, o8 transferReasonBlockProvider, a1 paymentBreakdownProvider, e7 splitBillBlockProvider, e84.e groupBillBlockProvider, kkf.e analyticsBlockProvider, o1 getHelpBlockProvider, mkf.l bankTransferFooterLogoBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(retryPaymentActionProvider, "retryPaymentActionProvider");
        Intrinsics.checkNotNullParameter(splitBillActionProvider, "splitBillActionProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(ticketBlockProvider, "ticketBlockProvider");
        Intrinsics.checkNotNullParameter(apmChargebackBlockProvider, "apmChargebackBlockProvider");
        Intrinsics.checkNotNullParameter(apmNoteBlockProvider, "apmNoteBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        Intrinsics.checkNotNullParameter(apmPaymentMethodBlockProvider, "apmPaymentMethodBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(apmMerchantBlockProvider, "apmMerchantBlockProvider");
        Intrinsics.checkNotNullParameter(transferReasonBlockProvider, "transferReasonBlockProvider");
        Intrinsics.checkNotNullParameter(paymentBreakdownProvider, "paymentBreakdownProvider");
        Intrinsics.checkNotNullParameter(splitBillBlockProvider, "splitBillBlockProvider");
        Intrinsics.checkNotNullParameter(groupBillBlockProvider, "groupBillBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(bankTransferFooterLogoBlockProvider, "bankTransferFooterLogoBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153915g = hideTransactionMenuOptionProvider;
        this.f153916h = retryPaymentActionProvider;
        this.i = splitBillActionProvider;
        this.f153917j = slotBlockProvider;
        this.k = limitExceededBlockProvider;
        this.f153918l = equivalentBlockProvider;
        this.f153919m = ticketBlockProvider;
        this.f153920n = apmChargebackBlockProvider;
        this.o = apmNoteBlockProvider;
        this.f153921p = statusWithNoticeBlockProvider;
        this.f153922q = statusBlockProvider;
        this.f153923r = fromBlockProvider;
        this.f153924s = toAccountBlockProvider;
        this.f153925t = apmPaymentMethodBlockProvider;
        this.u = confirmationBlockProvider;
        this.v = apmMerchantBlockProvider;
        this.f153926w = transferReasonBlockProvider;
        this.f153927x = paymentBreakdownProvider;
        this.f153928y = splitBillBlockProvider;
        this.z = groupBillBlockProvider;
        this.A = analyticsBlockProvider;
        this.B = getHelpBlockProvider;
        this.C = bankTransferFooterLogoBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        return vkm.q.Q(this.e.d(), new hcj.o((Continuation) null, this, 8));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        j1 j1Var = this.f153916h;
        return f(zhm.v.k(new cmf.f(new a3i.i(j1Var.f5849l.d(), j1Var, 14), zhm.u.c(j1Var), "RetryPayment"), this.i.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.u.c(this.f153915g.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}

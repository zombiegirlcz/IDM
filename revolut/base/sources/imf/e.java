package imf;

import akf.k;
import akf.p0;
import akf.s1;
import cmf.f;
import hmf.k0;
import kkf.d0;
import kkf.e7;
import kkf.i7;
import kkf.k1;
import kkf.k7;
import kkf.n7;
import kkf.o1;
import kkf.o8;
import kkf.s7;
import klf.h0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lkf.v;
import mkf.c0;
import mkf.f0;
import mkf.r;
import mkf.s;
import mkf.u;
import nof.i;
import xkf.q1;
import z6e.g;
import zkf.p;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends hmf.a {
    public final e7 A;
    public final i7 B;
    public final s7 C;
    public final o8 D;
    public final k7 E;
    public final n7 F;
    public final h0 e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jt0.b f162428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.a f162429h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f162430j;
    public final p0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final akf.c f162431l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hkf.c f162432m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s1 f162433n;
    public final kkf.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final uvl.c f162434p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r f162435q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u f162436r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c0 f162437s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f0 f162438t;
    public final d0 u;
    public final k1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o1 f162439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final q1 f162440x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p f162441y;
    public final clf.a z;

    public e(h0 commonDataSource, i transactionStatisticsProvider, jt0.b commonHeaderProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, k apmTransferActionProvider, p0 deactivatePaymentAuthorisationActionProvider, akf.c adjustForAnalyticsActionProvider, hkf.c pixBeneficiaryTransferActionProvider, s1 splitBillActionProvider, kkf.e analyticsBlockProvider, uvl.c pixTransferRecipientBlockProvider, r bankTransferReferenceBlockProvider, u bankTransferReferenceFieldsBlockProvider, c0 bankTransferScheduledPaymentBlockProvider, f0 bankTransferTaxDetailsBlockProvider, d0 confirmationBlockProvider, k1 fromBlockProvider, o1 getHelpBlockProvider, q1 paymentsTrackingWidgetBlockProvider, p pixWithdrawAndChangeBlockProvider, clf.a slotBlockProvider, e7 splitBillBlockProvider, i7 statisticsBlockProvider, s7 suspiciousTransactionBlockProvider, o8 transferReasonBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionStatisticsProvider, "transactionStatisticsProvider");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(apmTransferActionProvider, "apmTransferActionProvider");
        Intrinsics.checkNotNullParameter(deactivatePaymentAuthorisationActionProvider, "deactivatePaymentAuthorisationActionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(pixBeneficiaryTransferActionProvider, "pixBeneficiaryTransferActionProvider");
        Intrinsics.checkNotNullParameter(splitBillActionProvider, "splitBillActionProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(pixTransferRecipientBlockProvider, "pixTransferRecipientBlockProvider");
        Intrinsics.checkNotNullParameter(bankTransferReferenceBlockProvider, "bankTransferReferenceBlockProvider");
        Intrinsics.checkNotNullParameter(bankTransferReferenceFieldsBlockProvider, "bankTransferReferenceFieldsBlockProvider");
        Intrinsics.checkNotNullParameter(bankTransferScheduledPaymentBlockProvider, "bankTransferScheduledPaymentBlockProvider");
        Intrinsics.checkNotNullParameter(bankTransferTaxDetailsBlockProvider, "bankTransferTaxDetailsBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(paymentsTrackingWidgetBlockProvider, "paymentsTrackingWidgetBlockProvider");
        Intrinsics.checkNotNullParameter(pixWithdrawAndChangeBlockProvider, "pixWithdrawAndChangeBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(splitBillBlockProvider, "splitBillBlockProvider");
        Intrinsics.checkNotNullParameter(statisticsBlockProvider, "statisticsBlockProvider");
        Intrinsics.checkNotNullParameter(suspiciousTransactionBlockProvider, "suspiciousTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(transferReasonBlockProvider, "transferReasonBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        this.e = commonDataSource;
        this.f = transactionStatisticsProvider;
        this.f162428g = commonHeaderProvider;
        this.f162429h = adjustForAnalyticsMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f162430j = apmTransferActionProvider;
        this.k = deactivatePaymentAuthorisationActionProvider;
        this.f162431l = adjustForAnalyticsActionProvider;
        this.f162432m = pixBeneficiaryTransferActionProvider;
        this.f162433n = splitBillActionProvider;
        this.o = analyticsBlockProvider;
        this.f162434p = pixTransferRecipientBlockProvider;
        this.f162435q = bankTransferReferenceBlockProvider;
        this.f162436r = bankTransferReferenceFieldsBlockProvider;
        this.f162437s = bankTransferScheduledPaymentBlockProvider;
        this.f162438t = bankTransferTaxDetailsBlockProvider;
        this.u = confirmationBlockProvider;
        this.v = fromBlockProvider;
        this.f162439w = getHelpBlockProvider;
        this.f162440x = paymentsTrackingWidgetBlockProvider;
        this.f162441y = pixWithdrawAndChangeBlockProvider;
        this.z = slotBlockProvider;
        this.A = splitBillBlockProvider;
        this.B = statisticsBlockProvider;
        this.C = suspiciousTransactionBlockProvider;
        this.D = transferReasonBlockProvider;
        this.E = statusBlockProvider;
        this.F = statusWithNoticeBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.z.Z2();
        cmf.p pVarZ22 = this.C.Z2();
        u uVar = this.f162436r;
        v vVar = new v(uVar.f206274a.c(), uVar, 18);
        s sVar = new s(0);
        zhm.f0 f0Var = zhm.f0.f322471a;
        cmf.p pVar = new cmf.p(vVar, sVar, f0Var, "BankTransferReferenceFields");
        cmf.p pVarA = this.f162435q.a();
        cmf.p pVarZ23 = this.f162440x.Z2();
        cmf.p pVarA2 = k0.a(this.E.a(), this.F.a(false));
        cmf.p pVarA3 = k0.a(this.v.Z2(), this.u.a());
        f0 f0Var2 = this.f162438t;
        cmf.p pVar2 = new cmf.p(new v(f0Var2.f206242a.c(), f0Var2, 19), new s(2), f0Var, "BankTransferTaxDetails");
        cmf.p pVarA4 = this.D.a();
        uvl.c cVar = this.f162434p;
        h0 h0Var = (h0) cVar.f283491a;
        cmf.p[] elements = {pVarZ2, pVarZ22, pVar, pVarA, pVarZ23, pVarA2, pVarA3, pVar2, pVarA4, new cmf.p(new t38.e(h0Var.d(), 24, h0Var.c(), new g(cVar, (Continuation) null, 14)), new zj9.a(4), f0Var, "PixTransferRecipient"), this.f162441y.a(), this.A.b3(), this.f162437s.Z2(), k0.a(this.o.Z2(), this.B.Z2(this.f)), this.f162439w.a()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return h(kotlin.collections.d.L(elements));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f162428g.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        f fVarB3 = this.f162430j.b3();
        f fVarZ2 = this.k.Z2();
        f fVarZ22 = this.f162431l.Z2();
        hkf.c cVar = this.f162432m;
        f fVarZ23 = cVar.f152929b.Z2();
        f[] elements = {fVarB3, fVarZ2, fVarZ22, new f(new t38.e(cVar.f152928a.d(), 24, fVarZ23.f25227a, new hkf.b(cVar, null)), fVarZ23.f25228b, "PixBeneficiaryTransferActions"), this.f162433n.Z2()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return f(kotlin.collections.d.L(elements));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.f162429h.a(), this.i.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}

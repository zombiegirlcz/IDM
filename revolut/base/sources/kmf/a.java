package kmf;

import akf.f1;
import akf.l0;
import akf.q;
import akf.s1;
import akf.x;
import amf.h;
import amf.l;
import amf.o;
import chc.c0;
import cmf.p;
import elf.s0;
import hmf.k0;
import kkf.a2;
import kkf.a4;
import kkf.d0;
import kkf.e7;
import kkf.f9;
import kkf.g;
import kkf.i;
import kkf.i0;
import kkf.i7;
import kkf.i9;
import kkf.j0;
import kkf.k;
import kkf.k1;
import kkf.m;
import kkf.m1;
import kkf.m2;
import kkf.n;
import kkf.n4;
import kkf.o1;
import kkf.o2;
import kkf.p0;
import kkf.q3;
import kkf.s7;
import kkf.t5;
import kkf.u1;
import kkf.w0;
import kkf.x4;
import kkf.y0;
import kkf.y1;
import kkf.y5;
import kkf.y6;
import kkf.z4;
import kkf.z8;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends hmf.a {
    public final w0 A;
    public final p0 B;
    public final y0 C;
    public final k1 D;
    public final m1 E;
    public final o1 F;
    public final e84.e G;
    public final u1 H;
    public final y1 I;
    public final a2 J;
    public final m2 K;
    public final o2 L;
    public final q3 M;
    public final x4 N;
    public final n4 O;
    public final z4 P;
    public final t5 Q;
    public final y5 R;
    public final y6 S;
    public final e7 T;
    public final k U;
    public final m V;
    public final i7 W;
    public final s7 X;
    public final z8 Y;
    public final f9 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final i9 f185791a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final clf.a f185792b0;
    public final i c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final elf.p0 f185793d0;
    public final h0 e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final rhf.d f185794e0;
    public final kge.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nof.i f185795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.a f185796h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final amf.e f185797j;
    public final h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f185798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f185799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q f185800n;
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l0 f185801p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f1 f185802q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s1 f185803r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kkf.e f185804s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f185805t;
    public final n u;
    public final kkf.x v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d0 f185806w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final okf.k f185807x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final kkf.h0 f185808y;
    public final j0 z;

    public a(h0 commonDataSource, kge.d creditCardInstalmentHeaderProvider, nof.i transactionStatisticsProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, amf.e improveMerchantInfoMenuOptionProvider, h markAsSubscriptionMenuOptionProvider, l uploadReceiptMenuOptionProvider, o userCommentMenuOptionProvider, q atmLimitsActionProvider, x blockFuturePaymentsActionProvider, l0 createInstalmentActionProvider, f1 replaceCardActionProvider, s1 splitBillActionProvider, kkf.e analyticsBlockProvider, g blockedSubscriptionOrMerchantBlockProvider, n cashbackBlockProvider, kkf.x chargesBlockProvider, d0 confirmationBlockProvider, okf.k creditCardInstalmentBlockProvider, kkf.h0 cryptoCardDisclaimerBlockProvider, j0 cryptoCardLinkedTransactionBlockProvider, w0 dynamicCurrencyConversionBannerBlockProvider, p0 donationsBlockProvider, y0 equivalentBlockProvider, k1 fromBlockProvider, m1 geoBlockProvider, o1 getHelpBlockProvider, e84.e groupBillBlockProvider, u1 gstInvoiceBlockProvider, y1 initiatorBlockProvider, a2 insufficientBalanceBlockProvider, m2 kycBlockProvider, o2 limitExceededBlockProvider, q3 manageSubscriptionBlockProvider, x4 personalLoansBlockProvider, n4 payLaterBlockProvider, z4 receiptsBlockProvider, t5 revPointsBlockProvider, y5 revPointsOptInPlacementsBlockProvider, y6 spareChangeBlockProvider, e7 splitBillBlockProvider, k cardPaymentStatusBlockProvider, m cardPaymentStatusWithNoticeBlockProvider, i7 statisticsBlockProvider, s7 suspiciousTransactionBlockProvider, z8 trustedMerchantBlockProvider, f9 upgradeEntryPointBlockProvider, i9 userCommentBlockProvider, clf.a slotBlockProvider, i cardBlockProvider, elf.p0 improveMerchantInfoClickHandler, rhf.d entryPoint) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(creditCardInstalmentHeaderProvider, "creditCardInstalmentHeaderProvider");
        Intrinsics.checkNotNullParameter(transactionStatisticsProvider, "transactionStatisticsProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(improveMerchantInfoMenuOptionProvider, "improveMerchantInfoMenuOptionProvider");
        Intrinsics.checkNotNullParameter(markAsSubscriptionMenuOptionProvider, "markAsSubscriptionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(uploadReceiptMenuOptionProvider, "uploadReceiptMenuOptionProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(atmLimitsActionProvider, "atmLimitsActionProvider");
        Intrinsics.checkNotNullParameter(blockFuturePaymentsActionProvider, "blockFuturePaymentsActionProvider");
        Intrinsics.checkNotNullParameter(createInstalmentActionProvider, "createInstalmentActionProvider");
        Intrinsics.checkNotNullParameter(replaceCardActionProvider, "replaceCardActionProvider");
        Intrinsics.checkNotNullParameter(splitBillActionProvider, "splitBillActionProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(blockedSubscriptionOrMerchantBlockProvider, "blockedSubscriptionOrMerchantBlockProvider");
        Intrinsics.checkNotNullParameter(cashbackBlockProvider, "cashbackBlockProvider");
        Intrinsics.checkNotNullParameter(chargesBlockProvider, "chargesBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(creditCardInstalmentBlockProvider, "creditCardInstalmentBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoCardDisclaimerBlockProvider, "cryptoCardDisclaimerBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoCardLinkedTransactionBlockProvider, "cryptoCardLinkedTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(dynamicCurrencyConversionBannerBlockProvider, "dynamicCurrencyConversionBannerBlockProvider");
        Intrinsics.checkNotNullParameter(donationsBlockProvider, "donationsBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(geoBlockProvider, "geoBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(groupBillBlockProvider, "groupBillBlockProvider");
        Intrinsics.checkNotNullParameter(gstInvoiceBlockProvider, "gstInvoiceBlockProvider");
        Intrinsics.checkNotNullParameter(initiatorBlockProvider, "initiatorBlockProvider");
        Intrinsics.checkNotNullParameter(insufficientBalanceBlockProvider, "insufficientBalanceBlockProvider");
        Intrinsics.checkNotNullParameter(kycBlockProvider, "kycBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(manageSubscriptionBlockProvider, "manageSubscriptionBlockProvider");
        Intrinsics.checkNotNullParameter(personalLoansBlockProvider, "personalLoansBlockProvider");
        Intrinsics.checkNotNullParameter(payLaterBlockProvider, "payLaterBlockProvider");
        Intrinsics.checkNotNullParameter(receiptsBlockProvider, "receiptsBlockProvider");
        Intrinsics.checkNotNullParameter(revPointsBlockProvider, "revPointsBlockProvider");
        Intrinsics.checkNotNullParameter(revPointsOptInPlacementsBlockProvider, "revPointsOptInPlacementsBlockProvider");
        Intrinsics.checkNotNullParameter(spareChangeBlockProvider, "spareChangeBlockProvider");
        Intrinsics.checkNotNullParameter(splitBillBlockProvider, "splitBillBlockProvider");
        Intrinsics.checkNotNullParameter(cardPaymentStatusBlockProvider, "cardPaymentStatusBlockProvider");
        Intrinsics.checkNotNullParameter(cardPaymentStatusWithNoticeBlockProvider, "cardPaymentStatusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(statisticsBlockProvider, "statisticsBlockProvider");
        Intrinsics.checkNotNullParameter(suspiciousTransactionBlockProvider, "suspiciousTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(trustedMerchantBlockProvider, "trustedMerchantBlockProvider");
        Intrinsics.checkNotNullParameter(upgradeEntryPointBlockProvider, "upgradeEntryPointBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(cardBlockProvider, "cardBlockProvider");
        Intrinsics.checkNotNullParameter(improveMerchantInfoClickHandler, "improveMerchantInfoClickHandler");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.e = commonDataSource;
        this.f = creditCardInstalmentHeaderProvider;
        this.f185795g = transactionStatisticsProvider;
        this.f185796h = adjustForAnalyticsMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f185797j = improveMerchantInfoMenuOptionProvider;
        this.k = markAsSubscriptionMenuOptionProvider;
        this.f185798l = uploadReceiptMenuOptionProvider;
        this.f185799m = userCommentMenuOptionProvider;
        this.f185800n = atmLimitsActionProvider;
        this.o = blockFuturePaymentsActionProvider;
        this.f185801p = createInstalmentActionProvider;
        this.f185802q = replaceCardActionProvider;
        this.f185803r = splitBillActionProvider;
        this.f185804s = analyticsBlockProvider;
        this.f185805t = blockedSubscriptionOrMerchantBlockProvider;
        this.u = cashbackBlockProvider;
        this.v = chargesBlockProvider;
        this.f185806w = confirmationBlockProvider;
        this.f185807x = creditCardInstalmentBlockProvider;
        this.f185808y = cryptoCardDisclaimerBlockProvider;
        this.z = cryptoCardLinkedTransactionBlockProvider;
        this.A = dynamicCurrencyConversionBannerBlockProvider;
        this.B = donationsBlockProvider;
        this.C = equivalentBlockProvider;
        this.D = fromBlockProvider;
        this.E = geoBlockProvider;
        this.F = getHelpBlockProvider;
        this.G = groupBillBlockProvider;
        this.H = gstInvoiceBlockProvider;
        this.I = initiatorBlockProvider;
        this.J = insufficientBalanceBlockProvider;
        this.K = kycBlockProvider;
        this.L = limitExceededBlockProvider;
        this.M = manageSubscriptionBlockProvider;
        this.N = personalLoansBlockProvider;
        this.O = payLaterBlockProvider;
        this.P = receiptsBlockProvider;
        this.Q = revPointsBlockProvider;
        this.R = revPointsOptInPlacementsBlockProvider;
        this.S = spareChangeBlockProvider;
        this.T = splitBillBlockProvider;
        this.U = cardPaymentStatusBlockProvider;
        this.V = cardPaymentStatusWithNoticeBlockProvider;
        this.W = statisticsBlockProvider;
        this.X = suspiciousTransactionBlockProvider;
        this.Y = trustedMerchantBlockProvider;
        this.Z = upgradeEntryPointBlockProvider;
        this.f185791a0 = userCommentBlockProvider;
        this.f185792b0 = slotBlockProvider;
        this.c0 = cardBlockProvider;
        this.f185793d0 = improveMerchantInfoClickHandler;
        this.f185794e0 = entryPoint;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.f185792b0.Z2();
        p pVarZ22 = this.R.Z2();
        p pVarA = this.C.a();
        p pVarA2 = this.f185805t.a();
        p pVarA3 = this.Y.a();
        p pVarZ23 = this.J.Z2();
        p pVarZ24 = this.K.Z2();
        p pVarZ25 = this.L.Z2();
        n4 n4Var = this.O;
        p pVar = new p(n4Var.c3(n4Var.f184843l, new a4(n4Var, 2)), new i0(19), u.c(n4Var), "PayLaterPlanPaymentBlockProvider_InfoWarning");
        p pVarB3 = n4Var.b3();
        h0 h0Var = n4Var.f184843l;
        p pVar2 = new p(n4Var.c3(h0Var, new a4(n4Var, 4)), new i0(22), u.c(n4Var), "PayLaterPlanPaymentBlockProvider_PurchaseInfo");
        p pVarZ26 = this.N.Z2();
        p0 p0Var = this.B;
        p pVar3 = new p(new kh4.f((SharedFlow) p0Var.f184873m.f.getValue(), p0Var, 6), new i0(1), u.c(p0Var), "Donations");
        p pVarZ27 = this.X.Z2();
        p pVarA4 = this.P.a(new kjk.x(19));
        p pVarA5 = this.f185791a0.a();
        p pVarZ28 = this.E.Z2();
        p pVarA6 = this.V.a();
        p pVarA7 = k0.a(this.U.a(), this.I.a(), this.c0.Z2(), this.D.Z2(), this.f185806w.a());
        p pVarZ29 = this.Q.Z2();
        p pVarA8 = this.u.a();
        w0 w0Var = this.A;
        p pVar4 = new p(new kh4.f(w0Var.f184990l.d(), w0Var, 8), new c0(23), u.c(w0Var), "DynamicCurrencyConversionBanner");
        p pVar5 = new p(n4Var.c3(h0Var, new a4(n4Var, 3)), new i0(21), u.c(n4Var), "PayLaterPlanPaymentBlockProvider_RelatedPayments");
        p pVarB32 = this.T.b3();
        rhf.d dVar = rhf.d.PAYMENT_GROUP_WIDGET;
        rhf.d dVar2 = this.f185794e0;
        return h(v.k(pVarZ2, pVarZ22, pVarA, pVarA2, pVarA3, pVarZ23, pVarZ24, pVarZ25, pVar, pVarB3, pVar2, pVarZ26, pVar3, pVarZ27, pVarA4, pVarA5, pVarZ28, pVarA6, pVarA7, pVarZ29, pVarA8, pVar4, pVar5, pVarB32, this.G.c((dVar2 == dVar || dVar2 == rhf.d.PAYMENT_GROUP_DETAILS) ? false : true), this.v.d(new kjk.x(7)), this.Z.c3(mga.e.f205204a), this.S.a(), this.H.Z2(), k0.a(this.f185804s.Z2(), this.W.Z2(this.f185795g), this.M.a()), this.f185807x.Z2(), this.z.Z2(), new p(n4Var.c3(h0Var, new a4(n4Var, 0)), new i0(18), u.c(n4Var), "PayLaterPlanPaymentBlockProvider_RelatedPayments"), this.F.a(), this.f185808y.Z2()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.s();
    }

    @Override // hmf.b0
    public final s0 c() {
        return this.f185793d0;
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(v.k(this.f185803r.Z2(), this.o.Z2(), this.f185802q.Z2(), this.f185801p.Z2(), this.f185800n.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f185798l.a(new amf.i(0)), this.f185799m.a(new ah1.p(29)), this.k.a(), this.f185796h.a(), this.f185797j.a(), this.i.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}

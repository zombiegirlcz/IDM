package hmf;

import akf.f1;
import akf.s1;
import elf.s0;
import kkf.a2;
import kkf.a4;
import kkf.b5;
import kkf.e7;
import kkf.f9;
import kkf.i7;
import kkf.i9;
import kkf.k1;
import kkf.m1;
import kkf.m2;
import kkf.m5;
import kkf.n4;
import kkf.o1;
import kkf.o2;
import kkf.p0;
import kkf.p7;
import kkf.q3;
import kkf.s4;
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
import kkf.z5;
import kkf.z7;
import kkf.z8;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends a {
    public final kkf.q A;
    public final kkf.x B;
    public final kkf.d0 C;
    public final okf.k D;
    public final kkf.h0 E;
    public final kkf.j0 F;
    public final w0 G;
    public final p0 H;
    public final y0 I;
    public final k1 J;
    public final m1 K;
    public final o1 L;
    public final e84.e M;
    public final u1 N;
    public final y1 O;
    public final a2 P;
    public final m2 Q;
    public final o2 R;
    public final q3 S;
    public final n4 T;
    public final s4 U;
    public final x4 V;
    public final z4 W;
    public final b5 X;
    public final t5 Y;
    public final y5 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final y6 f153754a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final e7 f153755b0;
    public final kkf.k c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final kkf.m f153756d0;
    public final klf.h0 e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final i7 f153757e0;
    public final jt0.b f;
    public final s7 f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nof.i f153758g;
    public final z8 g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.a f153759h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final p7 f153760h0;
    public final amf.c i;
    public final f9 i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final amf.e f153761j;
    public final i9 j0;
    public final amf.h k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final clf.a f153762k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final amf.l f153763l;
    public final elf.p0 l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final amf.o f153764m;
    public final rhf.d m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final akf.c f153765n;
    public final akf.q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final akf.b0 f153766p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final akf.x f153767q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final akf.i0 f153768r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final akf.l0 f153769s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f1 f153770t;
    public final s1 u;
    public final kkf.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kkf.e f153771w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final kkf.g f153772x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final kkf.i f153773y;
    public final kkf.n z;

    public h(klf.h0 commonDataSource, jt0.b commonHeaderProvider, nof.i transactionStatisticsProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, amf.e improveMerchantInfoMenuOptionProvider, amf.h markAsSubscriptionMenuOptionProvider, amf.l uploadReceiptMenuOptionProvider, amf.o userCommentMenuOptionProvider, akf.c adjustForAnalyticsActionProvider, akf.q atmLimitsActionProvider, akf.b0 cardLimitsActionProvider, akf.x blockFuturePaymentsActionProvider, akf.i0 createDebitInstalmentActionProvider, akf.l0 createInstalmentActionProvider, f1 replaceCardActionProvider, s1 splitBillActionProvider, kkf.c adjustedPaymentsBlockProvider, kkf.e analyticsBlockProvider, kkf.g blockedSubscriptionOrMerchantBlockProvider, kkf.i cardBlockProvider, kkf.n cashbackBlockProvider, kkf.q chargebackBlockProvider, kkf.x chargesBlockProvider, kkf.d0 confirmationBlockProvider, okf.k creditCardInstalmentBlockProvider, kkf.h0 cryptoCardDisclaimerBlockProvider, kkf.j0 cryptoCardLinkedTransactionBlockProvider, w0 dynamicCurrencyConversionBannerBlockProvider, p0 donationsBlockProvider, y0 equivalentBlockProvider, k1 fromBlockProvider, m1 geoBlockProvider, o1 getHelpBlockProvider, e84.e groupBillBlockProvider, u1 gstInvoiceBlockProvider, y1 initiatorBlockProvider, a2 insufficientBalanceBlockProvider, m2 kycBlockProvider, o2 limitExceededBlockProvider, q3 manageSubscriptionBlockProvider, n4 payLaterBlockProvider, s4 paymentVerificationBlockProvider, x4 personalLoansBlockProvider, z4 receiptsBlockProvider, b5 refundsBlockProvider, t5 revPointsBlockProvider, y5 revPointsOptInPlacementsBlockProvider, y6 spareChangeBlockProvider, e7 splitBillBlockProvider, kkf.k cardPaymentStatusBlockProvider, kkf.m cardPaymentStatusWithNoticeBlockProvider, i7 statisticsBlockProvider, s7 suspiciousTransactionBlockProvider, z8 trustedMerchantBlockProvider, p7 suggestedSubscriptionBlockProvider, f9 upgradeEntryPointBlockProvider, i9 userCommentBlockProvider, clf.a slotBlockProvider, elf.p0 improveMerchantInfoClickHandler, rhf.d entryPoint) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(transactionStatisticsProvider, "transactionStatisticsProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(improveMerchantInfoMenuOptionProvider, "improveMerchantInfoMenuOptionProvider");
        Intrinsics.checkNotNullParameter(markAsSubscriptionMenuOptionProvider, "markAsSubscriptionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(uploadReceiptMenuOptionProvider, "uploadReceiptMenuOptionProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(atmLimitsActionProvider, "atmLimitsActionProvider");
        Intrinsics.checkNotNullParameter(cardLimitsActionProvider, "cardLimitsActionProvider");
        Intrinsics.checkNotNullParameter(blockFuturePaymentsActionProvider, "blockFuturePaymentsActionProvider");
        Intrinsics.checkNotNullParameter(createDebitInstalmentActionProvider, "createDebitInstalmentActionProvider");
        Intrinsics.checkNotNullParameter(createInstalmentActionProvider, "createInstalmentActionProvider");
        Intrinsics.checkNotNullParameter(replaceCardActionProvider, "replaceCardActionProvider");
        Intrinsics.checkNotNullParameter(splitBillActionProvider, "splitBillActionProvider");
        Intrinsics.checkNotNullParameter(adjustedPaymentsBlockProvider, "adjustedPaymentsBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(blockedSubscriptionOrMerchantBlockProvider, "blockedSubscriptionOrMerchantBlockProvider");
        Intrinsics.checkNotNullParameter(cardBlockProvider, "cardBlockProvider");
        Intrinsics.checkNotNullParameter(cashbackBlockProvider, "cashbackBlockProvider");
        Intrinsics.checkNotNullParameter(chargebackBlockProvider, "chargebackBlockProvider");
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
        Intrinsics.checkNotNullParameter(payLaterBlockProvider, "payLaterBlockProvider");
        Intrinsics.checkNotNullParameter(paymentVerificationBlockProvider, "paymentVerificationBlockProvider");
        Intrinsics.checkNotNullParameter(personalLoansBlockProvider, "personalLoansBlockProvider");
        Intrinsics.checkNotNullParameter(receiptsBlockProvider, "receiptsBlockProvider");
        Intrinsics.checkNotNullParameter(refundsBlockProvider, "refundsBlockProvider");
        Intrinsics.checkNotNullParameter(revPointsBlockProvider, "revPointsBlockProvider");
        Intrinsics.checkNotNullParameter(revPointsOptInPlacementsBlockProvider, "revPointsOptInPlacementsBlockProvider");
        Intrinsics.checkNotNullParameter(spareChangeBlockProvider, "spareChangeBlockProvider");
        Intrinsics.checkNotNullParameter(splitBillBlockProvider, "splitBillBlockProvider");
        Intrinsics.checkNotNullParameter(cardPaymentStatusBlockProvider, "cardPaymentStatusBlockProvider");
        Intrinsics.checkNotNullParameter(cardPaymentStatusWithNoticeBlockProvider, "cardPaymentStatusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(statisticsBlockProvider, "statisticsBlockProvider");
        Intrinsics.checkNotNullParameter(suspiciousTransactionBlockProvider, "suspiciousTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(trustedMerchantBlockProvider, "trustedMerchantBlockProvider");
        Intrinsics.checkNotNullParameter(suggestedSubscriptionBlockProvider, "suggestedSubscriptionBlockProvider");
        Intrinsics.checkNotNullParameter(upgradeEntryPointBlockProvider, "upgradeEntryPointBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(improveMerchantInfoClickHandler, "improveMerchantInfoClickHandler");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153758g = transactionStatisticsProvider;
        this.f153759h = adjustForAnalyticsMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f153761j = improveMerchantInfoMenuOptionProvider;
        this.k = markAsSubscriptionMenuOptionProvider;
        this.f153763l = uploadReceiptMenuOptionProvider;
        this.f153764m = userCommentMenuOptionProvider;
        this.f153765n = adjustForAnalyticsActionProvider;
        this.o = atmLimitsActionProvider;
        this.f153766p = cardLimitsActionProvider;
        this.f153767q = blockFuturePaymentsActionProvider;
        this.f153768r = createDebitInstalmentActionProvider;
        this.f153769s = createInstalmentActionProvider;
        this.f153770t = replaceCardActionProvider;
        this.u = splitBillActionProvider;
        this.v = adjustedPaymentsBlockProvider;
        this.f153771w = analyticsBlockProvider;
        this.f153772x = blockedSubscriptionOrMerchantBlockProvider;
        this.f153773y = cardBlockProvider;
        this.z = cashbackBlockProvider;
        this.A = chargebackBlockProvider;
        this.B = chargesBlockProvider;
        this.C = confirmationBlockProvider;
        this.D = creditCardInstalmentBlockProvider;
        this.E = cryptoCardDisclaimerBlockProvider;
        this.F = cryptoCardLinkedTransactionBlockProvider;
        this.G = dynamicCurrencyConversionBannerBlockProvider;
        this.H = donationsBlockProvider;
        this.I = equivalentBlockProvider;
        this.J = fromBlockProvider;
        this.K = geoBlockProvider;
        this.L = getHelpBlockProvider;
        this.M = groupBillBlockProvider;
        this.N = gstInvoiceBlockProvider;
        this.O = initiatorBlockProvider;
        this.P = insufficientBalanceBlockProvider;
        this.Q = kycBlockProvider;
        this.R = limitExceededBlockProvider;
        this.S = manageSubscriptionBlockProvider;
        this.T = payLaterBlockProvider;
        this.U = paymentVerificationBlockProvider;
        this.V = personalLoansBlockProvider;
        this.W = receiptsBlockProvider;
        this.X = refundsBlockProvider;
        this.Y = revPointsBlockProvider;
        this.Z = revPointsOptInPlacementsBlockProvider;
        this.f153754a0 = spareChangeBlockProvider;
        this.f153755b0 = splitBillBlockProvider;
        this.c0 = cardPaymentStatusBlockProvider;
        this.f153756d0 = cardPaymentStatusWithNoticeBlockProvider;
        this.f153757e0 = statisticsBlockProvider;
        this.f0 = suspiciousTransactionBlockProvider;
        this.g0 = trustedMerchantBlockProvider;
        this.f153760h0 = suggestedSubscriptionBlockProvider;
        this.i0 = upgradeEntryPointBlockProvider;
        this.j0 = userCommentBlockProvider;
        this.f153762k0 = slotBlockProvider;
        this.l0 = improveMerchantInfoClickHandler;
        this.m0 = entryPoint;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.f153762k0.Z2();
        p7 p7Var = this.f153760h0;
        cmf.p pVar = new cmf.p(new kh4.f((Flow) p7Var.f184888l.f185623g.getValue(), p7Var, 28), new z5(5), zhm.u.c(p7Var), "SuggestedSubscription");
        cmf.p pVarZ22 = this.X.Z2();
        cmf.p pVarZ23 = this.A.Z2();
        cmf.p pVarZ24 = this.Z.Z2();
        cmf.p pVarA = this.I.a();
        cmf.p pVarA2 = this.f153772x.a();
        cmf.p pVarA3 = this.g0.a();
        cmf.p pVarZ25 = this.P.Z2();
        s4 s4Var = this.U;
        cmf.p pVar2 = new cmf.p(new t38.e(s4Var.f184931a.d(), 24, s4Var.f184932b.a(), new ael.l0(3, s4Var, s4.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/JuniorDataSource$YouthWalletOwner;)Ljava/util/List;", 4, 17)), new chc.c0(23), zhm.u.c(s4Var.f184933c), "PaymentVerification");
        cmf.p pVarZ26 = this.Q.Z2();
        cmf.p pVarZ27 = this.R.Z2();
        n4 n4Var = this.T;
        cmf.p pVar3 = new cmf.p(n4Var.c3(n4Var.f184843l, new a4(n4Var, 2)), new kkf.i0(19), zhm.u.c(n4Var), "PayLaterPlanPaymentBlockProvider_InfoWarning");
        cmf.p pVarB3 = n4Var.b3();
        klf.h0 h0Var = n4Var.f184843l;
        cmf.p pVar4 = new cmf.p(n4Var.c3(h0Var, new a4(n4Var, 4)), new kkf.i0(22), zhm.u.c(n4Var), "PayLaterPlanPaymentBlockProvider_PurchaseInfo");
        cmf.p pVarZ28 = this.V.Z2();
        p0 p0Var = this.H;
        cmf.p pVar5 = new cmf.p(new kh4.f((SharedFlow) p0Var.f184873m.f.getValue(), p0Var, 6), new kkf.i0(1), zhm.u.c(p0Var), "Donations");
        cmf.p pVarZ29 = this.f0.Z2();
        cmf.p pVarA4 = this.W.a(new kjk.x(19));
        cmf.p pVarA5 = this.j0.a();
        cmf.p pVarZ210 = this.K.Z2();
        kkf.c cVar = this.v;
        cmf.p pVar6 = new cmf.p(new kh4.f(cVar.f184618l.d(), cVar, 3), new chc.c0(23), zhm.u.c(cVar), "AdjustedPayments");
        cmf.p pVarA6 = this.f153756d0.a();
        cmf.p pVarA7 = k0.a(this.c0.a(), this.f153773y.Z2(), this.O.a(), this.J.Z2(), this.C.a());
        cmf.p pVarZ211 = this.Y.Z2();
        f9 f9Var = this.i0;
        klf.h0 h0Var2 = f9Var.f184684l;
        cmf.p pVar7 = new cmf.p(vkm.q.Q(vkm.q.q(new z7(yh5.b.e(h0Var2.d(), h0Var2.c(), f9Var.f184685m.a()), f9Var, 7)), new m5(null, f9Var, 8)), new z5(11), zhm.u.c(f9Var), "UpgradeEntryPointRevPoints");
        cmf.p pVarA8 = this.z.a();
        w0 w0Var = this.G;
        cmf.p pVar8 = new cmf.p(new kh4.f(w0Var.f184990l.d(), w0Var, 8), new chc.c0(23), zhm.u.c(w0Var), "DynamicCurrencyConversionBanner");
        cmf.p pVar9 = new cmf.p(n4Var.c3(h0Var, new a4(n4Var, 3)), new kkf.i0(21), zhm.u.c(n4Var), "PayLaterPlanPaymentBlockProvider_RelatedPayments");
        cmf.p pVarB32 = this.f153755b0.b3();
        rhf.d dVar = rhf.d.PAYMENT_GROUP_WIDGET;
        rhf.d dVar2 = this.m0;
        return h(zhm.v.k(pVarZ2, pVar, pVarZ22, pVarZ23, pVarZ24, pVarA, pVarA2, pVarA3, pVarZ25, pVar2, pVarZ26, pVarZ27, pVar3, pVarB3, pVar4, pVarZ28, pVar5, pVarZ29, pVarA4, pVarA5, pVarZ210, pVar6, pVarA6, pVarA7, pVarZ211, pVar7, pVarA8, pVar8, pVar9, pVarB32, this.M.c((dVar2 == dVar || dVar2 == rhf.d.PAYMENT_GROUP_DETAILS) ? false : true), this.B.d(new kjk.x(7)), f9Var.c3(mga.e.f205204a), this.f153754a0.a(), this.N.Z2(), k0.a(this.f153771w.Z2(), this.f153757e0.Z2(this.f153758g), this.S.a()), this.D.Z2(), this.F.Z2(), new cmf.p(n4Var.c3(h0Var, new a4(n4Var, 0)), new kkf.i0(18), zhm.u.c(n4Var), "PayLaterPlanPaymentBlockProvider_RelatedPayments"), this.L.a(), this.E.Z2()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(true);
    }

    @Override // hmf.b0
    public final s0 c() {
        return this.l0;
    }

    @Override // hmf.b0
    public final Flow d() {
        cmf.f fVarZ2 = this.u.Z2();
        cmf.f fVarZ22 = this.f153765n.Z2();
        cmf.f fVarZ23 = this.f153767q.Z2();
        cmf.f fVarZ24 = this.f153770t.Z2();
        cmf.f fVarZ25 = this.f153769s.Z2();
        akf.i0 i0Var = this.f153768r;
        cmf.f fVar = new cmf.f(new t38.e(vkm.q.q(new vkm.y(new a35.j(2, 3, null), new a6e.b(rd0.e.n(n14.k.p(vkm.q.Q(i0Var.f5843n.j(), new a0e.m((Continuation) null, i0Var, 18)), new aik.d(15)), zhm.h0.f322473a), 2))), 24, new a35.d(i0Var.f5841l.a(), 11), new akf.h0(3, 4, akf.i0.class, i0Var, "buildAction", "buildAction(Lcom/revolut/feature/transactions/impl/ui/kompot/details/action_provider/CreateDebitInstalmentActionProvider$DebitToInstalment;Z)Ljava/util/List;")), zhm.u.c(i0Var), "CreateDebitInstalment");
        cmf.f fVarZ26 = this.o.Z2();
        akf.b0 b0Var = this.f153766p;
        return f(zhm.v.k(fVarZ2, fVarZ22, fVarZ23, fVarZ24, fVarZ25, fVar, fVarZ26, new cmf.f(ta6.a.h(b0Var.f5814l.h(new aik.d(14)), mo3.a.g(nim.a.v(rd0.e.b(hng.g.b(((ang.b) ((l61.a) b0Var.f5816n.f185240b)).f7765a)), mjf.s.f), null, null, 3), new a35.d(b0Var.f5815m.a(), 10), new akf.a0(4, 4, akf.b0.class, b0Var, "buildAction", "buildAction(Lcom/revolut/feature/transactions/models/TransactionType;ZZ)Ljava/util/List;")), zhm.u.c(b0Var), "CardLimits")));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.f153763l.a(new amf.i(0)), this.f153764m.a(new ah1.p(29)), this.k.a(), this.f153759h.a(), this.f153761j.a(), this.i.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}

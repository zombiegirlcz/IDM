package rmf;

import akf.s1;
import amf.l;
import com.revolut.feature.pay_with_photo.api.PayWithPhotoApi$Toggles$PayWithPhotoTransactionDetailsFileAttachment;
import com.revolut.feature.transactions.api.kompot.TransactionDetailsApi$Toggles$TransactionDetailsHorizontalPager;
import com.revolut.feature.transactions.api.kompot.TransactionDetailsApi$Toggles$TransactionDetailsKompotLoyalty;
import dkf.g;
import ekf.m;
import elf.s0;
import flf.t;
import hmf.k0;
import k7i.i;
import kjk.x;
import kkf.b5;
import kkf.d0;
import kkf.d2;
import kkf.e7;
import kkf.h6;
import kkf.i7;
import kkf.j8;
import kkf.k1;
import kkf.k7;
import kkf.n7;
import kkf.o1;
import kkf.o8;
import kkf.s7;
import kkf.s8;
import kkf.t5;
import kkf.y0;
import kkf.y1;
import kkf.z3;
import kkf.z4;
import klf.h0;
import klf.m1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lkf.v;
import mkf.c0;
import mkf.f0;
import mkf.h;
import mkf.i0;
import mkf.o0;
import mkf.r;
import mkf.s;
import mkf.u;
import mkf.u0;
import mkf.w0;
import vkf.j;
import vkm.q;
import xkf.q1;
import xkf.w1;
import xkf.x0;
import xkf.z1;
import zkf.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends hmf.a {
    public final f0 A;
    public final d0 B;
    public final sz5.f C;
    public final i0 D;
    public final i E;
    public final rhf.d F;
    public final y0 G;
    public final k1 H;
    public final o1 I;
    public final e84.e J;
    public final j K;
    public final y1 L;
    public final d2 M;
    public final z3 N;
    public final x0 O;
    public final dlf.j P;
    public final q1 Q;
    public final p R;
    public final o0 S;
    public final z4 T;
    public final b5 U;
    public final t5 V;
    public final z1 W;
    public final h6 X;
    public final clf.a Y;
    public final n7 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final u0 f255250a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final e7 f255251b0;
    public final i7 c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final k7 f255252d0;
    public final h0 e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final s7 f255253e0;
    public final nof.i f;
    public final j8 f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final prl.e f255254g;
    public final o8 g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jlf.b f255255h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final s8 f255256h0;
    public final amf.a i;
    public final w0 i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final amf.c f255257j;
    public final gte.a j0;
    public final l k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final akf.c f255258l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ekf.f f255259m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f255260n;
    public final vkf.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f255261p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s1 f255262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kkf.e f255263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jt0.b f255264s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mkf.c f255265t;
    public final h u;
    public final mkf.l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final xkf.e f255266w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r f255267x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final u f255268y;
    public final c0 z;

    public a(h0 commonDataSource, nof.i transactionStatisticsProvider, prl.e bankTransferHeaderProvider, jlf.b bankTransferNavbarIconClickHandler, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, l uploadReceiptMenuOptionProvider, akf.c adjustForAnalyticsActionProvider, ekf.f bankTransferActionsProvider, m directDebitRefundActionProvider, vkf.f incomeSorterActionProvider, g loyaltyActionsProvider, s1 splitBillActionProvider, kkf.e analyticsBlockProvider, jt0.b bankAccountSwitchingWarningBlockProvider, mkf.c bankTransferBeneficiaryBlockProvider, h bankTransferBillDetailsBlockProvider, mkf.l bankTransferFooterLogoBlockProvider, xkf.e bankTransferPaymentBreakdownBlockProvider, r bankTransferReferenceBlockProvider, u bankTransferReferenceFieldsBlockProvider, c0 bankTransferScheduledPaymentBlockProvider, f0 bankTransferTaxDetailsBlockProvider, d0 confirmationBlockProvider, sz5.f directDebitFailedBlockProvider, i0 directDebitRefundBlockProvider, i edtDelayBannerBlockProvider, rhf.d entryPoint, y0 equivalentBlockProvider, k1 fromBlockProvider, o1 getHelpBlockProvider, e84.e groupBillBlockProvider, j incomeSorterBannerBlockProvider, y1 initiatorBlockProvider, d2 invoiceBlockProvider, z3 originalTransactionBlockProvider, x0 payIdItemBlockProvider, dlf.j paymentCounterpartyInfoBlockProvider, q1 paymentsTrackingWidgetBlockProvider, p pixWithdrawAndChangeBlockProvider, o0 postalCheckReceiptBlockProvider, z4 receiptsBlockProvider, b5 refundsBlockProvider, t5 revPointsBlockProvider, z1 scannedBillDetailsFileBlockProvider, h6 securityDelayBlockProvider, clf.a slotBlockProvider, n7 statusWithNoticeBlockProvider, u0 sourceOfFundsBlockProvider, e7 splitBillBlockProvider, i7 statisticsBlockProvider, k7 statusBlockProvider, s7 suspiciousTransactionBlockProvider, j8 ticketBlockProvider, o8 transferReasonBlockProvider, s8 transferReasonCatalogueBlockProvider, w0 ultimateDebtorBlockProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionStatisticsProvider, "transactionStatisticsProvider");
        Intrinsics.checkNotNullParameter(bankTransferHeaderProvider, "bankTransferHeaderProvider");
        Intrinsics.checkNotNullParameter(bankTransferNavbarIconClickHandler, "bankTransferNavbarIconClickHandler");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(uploadReceiptMenuOptionProvider, "uploadReceiptMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(bankTransferActionsProvider, "bankTransferActionsProvider");
        Intrinsics.checkNotNullParameter(directDebitRefundActionProvider, "directDebitRefundActionProvider");
        Intrinsics.checkNotNullParameter(incomeSorterActionProvider, "incomeSorterActionProvider");
        Intrinsics.checkNotNullParameter(loyaltyActionsProvider, "loyaltyActionsProvider");
        Intrinsics.checkNotNullParameter(splitBillActionProvider, "splitBillActionProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(bankAccountSwitchingWarningBlockProvider, "bankAccountSwitchingWarningBlockProvider");
        Intrinsics.checkNotNullParameter(bankTransferBeneficiaryBlockProvider, "bankTransferBeneficiaryBlockProvider");
        Intrinsics.checkNotNullParameter(bankTransferBillDetailsBlockProvider, "bankTransferBillDetailsBlockProvider");
        Intrinsics.checkNotNullParameter(bankTransferFooterLogoBlockProvider, "bankTransferFooterLogoBlockProvider");
        Intrinsics.checkNotNullParameter(bankTransferPaymentBreakdownBlockProvider, "bankTransferPaymentBreakdownBlockProvider");
        Intrinsics.checkNotNullParameter(bankTransferReferenceBlockProvider, "bankTransferReferenceBlockProvider");
        Intrinsics.checkNotNullParameter(bankTransferReferenceFieldsBlockProvider, "bankTransferReferenceFieldsBlockProvider");
        Intrinsics.checkNotNullParameter(bankTransferScheduledPaymentBlockProvider, "bankTransferScheduledPaymentBlockProvider");
        Intrinsics.checkNotNullParameter(bankTransferTaxDetailsBlockProvider, "bankTransferTaxDetailsBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(directDebitFailedBlockProvider, "directDebitFailedBlockProvider");
        Intrinsics.checkNotNullParameter(directDebitRefundBlockProvider, "directDebitRefundBlockProvider");
        Intrinsics.checkNotNullParameter(edtDelayBannerBlockProvider, "edtDelayBannerBlockProvider");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(groupBillBlockProvider, "groupBillBlockProvider");
        Intrinsics.checkNotNullParameter(incomeSorterBannerBlockProvider, "incomeSorterBannerBlockProvider");
        Intrinsics.checkNotNullParameter(initiatorBlockProvider, "initiatorBlockProvider");
        Intrinsics.checkNotNullParameter(invoiceBlockProvider, "invoiceBlockProvider");
        Intrinsics.checkNotNullParameter(originalTransactionBlockProvider, "originalTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(payIdItemBlockProvider, "payIdItemBlockProvider");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInfoBlockProvider, "paymentCounterpartyInfoBlockProvider");
        Intrinsics.checkNotNullParameter(paymentsTrackingWidgetBlockProvider, "paymentsTrackingWidgetBlockProvider");
        Intrinsics.checkNotNullParameter(pixWithdrawAndChangeBlockProvider, "pixWithdrawAndChangeBlockProvider");
        Intrinsics.checkNotNullParameter(postalCheckReceiptBlockProvider, "postalCheckReceiptBlockProvider");
        Intrinsics.checkNotNullParameter(receiptsBlockProvider, "receiptsBlockProvider");
        Intrinsics.checkNotNullParameter(refundsBlockProvider, "refundsBlockProvider");
        Intrinsics.checkNotNullParameter(revPointsBlockProvider, "revPointsBlockProvider");
        Intrinsics.checkNotNullParameter(scannedBillDetailsFileBlockProvider, "scannedBillDetailsFileBlockProvider");
        Intrinsics.checkNotNullParameter(securityDelayBlockProvider, "securityDelayBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(sourceOfFundsBlockProvider, "sourceOfFundsBlockProvider");
        Intrinsics.checkNotNullParameter(splitBillBlockProvider, "splitBillBlockProvider");
        Intrinsics.checkNotNullParameter(statisticsBlockProvider, "statisticsBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(suspiciousTransactionBlockProvider, "suspiciousTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(ticketBlockProvider, "ticketBlockProvider");
        Intrinsics.checkNotNullParameter(transferReasonBlockProvider, "transferReasonBlockProvider");
        Intrinsics.checkNotNullParameter(transferReasonCatalogueBlockProvider, "transferReasonCatalogueBlockProvider");
        Intrinsics.checkNotNullParameter(ultimateDebtorBlockProvider, "ultimateDebtorBlockProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.e = commonDataSource;
        this.f = transactionStatisticsProvider;
        this.f255254g = bankTransferHeaderProvider;
        this.f255255h = bankTransferNavbarIconClickHandler;
        this.i = adjustForAnalyticsMenuOptionProvider;
        this.f255257j = hideTransactionMenuOptionProvider;
        this.k = uploadReceiptMenuOptionProvider;
        this.f255258l = adjustForAnalyticsActionProvider;
        this.f255259m = bankTransferActionsProvider;
        this.f255260n = directDebitRefundActionProvider;
        this.o = incomeSorterActionProvider;
        this.f255261p = loyaltyActionsProvider;
        this.f255262q = splitBillActionProvider;
        this.f255263r = analyticsBlockProvider;
        this.f255264s = bankAccountSwitchingWarningBlockProvider;
        this.f255265t = bankTransferBeneficiaryBlockProvider;
        this.u = bankTransferBillDetailsBlockProvider;
        this.v = bankTransferFooterLogoBlockProvider;
        this.f255266w = bankTransferPaymentBreakdownBlockProvider;
        this.f255267x = bankTransferReferenceBlockProvider;
        this.f255268y = bankTransferReferenceFieldsBlockProvider;
        this.z = bankTransferScheduledPaymentBlockProvider;
        this.A = bankTransferTaxDetailsBlockProvider;
        this.B = confirmationBlockProvider;
        this.C = directDebitFailedBlockProvider;
        this.D = directDebitRefundBlockProvider;
        this.E = edtDelayBannerBlockProvider;
        this.F = entryPoint;
        this.G = equivalentBlockProvider;
        this.H = fromBlockProvider;
        this.I = getHelpBlockProvider;
        this.J = groupBillBlockProvider;
        this.K = incomeSorterBannerBlockProvider;
        this.L = initiatorBlockProvider;
        this.M = invoiceBlockProvider;
        this.N = originalTransactionBlockProvider;
        this.O = payIdItemBlockProvider;
        this.P = paymentCounterpartyInfoBlockProvider;
        this.Q = paymentsTrackingWidgetBlockProvider;
        this.R = pixWithdrawAndChangeBlockProvider;
        this.S = postalCheckReceiptBlockProvider;
        this.T = receiptsBlockProvider;
        this.U = refundsBlockProvider;
        this.V = revPointsBlockProvider;
        this.W = scannedBillDetailsFileBlockProvider;
        this.X = securityDelayBlockProvider;
        this.Y = slotBlockProvider;
        this.Z = statusWithNoticeBlockProvider;
        this.f255250a0 = sourceOfFundsBlockProvider;
        this.f255251b0 = splitBillBlockProvider;
        this.c0 = statisticsBlockProvider;
        this.f255252d0 = statusBlockProvider;
        this.f255253e0 = suspiciousTransactionBlockProvider;
        this.f0 = ticketBlockProvider;
        this.g0 = transferReasonBlockProvider;
        this.f255256h0 = transferReasonCatalogueBlockProvider;
        this.i0 = ultimateDebtorBlockProvider;
        this.j0 = featureToggleInteractor;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.Y.Z2();
        cmf.p pVarC3 = this.X.c3();
        cmf.p pVarZ22 = this.U.Z2();
        cmf.p pVarA = this.G.a();
        cmf.p pVarZ23 = this.f255253e0.Z2();
        cmf.p pVarZ24 = this.K.Z2();
        i iVar = this.E;
        v vVar = new v(((h0) iVar.f182069b).c(), iVar, 20);
        s sVar = new s(5);
        zhm.f0 f0Var = zhm.f0.f322471a;
        cmf.p pVar = new cmf.p(vVar, sVar, f0Var, "EdtDelayBanner");
        jt0.b bVar = this.f255264s;
        cmf.p pVar2 = new cmf.p(new v(((h0) bVar.f178265b).c(), bVar, 15), new chc.c0(23), zhm.u.c((flf.c) bVar.d), "BankAccountSwitchingWarning");
        cmf.p pVarZ25 = this.f0.Z2();
        sz5.f fVar = this.C;
        h0 h0Var = (h0) fVar.f266765a;
        cmf.p pVar3 = new cmf.p(ta6.a.h(h0Var.d(), h0Var.c(), ((m1) fVar.f266766b).a(), new ate.b(fVar, null, 10)), new s(3), zhm.v.k((flf.f) fVar.d, (flf.j) fVar.f, (t) fVar.f266769h), "DirectDebitFailedBlockProvider");
        cmf.p pVarA2 = this.T.a(new rm2.s(7));
        u uVar = this.f255268y;
        cmf.p pVar4 = new cmf.p(new v(uVar.f206274a.c(), uVar, 18), new s(0), f0Var, "BankTransferReferenceFields");
        w0 w0Var = this.i0;
        cmf.p pVar5 = new cmf.p(new v(w0Var.f206278a.c(), w0Var, 23), new s(8), f0Var, "UltimateDebtor");
        cmf.p pVarB3 = this.f255256h0.b3();
        cmf.p pVarA3 = this.Z.a(true);
        cmf.p pVarA4 = this.f255267x.a();
        i0 i0Var = this.D;
        cmf.p pVar6 = new cmf.p(q.Q(i0Var.f206247l.d(), new mk0.f((Continuation) null, i0Var, 2)), new s(4), zhm.u.c(i0Var), "DirectDebitRefund");
        z3 z3Var = this.N;
        cmf.p pVarB32 = z3Var.b3(false);
        cmf.p pVarZ26 = this.Q.Z2();
        u0 u0Var = this.f255250a0;
        cmf.p pVar7 = new cmf.p(new v(u0Var.f206275a.c(), u0Var, 22), new s(7), f0Var, "SourceOfFunds");
        cmf.p pVarA5 = this.f255252d0.a();
        cmf.p pVarA6 = this.L.a();
        h hVar = this.u;
        cmf.p pVar8 = new cmf.p(new v(hVar.f206244a.c(), hVar, 16), new mfl.b(27), f0Var, "BankTransferBillDetails");
        cmf.p pVarZ27 = this.H.Z2();
        cmf.p pVarA7 = this.B.a();
        o0 o0Var = this.S;
        cmf.p pVarA8 = k0.a(pVarA5, pVarA6, pVar8, pVarZ27, pVarA7, new cmf.p(new v(o0Var.f206259a.d(), o0Var, 21), new s(6), zhm.u.c(o0Var.f206261c), "PostalCheckReceipt"));
        cmf.p pVarA9 = this.P.a();
        f0 f0Var2 = this.A;
        cmf.p pVar9 = new cmf.p(new v(f0Var2.f206242a.c(), f0Var2, 19), new s(2), f0Var, "BankTransferTaxDetails");
        cmf.p pVarZ28 = this.V.Z2();
        cmf.p pVarB = this.f255266w.b();
        cmf.p pVarA10 = this.g0.a();
        d2 d2Var = this.M;
        cmf.p pVar10 = new cmf.p(new kh4.f(d2Var.f184637l.f(new x(10)), d2Var, 15), new chc.c0(23), zhm.u.c(d2Var), "Invoice");
        mkf.c cVar = this.f255265t;
        h0 h0Var2 = cVar.f206228a;
        cmf.p pVar11 = new cmf.p(new t38.e(h0Var2.d(), 24, h0Var2.c(), new mk0.f(cVar, (Continuation) null, 1)), new mfl.b(26), f0Var, "BankTransferBeneficiary");
        z1 z1Var = this.W;
        cmf.p pVar12 = new cmf.p(new w1(!((jte.d) z1Var.f306807p).c(PayWithPhotoApi$Toggles$PayWithPhotoTransactionDetailsFileAttachment.f78943c) ? new go.g(null, 2) : new w1(z1Var.f306809r, z1Var, 1), z1Var, 0), new xkf.c(12), zhm.u.c(z1Var), "ScannedBillDetailsFile");
        cmf.p pVarA11 = this.R.a();
        x0 x0Var = this.O;
        cmf.p pVar13 = new cmf.p(new wyd.f(x0Var.f306795a.d(), x0Var, 7), new xkf.c(5), f0Var, "PayIdItem");
        cmf.p pVarB33 = this.f255251b0.b3();
        cmf.p pVarZ29 = this.z.Z2();
        cmf.p pVarA12 = k0.a(this.f255263r.Z2(), this.c0.Z2(this.f));
        rhf.d dVar = rhf.d.PAYMENT_GROUP_WIDGET;
        rhf.d dVar2 = this.F;
        cmf.p pVarC = this.J.c((dVar2 == dVar || dVar2 == rhf.d.PAYMENT_GROUP_DETAILS) ? false : true);
        cmf.p pVarC32 = z3Var.c3(new rm2.s(8));
        TransactionDetailsApi$Toggles$TransactionDetailsKompotLoyalty transactionDetailsApi$Toggles$TransactionDetailsKompotLoyalty = TransactionDetailsApi$Toggles$TransactionDetailsKompotLoyalty.f91961c;
        jte.d dVar3 = (jte.d) this.j0;
        if (dVar3.c(transactionDetailsApi$Toggles$TransactionDetailsKompotLoyalty) || dVar3.c(TransactionDetailsApi$Toggles$TransactionDetailsHorizontalPager.f91960c)) {
            pVarC32 = null;
        }
        cmf.p[] elements = {pVarZ2, pVarC3, pVarZ22, pVarA, pVarZ23, pVarZ24, pVar, pVar2, pVarZ25, pVar3, pVarA2, pVar4, pVar5, pVarB3, pVarA3, pVarA4, pVar6, pVarB32, pVarZ26, pVar7, pVarA8, pVarA9, pVar9, pVarZ28, pVarB, pVarA10, pVar10, pVar11, pVar12, pVarA11, pVar13, pVarB33, pVarZ29, pVarA12, pVarC, pVarC32, this.I.a(), this.v.a()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return h(kotlin.collections.d.L(elements));
    }

    @Override // hmf.b0
    public final Flow b() {
        prl.e eVar = this.f255254g;
        h0 h0Var = (h0) eVar.f239325b;
        return q.q(ta6.a.g(h0Var.d(), h0Var.e(), h0Var.g(), ((t1j.b) eVar.e).i(), new tlf.a(eVar, null)));
    }

    @Override // hmf.b0
    public final s0 c() {
        return this.f255255h;
    }

    @Override // hmf.b0
    public final Flow d() {
        cmf.f fVarZ2 = this.f255258l.Z2();
        cmf.f fVarZ22 = this.f255259m.Z2();
        cmf.f fVarZ23 = this.o.Z2();
        cmf.f fVarZ24 = this.f255262q.Z2();
        m mVar = this.f255260n;
        h0 h0Var = mVar.f127100l;
        cmf.f fVar = new cmf.f(ta6.a.h(h0Var.d(), h0Var.c(), mVar.f127101m.a(), new ekf.l(4, 4, m.class, mVar, "buildActions", "buildActions(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/JuniorDataSource$YouthWalletOwner;)Ljava/util/List;")), zhm.u.c(mVar), "DirectDebitRefundActions");
        cmf.f fVarZ25 = this.f255261p.Z2();
        TransactionDetailsApi$Toggles$TransactionDetailsKompotLoyalty transactionDetailsApi$Toggles$TransactionDetailsKompotLoyalty = TransactionDetailsApi$Toggles$TransactionDetailsKompotLoyalty.f91961c;
        jte.d dVar = (jte.d) this.j0;
        if (dVar.c(transactionDetailsApi$Toggles$TransactionDetailsKompotLoyalty) || dVar.c(TransactionDetailsApi$Toggles$TransactionDetailsHorizontalPager.f91960c)) {
            fVarZ25 = null;
        }
        cmf.f[] elements = {fVarZ2, fVarZ22, fVarZ23, fVarZ24, fVar, fVarZ25};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return f(kotlin.collections.d.L(elements));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.k.a(new rm2.s(9)), this.i.a(), this.f255257j.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
